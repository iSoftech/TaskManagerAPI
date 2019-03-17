package com.iiht.cts.api.boot;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.iiht.cts.api.config.TaskManagerRestfulApiApp;
import com.iiht.cts.api.service.ITaskService;

/**
 * Task Manager Restful API Basic JUnit Mocked Tests
 * 
 * @author Mohamed Yusuff
 */
@RunWith(SpringRunner.class)
@WebMvcTest
public class TaskManagerRestfulApiAppTests {

	private static final String APPLICATION_HAL_JSON = "application/hal+json;charset=UTF-8";

	private MediaType contentType = MediaType.valueOf(APPLICATION_HAL_JSON);
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	ITaskService taskService;
	
	@Before
	public void setUp() {
		// For getAllTasks()
		Mockito.when(taskService.getAllTasks()).thenReturn(Collections.emptyList());
	}
	
	/**
	 * Tests Spring Boot Application Context Loader
	 */
	@Test
    public void testContextLoads() {
    }
	
	/**
	 * Tests Spring Boot Application
	 */
	@Test
	public void testMain() {
		TaskManagerRestfulApiApp.main(new String[] {
				"spring.profiles.active=test"
		});
	}
	
	@Test
	public void testGetAllTasks() throws Exception {
		// Invokes [/tasks] Resource and verifies the Return Response Status is 200 - OK
		// and ContentType is "application/hal+json;charset=UTF-8"
		mockMvc.perform(MockMvcRequestBuilders.get("/tasks")
				.accept(APPLICATION_HAL_JSON)).andExpect(status().isOk())
		.andExpect(content().contentType(contentType));
		// Verifies If taskService.getAllTasks() is invoked at least once
		Mockito.verify(taskService).getAllTasks();
	}
}