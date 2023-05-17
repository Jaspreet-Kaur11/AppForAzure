package com.sample.TaskManager.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.TaskManager.model.Tasks;
import com.sample.TaskManager.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{
	
@Autowired
	private TaskRepository taskRepository;

	@Override
	public Tasks create(Tasks task) {
		// TODO Auto-generated method stub
		String taskId = UUID.randomUUID().toString();
		task.setId(taskId);
		return taskRepository.save(task);
	}

	@Override
	public List<Tasks> getAll() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

}
