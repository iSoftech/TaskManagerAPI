/**
 * 
 */
package com.iiht.cts.api.resource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.iiht.cts.api.config.TaskManagerRestfulApiAppTests;

/**
 * Task Manager Restful API Integration Test Suits for All Resources Tests Class
 * 
 * @author Mohamed Yusuff
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TaskManagerRestfulApiAppTests.class,
	RootResourceTests.class,
    TaskResourceTests.class
})
public class AllResourceTests {
}
