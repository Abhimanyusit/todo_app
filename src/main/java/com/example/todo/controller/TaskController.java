package com.example.todo.controller;

import com.example.todo.model.Task;
import com.example.todo.service.TaskService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    // Show all tasks
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("taskList", taskService.getAllTasks());
        model.addAttribute("task", new Task()); // empty task for form
        return "index";
    }

    // Add new task
    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        taskService.saveTask(task);
        return "redirect:/";
    }

    // Delete task
    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }

    // Mark task as completed
    @GetMapping("/complete/{id}")
    public String completeTask(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        if (task != null) {
            task.setCompleted(true);
            taskService.saveTask(task);
        }
        return "redirect:/";
    }
}
