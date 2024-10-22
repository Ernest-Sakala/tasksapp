package com.tasks.tasksapp.controller;


import com.tasks.tasksapp.model.TaskModel;
import com.tasks.tasksapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {


    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("/task")
    public String getIndex(Model model){
        model.addAttribute("task", new TaskModel());
        return "index";
    }

    @GetMapping("/")
    public String getHome(Model model){
        return "home";
    }


    @PostMapping("/addTask")
    public String addTask(@ModelAttribute TaskModel taskModel, Model model, BindingResult bindingResult){

        model.addAttribute("task", new TaskModel());

        System.out.println(taskModel);

        taskService.saveTask(taskModel);

        return "index";
    }


}
