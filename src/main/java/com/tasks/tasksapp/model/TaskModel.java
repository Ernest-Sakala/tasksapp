package com.tasks.tasksapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "task")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String taskStatus;
    private String taskPriority;
    private LocalDateTime createdDate = LocalDateTime.now();
    private LocalDateTime updatedDate = LocalDateTime.now();
    private String description;

    public TaskModel(){

    }

    public TaskModel(int id, String name, String taskStatus, String taskPriority, LocalDateTime createdDate, LocalDateTime updatedDate, String description) {
        this.id = id;
        this.name = name;
        this.taskStatus = taskStatus;
        this.taskPriority = taskPriority;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TaskModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                ", taskPriority='" + taskPriority + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", description='" + description + '\'' +
                '}';
    }
}
