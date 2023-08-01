package com.examly.springapp;

import java.time.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {

	@Id
	private String taskId;
	private String taskHolderName;
	private String taskDate;
	private String taskName;
	private String taskStatus;

	public Task() {

	}

	public Task(String taskId, String taskHolderName, String taskDate, String taskStatus, String taskName) {
		this.taskId = taskId;
		this.taskDate = taskDate;
		this.taskHolderName = taskHolderName;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus2) {
		this.taskStatus = taskStatus2;
	}

	public String getTaskHolderName() {
		return this.taskHolderName;
	}

	public void setTaskHolderName(String tshl) {
		this.taskHolderName = tshl;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String tshl) {
		this.taskName = tshl;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String id) {
		this.taskId = id;
	}

	public void setTaskDate() {
		LocalDate myObj = LocalDate.now();
		this.taskDate = myObj.toString();
	}

	public String getTaskDate() {
		return this.taskDate;
	}

	// getters and setters
}
