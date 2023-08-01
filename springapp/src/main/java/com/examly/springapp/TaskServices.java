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
	
	public Task getTask(String taskHolderName) {
		return taskRepository.findByTaskHolderName(taskHolderName);
	}

	public void addTask(Task task) {
		taskRepository.save(task);
	}

	

    public Task updateTaskStatus(String id,String taskStatus){
        Task t = taskRepository.findByTaskId(id);
        t.setTaskStatus(taskStatus);
        return t;
    }

	public void deleteCourse(String id) {
		taskRepository.deleteById(id);
	}
}


