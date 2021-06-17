package com.example.springboot_application.repo;

import com.example.springboot_application.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {


}
