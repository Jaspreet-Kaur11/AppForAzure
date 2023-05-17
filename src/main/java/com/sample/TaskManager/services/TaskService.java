package com.sample.TaskManager.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.TaskManager.model.Tasks;
public interface TaskService {
Tasks create(Tasks task);
List<Tasks> getAll();
}
