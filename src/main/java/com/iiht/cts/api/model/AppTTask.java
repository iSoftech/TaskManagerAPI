package com.iiht.cts.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.hateoas.core.Relation;

/**
 * Task Manager Table for Task Entity Model
 * 
 * @author Mohamed Yusuff
 */
@Entity(name="tasks")
@Relation(collectionRelation = "tasks", value="tasks")
@Table (name="APP_T_TASK")
public class AppTTask implements Serializable {

	/**
	 * Auto Generated Serial Version UID
	 */
	private static final long serialVersionUID = -4750879452574695439L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="APP_SQ_TASK_GEN")
	@SequenceGenerator(name="APP_SQ_TASK_GEN", sequenceName="APP_SQ_TASK_ID", initialValue=1001, allocationSize=1)
	@Column(name="TASK_ID", updatable=false, nullable=false)
	private Long taskId;
	
	@Column(name="TASK_NAME")
	private String taskName;
	
	@Column(name="PRIORITY")
	private Integer priority;
	
	@Column(name="START_DATE")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="END_DATE")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name="ACTIVE")
	private String active;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JoinColumn(name="PARENT_TASK_ID", nullable=false, foreignKey=@ForeignKey(name="APP_FK_TASK_PARENT_TASK_ID"))
	private AppTParentTask parentTask;
	
	/**
	 * No Argument Default Constructor
	 */
	public AppTTask() {
	}

	/**
	 * Argument Constructor to initialize Entity with Values
	 * 
	 * @param taskName
	 * @param priority
	 * @param startDate
	 * @param endDate
	 * @param active
	 * @param parentTask
	 */
	public AppTTask(String taskName, Integer priority, Date startDate, Date endDate, String active,
			AppTParentTask parentTask) {
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
	public AppTParentTask getParentTask() {
		return parentTask;
	}

	/**
	 * @param parentTask the parentTask to set
	 */
	public void setParentTask(AppTParentTask parentTask) {
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
		AppTTask other = (AppTTask) obj;
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
		return "AppTTask [taskId=" + taskId + ", taskName=" + taskName + ", priority=" + priority + ", startDate="
				+ startDate + ", endDate=" + endDate + ", parentTask=" + parentTask + "]";
	}
}