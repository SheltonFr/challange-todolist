package dev.sheltonfrancisco.challangetodolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dev.sheltonfrancisco.challangetodolist.entity.Todo;
import dev.sheltonfrancisco.challangetodolist.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> create(Todo todo) {
        repository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("priority").descending().and(
                Sort.by("name").ascending());

        return repository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        return create(todo);
    }

    public List<Todo> delete(Long id) {
        repository.deleteById(id);
        return list();
    }
}
