/**
 * 
 */
package com.iiht.cts.api.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.iiht.cts.api.exception.TaskResourceExistException;
import com.iiht.cts.api.exception.TaskResourceNotExistException;
import com.iiht.cts.api.exception.TaskTechnicalException;
import com.iiht.cts.api.model.AppTParentTask;
import com.iiht.cts.api.model.AppTTask;
import com.iiht.cts.api.repo.IParentTaskRepository;
import com.iiht.cts.api.repo.ITaskRepository;
import com.iiht.cts.api.service.ITaskService;
import com.iiht.cts.api.vo.ParentTask;
import com.iiht.cts.api.vo.Task;

/**
 * Task Manager Restful API Service Implementation for <tt>/tasks</tt> Resource with CRUD operations.
 * 
 * @author Mohamed Yusuff
 */
@CrossOrigin(origins = "http://localhost:4200")
@Service
public class TaskServiceImpl implements ITaskService {

	// To Log the Error Messages in case of Exceptions
	private static final Logger LOGGER = LoggerFactory.getLogger(TaskServiceImpl.class);

	@Autowired
	private ITaskRepository taskRepository;
	
	@Autowired
	private IParentTaskRepository parentTaskRepository;

	/**
	 * Returns all Tasks
	 * 
	 * @return a list of {@link Task}
	 */
	@Override
	public List<Task> getAllTasks() {
		List<AppTTask> tasks = null;
		List<Task> taskList = null;
		try {
			// Finds all Tasks Entities
			tasks = taskRepository.findAll();
			if (!CollectionUtils.isEmpty(tasks)) {
				taskList = new ArrayList<>(0);
				// Builds Task Details List
				buildTaskDetailsList(tasks, taskList);
			}
		} catch (Exception exc) {
			LOGGER.error("Error occurred when trying to fetch all Tasks", exc);
			throw new TaskTechnicalException(exc.getMessage(), null);
		}
		return taskList;
	}

	/**
	 * Returns requested Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @return a {@link Task} identified by its id
	 */
	@Override
	public Task getTask(Long taskId) {
		Task task = null;		
		try {
			String operation = HttpMethod.GET.name();
			// Validates and Throw Exception for the Existing Resource - Task
			validateExistingResourceAndThrowException(taskId, operation);
			// Retrieves requested Task if present
			AppTTask appTTask = taskRepository.getOne(taskId);
			if (null != appTTask) {
				// Populates Task Details
				task = populateTaskDetails(appTTask);
			}
		} catch (Exception exc) {
			LOGGER.error("Error occurred when trying to fetch Task with TaskId - " + taskId, exc);
			HttpStatus httpStatus = AnnotationUtils.findAnnotation(exc.getClass(), ResponseStatus.class).code();
			throw new TaskTechnicalException(exc.getMessage(), httpStatus);
		}
		return task;
	}

	/**
	 * Adds a new Task
	 * 
	 * @param task refers to a new instance of {@link AppTTask}
	 * @return a newly added {@link AppTTask}
	 */
	@Override
	public Task addTask(Task task) {
		Task newlySavedTask = null;
		try {
			String operation = HttpMethod.POST.name();
			// Validates and Throws Exception for the New Resource - Task
			validateNewResourceAndThrowException(task, operation);
			// Updates the ParentId If not present to avoid creating duplicate Parent Entities
			if (null != task.getParentTask() && null == task.getParentTask().getParentTaskId()
					&& !StringUtils.isEmpty(task.getParentTask().getParentTaskName())) {
				// Finds a Parent Task by Name to determine if it is already exist
				Optional<AppTParentTask> parentTaskEntity = parentTaskRepository
						.findByParentTaskName(task.getParentTask().getParentTaskName());
				if (parentTaskEntity.isPresent()) {
					task.getParentTask().setParentTaskId(parentTaskEntity.get().getParentTaskId());
				} else {
					// Creates New Parent Task
					AppTParentTask appTParentTask = new AppTParentTask();
					appTParentTask.setParentTaskName(task.getParentTask().getParentTaskName());
					appTParentTask = parentTaskRepository.save(appTParentTask);
					task.getParentTask().setParentTaskId(appTParentTask.getParentTaskId());
				}
			}
			// Saves and Returns the Newly Added Task
			AppTTask newTask = populateAndSaveTaskDetails(task, true);
			// Populates the Saved Task Details 
			newlySavedTask = populateTaskDetails(newTask);
		} catch (Exception exc) {
			LOGGER.error("Error occurred when trying to add a new Task", exc);
			HttpStatus httpStatus = AnnotationUtils.findAnnotation(exc.getClass(), ResponseStatus.class).code();
			throw new TaskTechnicalException(exc.getMessage(), httpStatus);
		}
		return newlySavedTask;
	}

