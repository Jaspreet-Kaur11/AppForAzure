package com.sample.TaskManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.TaskManager.model.Tasks;
import com.sample.TaskManager.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class taskController {
	@Autowired
private TaskService taskService;
	@PostMapping
	public ResponseEntity<Tasks> createTask(@RequestBody Tasks task){
		return ResponseEntity.status(HttpStatus.CREATED).body(taskService.create(task));
	}
	
	@GetMapping
	public ResponseEntity<List<Tasks>> getAllTasks(){
		return ResponseEntity.status(HttpStatus.OK).body(taskService.getAll());
	}

}
