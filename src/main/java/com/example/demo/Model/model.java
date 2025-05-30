package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String author;

    // No-args constructor
    public model() {
    }

    // All-args constructor
    public model(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Getters and Setters
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
