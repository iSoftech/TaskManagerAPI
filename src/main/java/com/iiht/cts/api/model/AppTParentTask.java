package com.iiht.cts.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Task Manager Table for Parent Task Entity Model
 * 
 * @author Mohamed Yusuff
 */
@Entity
@Table (name="APP_T_PARENT_TASK")
public class AppTParentTask extends ResourceSupport implements Serializable {
	
	/**
	 * Auto Generated Serial Version UID
	 */
	private static final long serialVersionUID = 955728933773177338L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="APP_SQ_PARENT_TASK_GEN")
	@SequenceGenerator(name="APP_SQ_PARENT_TASK_GEN", sequenceName="APP_SQ_PARENT_TASK_ID", initialValue=1001, allocationSize=1)
	@Column(name="PARENT_TASK_ID", updatable=false, nullable=false)
	private Long parentTaskId;
	
	@Column(name="PARENT_TASK_NAME")
	private String parentTaskName;
	
	@JsonIgnore
	@OneToMany(mappedBy="parentTask", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<AppTTask> tasks;

	
	/**
	 * No Argument Default Constructor
	 */
	public AppTParentTask() {
	}

	/**
	 * Argument Constructor to initialize Entity with Values
	 * 
	 * @param parentTaskName
	 */
	public AppTParentTask(String parentTaskName) {
		this.parentTaskName = parentTaskName;
	}
	
	/**
	 * @return the parentTaskId
	 */
	public Long getParentTaskId() {
		return parentTaskId;
	}
	/**
	 * @param parentTaskId the parentTaskId to set
	 */
	public void setParentTaskId(Long parentTaskId) {
		this.parentTaskId = parentTaskId;
	}
	/**
	 * @return the parentTaskName
	 */
	public String getParentTaskName() {
		return parentTaskName;
	}
	/**
	 * @param parentTaskName the name to set
	 */
	public void setParentTaskName(String parentTaskName) {
		this.parentTaskName = parentTaskName;
	}
	/**
	 * @return the tasks
	 */
	public List<AppTTask> getTasks() {
		return tasks;
	}
	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<AppTTask> tasks) {
		this.tasks = tasks;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parentTaskName == null) ? 0 : parentTaskName.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppTParentTask other = (AppTParentTask) obj;
		if (parentTaskName == null) {
			if (other.parentTaskName != null)
				return false;
		} else if (!parentTaskName.equals(other.parentTaskName))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AppTParentTask [parentTaskId=" + parentTaskId + ", parentTaskName=" + parentTaskName + "]";
	}
}