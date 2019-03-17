package com.iiht.cts.api.service;

import java.util.List;

import com.iiht.cts.api.vo.Task;

/**
 * Task Manager Restful API Service Interface for <tt>/tasks</tt> Resource with CRUD operations.
 * 
 * @author Mohamed Yusuff
 */
public interface ITaskService {

	/**
	 * Returns all Tasks
	 * 
	 * @return a list of {@link Task}
	 */
	public List<Task> getAllTasks();
	
	/**
	 * Returns requested Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @return a {@link Task} identified by its id
	 */
	public Task getTask(Long taskId);
	
	/**
	 * Adds a new Task
	 * 
	 * @param task refers to a new instance of {@link Task}
	 * @return a newly added {@link Task}
	 */
	public Task addTask(Task task);
	
	/**
	 * Updates an existing Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @param task refers to an edited instance of {@link Task}
	 * @return an updated {@link Task} identified by its id
	 */
	public Task updateTask(Long taskId, Task task);
	
	/**
	 * Deletes an Existing Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 */
	public void deleteTask(Long taskId);

	/**
	 * Ends an Existing Task
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 */
	public void endTask(Long taskId);
}
