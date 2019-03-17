package com.iiht.cts.api.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.iiht.cts.api.model.AppTTask;
import com.iiht.cts.api.service.ITaskService;
import com.iiht.cts.api.vo.Task;

/**
 * Task Manager Restful API Controller for <tt>/tasks</tt> Resource with CRUD operations.
 * 
 * @author Mohamed Yusuff
 */
@RequestMapping(value="/tasks", produces="application/hal+json")
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
	 * {@code Response 200 (application/hal+json)}
	 * 	
	 *	{
	 *	    "_embedded": {
	 *	        "tasks": [
	 *	            {
	 *	                "taskName": "Task 1",
	 *	                "priority": 10,
	 *	                "startDate": "2018-12-01",
	 *					"endDate": "2018-12-31",
	 *					"active": "Y",
	 *	                "parentTask": {
	 *	                    "parentTaskId": 1001,
	 *	                    "ParentTaskName": "Parent Task 1"
	 *	                },
	 *	                "_links": {
	 *	                    "self": {
	 *	                        "href": "http://localhost:8080/TaskManager/api/tasks/1001"
	 *	                    }
	 *                  }
	 *	            }
	 *	        ]
	 *	    },
	 *	    "_links": {
	 *	        "self": {
	 *	            "href": "http://localhost:8080/TaskManager/api/tasks"
	 *	        }
	 *	    }
	 *	}
	 * </pre>
	 * 
	 * @return a list of {@link AppTTask} with Response Status as 200 OK
	 */
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Resources<Task>> getAllTasks() {
		// Retrieves All Tasks details
		List<Task> allTasks = taskService.getAllTasks();
		// Iterates through all tasks details to set Self Link to individual Task
	    for (Task task : allTasks) {
	        // Self Link to newly added Task resource [/tasks/{taskId}]
	        Link selfLink = linkTo(TaskResource.class).slash(task.getTaskId()).withSelfRel();
	        task.add(selfLink);
	    }
	    // Populates All Links for parent Tasks
	    Links allLinks = populateLinks(null);
		// Initialises HATEOAS Resource for newly added Task Resource with list of Links
		Resources<Task> result = new Resources<Task>(allTasks, allLinks);
		// Returns the ResponseEntity with HTTPStatus as OK {200}
		return ResponseEntity.ok(result);
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
	 * {@code Response 201 (application/hal+json)}
	 * 
	 *   {
	 *	     "taskName": "Task 1",
	 *	     "priority": 10,
	 *	     "startDate": "2018-12-01",
	 *		 "endDate": "2018-12-31",
	 *	     "parentTask": {
	 *			"parentTaskId": 1001
	 *			"ParentTaskName": "Parent Task 1"
	 *	     },
	 *	     "_links": {
	 *	         "tasks": {
	 *	             "href": "http://localhost:8086/TaskManager/api/tasks"
	 *	         }
	 *	         "self": {
	 *	             "href": "http://localhost:8086/TaskManager/api/tasks/1001"
	 *	         }
	 *	     }
	 *   }
	 * </pre>
	 * 
	 * @param task refers to a new instance of {@link AppTTask}
	 * @return a newly added {@link AppTTask} with Response Status as 201 Created
	 */
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Resource<Task>> addTask(@RequestBody Task task) {
		// Adds and Returns newly added Task details
		Task savedTask = taskService.addTask(task);
		// Populates All Links for Task and Tasks
	    Links allLinks = populateLinks(savedTask.getTaskId());
		// Initialises HATEOAS Resource for newly added Task Resource with list of Links
		Resource<AppTTask> resource = new Resource<AppTTask>(savedTask, allLinks);
		// URI Builder to build newly created resource location
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{taskId}")
				.buildAndExpand(savedTask.getTaskId()).toUri();
		// Returns the ResponseEntity with HTTPStatus as Created {201}
		return ResponseEntity.created(location).body(resource);
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
	 * {@code Response 200 (application/hal+json)}
	 * 	
	 *   {
	 *   	 "taskId": 1001,
	 *	     "taskName": "Task 1",
	 *	     "priority": 15,
	 *	     "startDate": "2018-12-01",
	 *		 "endDate": "2018-12-31",
	 *	     "parentTask": {
	 *			"parentTaskId": 1001,
	 *			"ParentTaskName": "Parent Task 1"
	 *	     },
	 *	     "_links": {
	 *	         "tasks": {
	 *	             "href": "http://localhost:8086/TaskManager/api/tasks"
	 *	         }
	 *	         "self": {
	 *	             "href": "http://localhost:8086/TaskManager/api/tasks/1001"
	 *	         }
	 *	     }
	 *   }
	 * </pre>
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @return a single {@link AppTTask} identified by its id with Response Status as 200 OK
	 */
	@RequestMapping(value="/{taskId}", method=RequestMethod.GET)
	public ResponseEntity<Resource<AppTTask>> getTask(@PathVariable Long taskId) {
		// Retrieves requested Task details
		AppTTask task = taskService.getTask(taskId);
		// Populates All Links for Task and Tasks
	    Links allLinks = populateLinks(taskId);
		// Initialises HATEOAS Resource for requested Task Resource with list of Links
		Resource<AppTTask> resource = new Resource<AppTTask>(task, allLinks);
		// Returns the ResponseEntity with HTTPStatus as OK {200}
		return ResponseEntity.ok(resource);
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
	 * {@code Response 201 (application/hal+json)}
	 * 
	 *   {
	 *   	 "taskId": 1001,
	 *	     "taskName": "Task 1",
	 *	     "priority": 15,
	 *	     "startDate": "2018-12-01",
	 *		 "endDate": "2018-12-31",
	 *	     "parentTask": {
	 *			"ParentTaskName": "Parent Task 1"
	 *	     },
	 *	     "_links": {
	 *	         "tasks": {
	 *	             "href": "http://localhost:8086/TaskManager/api/tasks"
	 *	         }
	 *	         "self": {
	 *	             "href": "http://localhost:8086/TaskManager/api/tasks/1001"
	 *	         }
	 *	     }
	 *   }
	 * </pre>
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @param task refers to an edited instance of {@link AppTTask}
	 * @return an updated {@link AppTTask} identified by its id with Response Status as 201 Created
	 */
	@RequestMapping(value="/{taskId}", method=RequestMethod.PUT)
	public ResponseEntity<Resource<AppTTask>> updateTask(@PathVariable Long taskId,
			@RequestBody AppTTask task) {
		// Updates and Returns edited Task details
		AppTTask updatedTask = taskService.updateTask(taskId, task);
		// Populates All Links for Task and Tasks
	    Links allLinks = populateLinks(taskId);
		// Initialises HATEOAS Resource for updated Task Resource with list of Links
		Resource<AppTTask> resource = new Resource<AppTTask>(updatedTask, allLinks);
		// URI Builder to build updated resource location
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.buildAndExpand(updatedTask.getTaskId()).toUri();
		// Returns the ResponseEntity with HTTPStatus as Created {201}
		return ResponseEntity.created(location).body(resource);
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
	
	/**
	 * Populates and Returns All Links for Task, and Tasks
	 * 
	 * @param taskId refers to attribute {@code taskId}
	 * @return {@link Links} of Parent Links for this class
	 */
	private Links populateLinks(Long taskId) {
		// Parent Link to All Tasks Resource [/tasks]
		Link tasksLink = linkTo(methodOn(this.getClass()).getAllTasks()).withSelfRel();
		// Creates All Links with tasksLink
		Links allLinks = new Links(tasksLink);
		// Updates Links for Single Resource Result
		if (null != taskId) {
			// Self Link to newly added or update or retrieved Task Resource [/tasks/{taskId}]
			Link selfLink = linkTo(methodOn(this.getClass()).getTask(taskId)).withSelfRel();
			// Updates Tasks Link label to "tasks" when Task Link is referred as "self"
			tasksLink = tasksLink.withRel("tasks");
			// Creates All Links with tasksLink, and taskLink
			allLinks = new Links(tasksLink, selfLink);
		}
		return allLinks;
	}
}