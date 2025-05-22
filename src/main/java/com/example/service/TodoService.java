package com.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://service.example.com/")
public interface TodoService {
    @WebMethod
    void addTodo(Todo todo);

    @WebMethod
    List<Todo> getTodos();
}
