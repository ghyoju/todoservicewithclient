package com.example.client;

import com.example.service.Todo;
import com.example.service.TodoService;

import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import java.net.URL;
import java.util.List;

public class Client {
	
	public static void main(String[] args) throws Exception {
		                     //http://localhost:8080/todo-service/TodoService?wsdl
        URL wsdlURL = new URL("http://localhost:8080/todo-service/TodoService?wsdl");
        QName qname = new QName("http://service.example.com/", "TodoService");

        Service service = Service.create(wsdlURL, qname);
        TodoService todoService = service.getPort(TodoService.class);

        todoService.addTodo(new Todo(1, "Write SOAP service"));
        todoService.addTodo(new Todo(2, "Test client"));

        List<Todo> todos = todoService.getTodos();
        for (Todo t : todos) {
            System.out.println(t.getId() + ": " + t.getTask());
        }
    }

}
