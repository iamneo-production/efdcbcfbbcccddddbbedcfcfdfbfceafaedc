package com.examly.springapp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServices {

    @Autowired
	private TaskRepository taskRepository;
	
	public List<Task> getAllTasks(){
		List<Task> taskModels = new ArrayList<>();
		taskRepository.findAll().forEach(taskModels::add);
		return taskModels;
	}
	
	public Task getTask(String taskId) {
		return taskRepository.findById(taskId).orElse(null);
	}

	public void addTask(Task task) {
		taskRepository.save(task);
	}

	public Task updateTaskStatus(String id, String taskStatus) {
		Optional<Task> taskOptional = taskRepository.findById(id);
		if (taskOptional.isPresent()) {
			Task task = taskOptional.get();
			task.setTaskStatus(taskStatus);
			taskRepository.save(task);
			return task;
		}
		return null; // Or throw an exception if you want to handle this case differently
	}

	public void deleteTask(String id) {
		taskRepository.deleteById(id);
	}
}
