package dev.sheltonfrancisco.challangetodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sheltonfrancisco.challangetodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