	/**
	 * Populates and Saves Task Details
	 * 
	 * @param task
	 * @param isNewTask
	 * @return
	 */
	private AppTTask populateAndSaveTaskDetails(Task task, boolean isNewTask) {
		// Task Details
		AppTTask appTTask = null;
		if (isNewTask) {
			// Creates a new Task Entity
			appTTask = new AppTTask();
			appTTask.setCreatedDate(new Date(System.currentTimeMillis()));
		} else {
			// Retrieves the existing Task Entity 
			appTTask = taskRepository.getOne(task.getTaskId());
			appTTask.setModifiedDate(new Date(System.currentTimeMillis()));
		}
		appTTask.setTaskName(task.getTaskName());
		appTTask.setPriority(task.getPriority());
		appTTask.setStartDate(task.getStartDate());
		appTTask.setEndDate(task.getEndDate());
		appTTask.setActive(task.getActive());
		// Parent Task Details
		AppTParentTask appTParentTask = new AppTParentTask();
		appTParentTask.setParentTaskId(task.getParentTask().getParentTaskId());
		appTParentTask.setParentTaskName(task.getParentTask().getParentTaskName());
		appTTask.setParentTask(appTParentTask);
		return taskRepository.save(appTTask);
	}

	/**
	 * Updates an existing Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @param task refers to an edited instance of {@link AppTTask}
	 * @return an updated {@link AppTTask} identified by its id
	 */
	@Override
	public Task updateTask(Long taskId, Task task) {
		Task modifiedTask = null;
		try {
			String operation = HttpMethod.PUT.name();
			// Validates and Throw Exception for the Existing Resource - Task
			validateExistingResourceAndThrowException(taskId, operation);
			// Sets the requested TaskId
			task.setTaskId(taskId);
			// Updates the ParentId If not present to avoid creating duplicate Parent Entities
			if (null != task.getParentTask() && null == task.getParentTask().getParentTaskId()
					&& !StringUtils.isEmpty(task.getParentTask().getParentTaskName())) {
				// Finds a Parent Task by Name to determine if it is already exist
				Optional<AppTParentTask> parentTaskEntity = parentTaskRepository
						.findByParentTaskName(task.getParentTask().getParentTaskName());
				if (parentTaskEntity.isPresent()) {
					task.getParentTask().setParentTaskId(parentTaskEntity.get().getParentTaskId());
				} else {
					// Creates New Parent Task
					AppTParentTask appTParentTask = new AppTParentTask();
					appTParentTask.setParentTaskName(task.getParentTask().getParentTaskName());
					appTParentTask = parentTaskRepository.save(appTParentTask);
					task.getParentTask().setParentTaskId(appTParentTask.getParentTaskId());
				}
			}
			// Saves and Returns the Updated Task
			AppTTask updatedTask = populateAndSaveTaskDetails(task, false);
			// Populates the Updated Task Details 
			modifiedTask = populateTaskDetails(updatedTask);
		} catch (Exception exc) {
			LOGGER.error("Error occurred when trying to update an existing Task with TaskId - " + taskId, exc);
			HttpStatus httpStatus = AnnotationUtils.findAnnotation(exc.getClass(), ResponseStatus.class).code();
			throw new TaskTechnicalException(exc.getMessage(), httpStatus);
		}
		return modifiedTask;
	}
	
