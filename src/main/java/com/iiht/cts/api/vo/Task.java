package com.iiht.cts.api.vo;

import java.util.Date;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Task Table Value Object
 * 
 * @author Mohamed Yusuff
 */
@Relation(collectionRelation = "tasks")
public class Task extends ResourceSupport {

	@JsonIgnore
	private Long taskId;
	
	private String taskName;
	
	private Integer priority;
	
	private Date startDate;
	
	private Date endDate;
	
	private String active;
	
	private ParentTask parentTask;
	
	/**
	 * No Argument Default Constructor
	 */
	public Task() {
	}

	/**
	 * Argument Constructor to initialize Entity with Values
	 * 
	 * @param taskId
	 * @param taskName
	 * @param priority
	 * @param startDate
	 * @param endDate
	 * @param active
	 * @param parentTask
	 */
	public Task(Long taskId, String taskName, Integer priority, Date startDate, Date endDate, String active,
			ParentTask parentTask) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.priority = priority;
		this.startDate = startDate != null ? (Date) startDate.clone() : null;
		this.endDate = endDate != null ? (Date) endDate.clone() : null;
		this.active = active;
		this.parentTask = parentTask;
	}

	/**
	 * @return the taskId
	 */
	public Long getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate != null ? (Date) startDate.clone() : null;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate != null ? (Date) startDate.clone() : null;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate != null ? (Date) endDate.clone() : null;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate != null ? (Date) endDate.clone() : null;
	}

	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}
	
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return this.active.equalsIgnoreCase("Y") ? true : false;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}
	
	/**
	 * @return the parentTask
	 */
	public ParentTask getParentTask() {
		return parentTask;
	}

	/**
	 * @param parentTask the parentTask to set
	 */
	public void setParentTask(ParentTask parentTask) {
		this.parentTask = parentTask;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((parentTask == null) ? 0 : parentTask.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (parentTask == null) {
			if (other.parentTask != null)
				return false;
		} else if (!parentTask.equals(other.parentTask))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (taskName == null) {
			if (other.taskName != null)
				return false;
		} else if (!taskName.equals(other.taskName))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", priority=" + priority + ", startDate="
				+ startDate + ", endDate=" + endDate + ", parentTask=" + parentTask + "]";
	}
}