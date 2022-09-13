package com.todo.TodoList.service;

import com.todo.TodoList.entity.Favorite;
import com.todo.TodoList.entity.Games;
import com.todo.TodoList.mapper.FavoriteMapper;
import com.todo.TodoList.mapper.GamesMapper;
import com.todo.TodoList.repository.FavoriteRepository;
import com.todo.TodoList.request.FavoriteRequest;
import com.todo.TodoList.request.GamesRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FavoriteService {
    private final FavoriteRepository repository;

    public List<Favorite> getAll() {
        return repository.findAll();
    }

    public Optional<Favorite> getByID(Long id) {
        if (id != null) {
            return repository.findById(id);
        } else {
            return null;
        }
    }

    public Favorite create(FavoriteRequest request) {
        return repository.save(FavoriteMapper.favorite(request));
    }

    public void delete(Long id) {
        Optional<Favorite> todoItem = repository.findById(id);
        repository.delete(todoItem.get());
    }

    }
