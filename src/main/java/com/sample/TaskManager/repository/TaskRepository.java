package com.sample.TaskManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.TaskManager.model.Tasks;


@Repository
public interface TaskRepository extends JpaRepository<Tasks,String> {

}
