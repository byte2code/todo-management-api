package com.example.todocrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String content;
    private Boolean completed = false;

    @ManyToOne // This indicates a many-to-one relationship
    @JoinColumn(name = "user_id") // This specifies the foreign key column in the Todo table
    private Users user; // Reference to the Users entity

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Users getUser() {
	return user;
    }

    public void setUser(Users user) {
	this.user = user;
    }

}