	/**
	 * Deletes an Existing Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 */
	@Override
	public void deleteTask(Long taskId) {
		try {
			String operation = HttpMethod.DELETE.name();
			// Validates and Throw Exception for the Existing Resource - Task
			validateExistingResourceAndThrowException(taskId, operation);
			// Deletes the requested Task by its id if present
			taskRepository.deleteById(taskId);
		} catch (Exception exc) {
			LOGGER.error("Error occurred when trying to delete an existing Task", exc);
			HttpStatus httpStatus = AnnotationUtils.findAnnotation(exc.getClass(), ResponseStatus.class).code();
			throw new TaskTechnicalException(exc.getMessage(), httpStatus);
		}
	}
	
/*	*//**
	 * Ends an Existing Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 *//*
	@Override
	public void endTask(Long taskId) {
		try {
			String operation = HttpMethod.PUT.name();
			// Validates and Throw Exception for the Existing Resource - Task
			validateExistingResourceAndThrowException(taskId, operation);
			// Retrieves a Task by its TaskId
			AppTTask taskEntity = taskRepository.getOne(taskId);
			taskEntity.setActive("N");
			taskEntity.setModifiedDate(new Date(System.currentTimeMillis()));
			// Saves and Returns the updated Task
			taskRepository.save(taskEntity);
		} catch (Exception exc) {
			LOGGER.error("Error occurred when trying to end an existing Task", exc);
			HttpStatus httpStatus = AnnotationUtils.findAnnotation(exc.getClass(), ResponseStatus.class).code();
			throw new TaskTechnicalException(exc.getMessage(), httpStatus);
		}
	}*/

	/**
	 * Validates and Throw Exception for the Existing Resource - Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @param operation refers to attribute of {@link HttpMethod}
	 */
	private void validateExistingResourceAndThrowException(Long taskId, String operation) {
		// Finds a Task by its id to determine if it is present
		Optional<AppTTask> taskEntity = taskRepository.findById(taskId);
		// Throws Resource Not Exist Exception if not present
		if (!taskEntity.isPresent()) {
			throw new TaskResourceNotExistException("The requested Task with Id - " + taskId
					+ " doesn't exist. The requested operation [" + operation + "] cannot be performed.");
		}
	}
	
	/**
	 * Validates and Throws Exception for the New Resource - Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @param operation refers to attribute of {@link HttpMethod}
	 */
	private void validateNewResourceAndThrowException(Task task, String operation) {
		// Finds a Task by Name to determine if it is already exist
		Optional<AppTTask> taskEntity = taskRepository.findByName(task.getTaskName());
		// Throws Resource Exist Exception if the Task already present with 
		// this Name and the ParentTask is same
		if (taskEntity.isPresent()) {
			// Throws Resource Exist Exception if referring to same Resource details
			if (null != taskEntity.get().getParentTask() && null != task.getParentTask()
					&& !StringUtils.isEmpty(task.getParentTask().getParentTaskName())
					&& task.getParentTask().getParentTaskName()
							.equalsIgnoreCase(taskEntity.get().getParentTask().getParentTaskName())) {
				throw new TaskResourceExistException("A Task with the name - '" + task.getTaskName()
						+ "' is already exist for the given parent task - " + task.getParentTask().getParentTaskName()
						+ ". " + "The requested operation [" + operation + "] cannot be performed.");
			}
		}
	}

	/**
	 * Builds Task Details List
	 * 
	 * @param tasks
	 * @param taskList
	 */
	private void buildTaskDetailsList(List<AppTTask> tasks, List<Task> taskList) {
		for (AppTTask appTTask : tasks) {
			taskList.add(populateTaskDetails(appTTask));
		}
	}

	/**
	 * Populates Task Details
	 * 
	 * @param appTTask
	 */
	private Task populateTaskDetails(AppTTask appTTask) {
		Task task = new Task();
		task.setTaskId(appTTask.getTaskId());
		task.setTaskName(appTTask.getTaskName());
		task.setPriority(appTTask.getPriority());
		task.setStartDate(appTTask.getStartDate());
		task.setEndDate(appTTask.getEndDate());
		task.setActive(appTTask.getActive());
		task.setCreatedDate(appTTask.getCreatedDate());
		task.setModifiedDate(appTTask.getModifiedDate());
		if (null != appTTask.getParentTask()) {
			ParentTask parentTask = new ParentTask();
			parentTask.setParentTaskId(appTTask.getParentTask().getParentTaskId());
			parentTask.setParentTaskName(appTTask.getParentTask().getParentTaskName());
			task.setParentTask(parentTask);
		}
		return task;
	}	
}