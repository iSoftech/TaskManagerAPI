package com.iiht.cts.api.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.iiht.cts.api.model.AppTTask;
import com.iiht.cts.api.vo.ParentTask;

/**
 * Task Manager Restful API Repository Interface for <tt>/tasks</tt> Resource with CRUD operations implemented
 * with built in {@link JpaRepositry} using MySQL Database
 * 
 * @author Mohamed Yusuff
 */
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource
public interface ITaskRepository extends JpaRepository<AppTTask, Long> {

	/**
	 * Finds a Task by its ParentTask.ParentTaskName with a custom JPQL Query
	 * 
	 * @param parentTaskName refers to an attribute of {@link ParentTask}
	 * @return a <tt>Optional<{@link AppTTask}></tt>
	 */
	@Query("select t from tasks t "
			+ "inner join AppTParentTask p on p.parentTaskId = t.parentTask.parentTaskId "
			+ "where p.parentTaskName = :parentTaskName")
	public Optional<AppTTask> findByParentTask_ParentTaskName(@Param("parentTaskName") String parentTaskName);

	/**
	 * Finds a Task by its TaskName with a custom JPQL Query
	 * 
	 * @param taskName refers to an attribute of {@link AppTTask}
	 * @return a <tt>Optional<{@link AppTTask}></tt>
	 */
	@Query("select t from tasks t "
			+ "where t.taskName = :taskName")
	public Optional<AppTTask> findByName(@Param("taskName") String taskName);

}