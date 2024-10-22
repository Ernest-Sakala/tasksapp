package com.tasks.tasksapp.service;

import com.tasks.tasksapp.model.TaskModel;
import com.tasks.tasksapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public void saveTask(TaskModel taskModel) {
        taskRepository.save(taskModel);
    }

}
