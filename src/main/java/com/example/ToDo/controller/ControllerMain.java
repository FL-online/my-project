package com.example.ToDo.controller;
import com.example.ToDo.repository.TaskRepository;
import com.example.ToDo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMain {
/*
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Willkommen zum Task Manager!");
        return "home";
    }
*/

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("taskList", taskRepository.findAll());
        //model.addAttribute("message", "Willkommen zum Task Manager!");
        return "index";
    }
    /*
    @PostMapping("/")
    public String checkbox(@RequestParam("id")Long taskId, @RequestParam("completed") boolean completed){

        // Das Task-Objekt anhand der ID aus der Datenbank holen
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task ID: " + taskId));
        System.out.println(task);
        // Das Attribut 'completed' aktualisieren
        task.setCompleted(completed);
        System.out.println(task);
        // Das Task-Objekt mit dem neuen Wert speichern
        taskRepository.save(task);

        // Nach der Aktualisierung auf eine andere Seite umleiten
        return "redirect:/";  // oder eine andere Route
    }
*/

    @GetMapping("/showNewTaskForm")
    public String showNewTaskForm(Model model) {
        Task task = new Task();
        model.addAttribute("task", task);
        return "new_task";
    }

    @PostMapping("/saveTask")
    public String saveTask(Task task) {
        taskRepository.save(task);

        return "redirect:/";
    }

    @GetMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable("id") long id) {
        taskRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task Id:" + id));
        model.addAttribute("task", task);
        return "update_task";
    }
}
