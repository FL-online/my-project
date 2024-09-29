package com.example.ToDo.model;
/*
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDate dueDate;
/*
    protected Task() {}

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }*/
/*
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, title='%s', description='%s']",
                id, title, description);
    }

    public Long getId() {
        return id;
    }*/
/*
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;




@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        private Long id;

        private String title;
        private String description;
        private boolean completed;
        private LocalDate dueDate;




    }

