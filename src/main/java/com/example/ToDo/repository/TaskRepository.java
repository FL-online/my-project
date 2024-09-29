package com.example.ToDo.repository;

/*

import java.util.List;

import com.example.ToDo.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findByLastName(String lastName);

    Task findById(long id);
}*/
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ToDo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
