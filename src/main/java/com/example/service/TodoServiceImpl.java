package com.example.service;

import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.example.service.TodoService",
            serviceName = "TodoService",
            portName = "TodoPort",
            targetNamespace = "http://service.example.com/")
public class TodoServiceImpl implements TodoService {

    private final List<Todo> todoList = new ArrayList<>();

    @Override
    public void addTodo(Todo todo) {
        todoList.add(todo);
    }

    @Override
    public List<Todo> getTodos() {
        return todoList;
    }
}
