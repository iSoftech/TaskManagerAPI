package com.iiht.cts.api.resource;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iiht.cts.api.config.TaskManagerRestfulApiApp;
import com.iiht.cts.api.model.AppTParentTask;
import com.iiht.cts.api.model.AppTTask;
import com.iiht.cts.api.service.ITaskService;

/**
 * Bayzat Benefits Restful API Integration Tests for Task Resource Controller
 * 
 * @author Mohamed Yusuff
 */
@RunWith(SpringRunner.class)
@SpringBootTest (
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes = {TaskManagerRestfulApiApp.class, TaskResource.class}
)
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application-test.properties")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TaskResourceTests {
	
	// Context Path pointing to [/tasks]
	private static final String CONTEXT_PATH = "/tasks";

	private static final String SLASH = "/";

	private static final String APPLICATION_JSON = "application/json;charset=UTF-8";

	private MediaType contentType = MediaType.valueOf(APPLICATION_JSON);
	
	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	ITaskService taskService;
	
	private AppTTask task = null;
	
	
	@Before
	public void setUp() {
		// Task
		task = new AppTTask();
		task.setTaskId(Long.valueOf(1001));
		task.setTaskName("Task 1");
		// ParentTask
		AppTParentTask parentTask = new AppTParentTask();
		parentTask.setParentTaskId(Long.valueOf(1001));
		parentTask.setParentTaskName("Parent Task 1");
		task.setParentTask(parentTask);
	}
	
	
	/**
	 * Tests Create a Task
	 * 
	 * @throws Exception
	 */
	@Test
	public void a_testCreateTask() throws Exception {
		// Invokes [/tasks] Resource with ContentType as "application/json;charset=UTF-8" and verifies the
		// Return Response Status is 201 - CREATED and ContentType as "application/json;charset=UTF-8"
		task.setTaskId(Long.valueOf(1010));
		task.setTaskName("Task 10");
		task.getParentTask().setParentTaskId(null);
		this.mockMvc
				.perform(post(CONTEXT_PATH).contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
						.content(new ObjectMapper().writeValueAsString(task)))
				.andExpect(status().isCreated()).andExpect(content().contentType(contentType));
	}
	
	/**
	 * Tests Create a Task Already Exist with Same ParentTask
	 * 
	 * @throws Exception
	 */
	@Test
	public void b_testCreateTaskAlreadyExistWithSameParentTask() throws Exception {
		// Invokes [/tasks] Resource with ContentType as "application/json;charset=UTF-8" and verifies the
		// Return Response Status is 409 - CONFLICT
		this.mockMvc.perform(post(CONTEXT_PATH).contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
				.content(new ObjectMapper().writeValueAsString(task))).andExpect(status().isConflict());
	}
	
	/**
	 * Tests All Tasks Found
	 * 
	 * @throws Exception
	 */
	@Test
	public void c_testGetAllTasksFound() throws Exception {
		// Invokes [/tasks] Resource and verifies the Return Response Status is 200 - OK
		// and ContentType is "application/json;charset=UTF-8"
		mockMvc.perform(get(CONTEXT_PATH)).andExpect(status().isOk())
				.andExpect(content().contentType(contentType));
	}
	
	/**
	 * Tests Get All Tasks Invalid Resource
	 * 
	 * @throws Exception
	 */
	@Test
	public void d_testGetAllTasksInvalidResource() throws Exception {
		// Invokes [/tasks] Resource and verifies the Return Response Status is 404 - NOT_FOUND
		mockMvc.perform(get("/tasksTestResource"))
				.andExpect(status().isNotFound());
	}
	
	/**
	 * Tests Get a Task
	 * 
	 * @throws Exception
	 */
	@Test
	public void e_testGetTask() throws Exception {
		// Invokes [/tasks/{taskId}] Resource and verifies the Return Response Status is 200 - OK
		// and ContentType is "application/json;charset=UTF-8" and Details are same
		mockMvc.perform(get(CONTEXT_PATH + SLASH + task.getTaskId()))
				.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JSON))
				.andExpect(jsonPath("$.response.taskName", is((task.getTaskName()))))
				.andExpect(jsonPath("$.response.parentTask.parentTaskName", is((task.getParentTask().getParentTaskName()))));
	}
	
	/**
	 * Tests Get a Task Not Found
	 * 
	 * @throws Exception
	 */
	@Test
	public void f_testGetTaskNotFound() throws Exception {
		// Invokes [/tasks/{taskId}] Resource and verifies the Return Response Status is 404 - NOT_FOUND
		mockMvc.perform(get(CONTEXT_PATH + SLASH + Long.valueOf(5001)))
				.andExpect(status().isNotFound()).andExpect(content().contentType(contentType));
	}
	
	/**
	 * Tests Get a Task for Invalid Argument
	 * 
	 * @throws Exception
	 */
	@Test
	public void g_testGetTaskInvalidArgument() throws Exception {
		// Invokes [/tasks/{taskId}] Resource and verifies the Return Response Status is 400 - BAD_REQUEST
		// and ContentType is "application/json;charset=UTF-8"
		mockMvc.perform(get("/tasks/testArg")).andExpect(status().isBadRequest());
	}
	
	/**
	 * Tests Update a Task
	 * 
	 * @throws Exception
	 */
	@Test
	public void h_testUpdateTask() throws Exception {
		// Invokes [/tasks/{taskId}] Resource with ContentType as "application/json;charset=UTF-8" and
		// verifies the Return Response Status is 201 - CREATED, ContentType is "application/json;charset=UTF-8" and
		// Details are same
		// To get this updated through Business Logic
		task.getParentTask().setParentTaskId(null);
		this.mockMvc
				.perform(put(CONTEXT_PATH + SLASH + task.getTaskId()).contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
						.content(new ObjectMapper().writeValueAsString(task)))
				.andExpect(status().isCreated()).andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.response.taskName", is((task.getTaskName()))))
				.andExpect(jsonPath("$.response.parentTask.parentTaskName", is((task.getParentTask().getParentTaskName()))));
	}
	
	/**
	 * Tests Update a Task Not Exist
	 * 
	 * @throws Exception
	 */
	@Test
	public void i_testUpdateTaskNotExist() throws Exception {
		// Invokes [/tasks/{taskId}] Resource with ContentType as "application/json;charset=UTF-8" and
		// verifies the Return Response Status is 404 - NOT_FOUND
		this.mockMvc.perform(put(CONTEXT_PATH + SLASH + Long.valueOf(5001)).contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
				.content(new ObjectMapper().writeValueAsString(task))).andExpect(status().isNotFound());
	}
	
	/**
	 * Tests Delete a Task
	 * 
	 * @throws Exception
	 */
	@Test
	public void j_testDeleteTask() throws Exception {
		// Invokes [/tasks/{taskId}] Resource and verifies the Return Response Status is 204 - NO_CONTENT
		mockMvc.perform(delete(CONTEXT_PATH + SLASH + task.getTaskId())).andExpect(status().isNoContent());
	}
	
	/**
	 * Tests Delete a Task Not Found
	 * 
	 * @throws Exception
	 */
	@Test
	public void k_testDeleteTaskNotFound() throws Exception {
		// Invokes [/tasks/{taskId}] Resource and verifies the Return Response Status is 404 - NOT_FOUND
		mockMvc.perform(delete(CONTEXT_PATH + SLASH + Long.valueOf(5001))).andExpect(status().isNotFound());
	}
}