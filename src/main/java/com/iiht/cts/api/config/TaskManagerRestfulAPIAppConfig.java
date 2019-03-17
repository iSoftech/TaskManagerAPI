package com.iiht.cts.api.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Task Manager Restful API Spring Boot Application Configuration
 * 
 * @author Mohamed Yusuff
 */
@Configuration
@EntityScan("com.iiht.cts.api.model")
@EnableJpaRepositories("com.iiht.cts.api.repo")
@EnableTransactionManagement
public class TaskManagerRestfulAPIAppConfig {

}
