package com.iiht.cts.api.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Parent Task Table Value Object
 * 
 * @author Mohamed Yusuff
 */
public class ParentTask {
	
	private Long parentTaskId;
	
	private String parentTaskName;
	
	@JsonIgnore
	private List<Task> tasks;

	
	/**
	 * No Argument Default Constructor
	 */
	public ParentTask() {
	}

	/**
	 * Argument Constructor to initialize VO with Values
	 * 
	 * @param parentTaskId
	 * @param parentTaskName
	 */
	public ParentTask(Long parentTaskId, String parentTaskName) {
		this.parentTaskId = parentTaskId;
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
	public List<Task> getTasks() {
		return tasks;
	}
	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<Task> tasks) {
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
		ParentTask other = (ParentTask) obj;
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
		return "ParentTask [parentTaskId=" + parentTaskId + ", parentTaskName=" + parentTaskName + "]";
	}
}