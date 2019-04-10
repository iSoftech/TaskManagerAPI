package com.iiht.cts.api.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iiht.cts.api.model.AppTParentTask;

/**
 * Task Manager Restful API Repository Interface for <tt>/tasks</tt> Resource with CRUD operations implemented
 * with built in {@link JpaRepositry} using MySQL Database
 * 
 * @author Mohamed Yusuff
 */
@RepositoryRestResource
public interface IParentTaskRepository extends JpaRepository<AppTParentTask, Long> {

	/**
	 * Finds a ParentTask by its ParentTaskName with a custom JPQL Query
	 * 
	 * @param parentTaskName refers to an attribute of {@link AppTParentTask}
	 * @return a <tt>Optional<{@link AppTParentTask}></tt>
	 */
	@Query("select p from AppTParentTask p "
			+ "where p.parentTaskName = :parentTaskName")
	public Optional<AppTParentTask> findByParentTaskName(@Param("parentTaskName") String parentTaskName);
	
}