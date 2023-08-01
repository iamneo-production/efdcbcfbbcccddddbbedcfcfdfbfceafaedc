package com.examly.springapp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	private TaskServices taskServices;

	@PostMapping("/saveTask")
	public void saveTask(@RequestBody Task task) {
		taskServices.addTask(task);
	}

	@GetMapping("/changeStatus")
	public Task changeStatus(@RequestParam String id, @RequestParam String taskStatus) {
		return taskServices.updateTaskStatus(id, taskStatus);
	}

	@GetMapping("/deleteTask")
	public void deleteTask(@RequestParam String id) {
		taskServices.deleteCourse(id);
	}

	@GetMapping("/alltasks")
	public List<Task> getAllTasks() {
		return taskServices.getAllTasks();
	}

	@GetMapping("/getTask")
	public Task getTask(@RequestParam String taskHolderName) {
		return taskServices.getTask(taskHolderName);
	}

	@GetMapping("/getTasksByHolderName")
	public Task getTasksByHolderName(@RequestParam String taskHolderName) {
		return taskServices.getTask(taskHolderName);
	}
}
