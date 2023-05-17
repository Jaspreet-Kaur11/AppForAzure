package com.sample.TaskManager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tasks {
@Id
private String id;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private String description;
private String status;

}
