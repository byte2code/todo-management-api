package com.example.todocrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todocrud.entity.Todo;
import com.example.todocrud.entity.Users;
import com.example.todocrud.repository.ToDoRepository;
import com.example.todocrud.repository.UserRepository;

@Service
public class TodoServices {

    @Autowired
    UserServices userServices;
    
    @Autowired
    ToDoRepository toDoRepository;
    
    @Autowired
    UserRepository userRepository;

    public Todo getTodoById(Long todoId){
        // write code
	return toDoRepository.findById(todoId).get();
    }

    public void addTodo(Long userId, Todo todo){
        // write code
	Users user = userRepository.findById(userId).get();
	todo.setUser(user);
	toDoRepository.save(todo);
    }

    public void toggleTodoCompleted(Long todoId){
        Todo todo = this.getTodoById(todoId);
        todo.setCompleted(!todo.getCompleted());
        toDoRepository.save(todo);
    }

    public void updateTodo(Todo todo) { 
	toDoRepository.save(todo);
    }

    public void deleteTodo(Long userId,Long todoId){ 
	toDoRepository.deleteById(todoId);
    }

}
