package com.tasks.tasksapp.controller.api;


import com.tasks.tasksapp.model.TaskModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tasks")
public class TaskRestController {


    @GetMapping
    public ResponseEntity<?> getTasks(){

        try {

            TaskModel taskModel = new TaskModel();

            taskModel.setTaskPriority("HIGH");
            taskModel.setTaskStatus("NEW");

            return ResponseEntity.ok(taskModel);

        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
