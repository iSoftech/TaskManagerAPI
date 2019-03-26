package com.iiht.cts.api.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.iiht.cts.api.service.ITaskService;
import com.iiht.cts.api.vo.Task;
import com.iiht.cts.api.vo.TaskResponse;

/**
 * Task Manager Restful API Controller for <tt>/tasks</tt> Resource with CRUD operations.
 * 
 * @author Mohamed Yusuff
 */
@RequestMapping(value="/tasks", produces="application/json")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TaskResource {

	@Autowired
	private ITaskService taskService;
	
	/**
	 * <strong>Lists all Task Entities [<tt>GET</tt>]</strong>
	 * <br>
	 * Returns all <tt>Tasks</tt> available in the system with <tt>GET</tt> method
	 * for resource {@code /tasks}.
	 * 
	 * <pre>
	 * {@code Response 200 (application/json)}
	 * 	
	 *	{
	 *	    "statusCode": 200,
	 *	    "message": "Tasks retrieved!!",
	 *	    "response": [
	 *	        {
	 *				"taskId": 1001,
	 *	            "taskName": "Task 1",
	 *	            "priority": 10,
	 *	            "startDate": "2018-12-01",
	 *				"endDate": "2018-12-31",
	 *				"active": "Y",
	 *	            "parentTask": {
	 *	                 "parentTaskId": 1001,
	 *	                 "ParentTaskName": "Parent Task 1"
	 *	            }
	 *	        }
	 *	    ]
	 *	}
	 * </pre>
	 * 
	 * @return a list of {@link Task} with Response Status as 200 OK
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<TaskResponse<List<Task>>> getAllTasks() {
		// Retrieves All Tasks details
		List<Task> allTasks = taskService.getAllTasks();
		// Prepares Task Response with HTTPStatus as OK {200}
		TaskResponse<List<Task>> taskResponse = (TaskResponse<List<Task>>) TaskResponse
				.getInstance(HttpStatus.OK.value(), "Tasks retrieved!!", allTasks);
		// Returns the ResponseEntity with HTTPStatus as OK {200}
		return ResponseEntity.ok(taskResponse);
	}

	/**
	 * <strong>Creates a Task Entity [<tt>POST</tt>]</strong>
	 * <br>
	 * Adds a new <tt>Task</tt> details with <tt>POST</tt> method.
	 * 
	 * <pre>
	 * {@code Request (application/json)}
	 * 	
	 *   {
	 *	     "taskName": "Task 1",
	 *	     "priority": 10,
	 *	     "startDate": "2018-12-01",
	 *		 "endDate": "2018-12-31",
	 *	     "parentTask": {
	 *	    	"ParentTaskName": "Parent Task 1"
	 *		 }
	 *   }
	 *   
	 * {@code Response 201 (application/json)}
	 * 
	 *   {
     *		"statusCode": 201,
     *		"message": "Task Created!!",
     *		"response": {
	 *	     	"taskName": "Task 1",
	 *	     	"priority": 10,
	 *	     	"startDate": "2018-12-01",
	 *		 	"endDate": "2018-12-31",
	 *			"active": "Y",
	 *	     	"parentTask": {
	 *				"parentTaskId": 1001
	 *				"ParentTaskName": "Parent Task 1"
	 *			}
	 *  	}
	 *   }
	 * </pre>
	 * 
	 * @param task refers to a new instance of {@link Task}
	 * @return a newly added {@link Task} with Response Status as 201 Created
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<TaskResponse<Task>> addTask(@RequestBody Task task) {
		// Adds and Returns newly added Task details
		Task savedTask = taskService.addTask(task);
		// URI Builder to build newly created resource location
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{taskId}")
				.buildAndExpand(savedTask.getTaskId()).toUri();
		// Prepares Task Response with HTTPStatus as Created {201}
		TaskResponse<Task> taskResponse = (TaskResponse<Task>) TaskResponse
				.getInstance(HttpStatus.CREATED.value(), "Task Created!!", savedTask);
		// Returns the ResponseEntity with HTTPStatus as Created {201}
		return ResponseEntity.created(location).body(taskResponse);
	}
	
	/**
	 * <strong>Views a Task Entity [<tt>GET</tt>]</strong>
	 * <br>
	 * Returns a <tt>Task</tt> available in the system identified by its <tt>{id}</tt> with
	 * <tt>GET</tt> method.
	 * 
	 * <pre>
	 * {@code Request}
	 * 
	 * 	Headers
	 * 		Location: /tasks/1001
	 * 
	 * {@code Response 200 (application/json)}
	 * 	
	 *  {
	 *		"statusCode": 200,
	 *		"message": "Task Retrieved!!",
	 *		"response": {
	 *   	 	"taskId": 1001,
	 *	    	"taskName": "Task 1",
	 *	    	"priority": 15,
	 *	    	"startDate": "2018-12-01",
	 *			"endDate": "2018-12-31",
	 *			"active": "Y",
	 *	    	"parentTask": {
	 *				"parentTaskId": 1001,
	 *				"ParentTaskName": "Parent Task 1"
	 *	    	}
	 *  	}
	 *  }
	 * </pre>
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @return a single {@link Task} identified by its id with Response Status as 200 OK
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/{taskId}", method=RequestMethod.GET)
	public ResponseEntity<TaskResponse<Task>> getTask(@PathVariable Long taskId) {
		// Retrieves requested Task details
		Task task = taskService.getTask(taskId);
		// Prepares Task Response with HTTPStatus as OK {200}		
		TaskResponse<Task> taskResponse = (TaskResponse<Task>) TaskResponse
				.getInstance(HttpStatus.OK.value(), "Tasks Retrieved!!", task);
		// Returns the ResponseEntity with HTTPStatus as OK {200}
		return ResponseEntity.ok(taskResponse);
	}

	/**
	 * <strong>Updates a Task Entity [<tt>PUT</tt>]</strong>
	 * <br>
	 * Updates an existing <tt>Task</tt> details identified by its
	 * <tt>{id}</tt> with <tt>PUT</tt> method.
	 * 
	 * <pre>
	 * {@code Request (application/json)}
	 * 	
	 * 	Headers
	 * 		Location: /tasks/1001
	 * 	Body
	 *	    {
	 *	     	"taskName": "Task 1",
	 *	     	"priority": 15,
	 *	     	"startDate": "2018-12-01",
	 *		 	"endDate": "2018-12-31",
	 *	     	"parentTask": {
	 *				"ParentTaskName": "Parent Task 1"
	 *	     	}
	 *	    }
	 * {@code Response 201 (application/json)}
	 * 
	 *  {
	 *		"statusCode": 201,
	 *		"message": "Task Updated!!",
	 *		"response": {
	 *   	 	"taskId": 1001,
	 *	     	"taskName": "Task 1",
	 *	     	"priority": 15,
	 *	     	"startDate": "2018-12-01",
	 *		 	"endDate": "2018-12-31",
	 *		 	"active": "Y",
	 *	     	"parentTask": {
	 *				"parentTaskId": 1001,
	 *				"ParentTaskName": "Parent Task 1"
	 *	     	}
	 *   	}
	 *  }
	 * </pre>
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @param task refers to an edited instance of {@link Task}
	 * @return an updated {@link Task} identified by its id with Response Status as 201 Created
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/{taskId}", method=RequestMethod.PUT)
	public ResponseEntity<TaskResponse<Task>> updateTask(@PathVariable Long taskId,
			@RequestBody Task task) {
		// Updates and Returns edited Task details
		Task updatedTask = taskService.updateTask(taskId, task);
		// URI Builder to build updated resource location
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.buildAndExpand(updatedTask.getTaskId()).toUri();
		// Prepares Task Response with HTTPStatus as Created {201}
		TaskResponse<Task> taskResponse = (TaskResponse<Task>) TaskResponse
				.getInstance(HttpStatus.CREATED.value(), "Task Updated!!", updatedTask);
		// Returns the ResponseEntity with HTTPStatus as Created {201}
		return ResponseEntity.created(location).body(taskResponse);
	}
	
	/**
	 * <strong>Deletes a Task Entity [<tt>DELETE</tt>]</strong>
	 * <br>
	 * Deletes an existing <tt>Task</tt> details identified by its
	 * <tt>{id}</tt> with <tt>DELETE</tt> method.
	 * 
	 * <pre>
	 * {@code Request}
	 * 
	 * 	Headers
	 * 		Location: /tasks/1001
	 * 
	 * {@code Response 204}
	 * </pre>
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 */
	@RequestMapping(value="/{taskId}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public HeadersBuilder<?> deleteTask(@PathVariable Long taskId) {
		// Deletes the requested Task Resource with Response HTTPStatus as No Content {204}
		taskService.deleteTask(taskId);
		return ResponseEntity.noContent();
	}
}