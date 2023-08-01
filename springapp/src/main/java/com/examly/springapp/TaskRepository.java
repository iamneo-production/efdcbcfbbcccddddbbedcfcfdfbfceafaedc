package com.examly.springapp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
 
    Task findByTaskId(String id);
    Task findByTaskHolderName(String taskHolderName);
 
}

