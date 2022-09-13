package com.todo.TodoList.controller;

import com.todo.TodoList.entity.Favorite;
import com.todo.TodoList.entity.Games;
import com.todo.TodoList.request.FavoriteRequest;
import com.todo.TodoList.request.GamesRequest;
import com.todo.TodoList.service.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/favorite")
@CrossOrigin(origins = "http://localhost:4200")
public class FavoriteControlller {
private final FavoriteService service;
    @GetMapping()
    public List<Favorite> findAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Favorite> getById(@PathVariable("id") Long id ){
        return service.getByID(id);
    }
    @PostMapping()
    public Favorite AddFavorite(@RequestBody @Validated FavoriteRequest request){
        return service.create(request);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable("id") Long id){
        service.delete(id);
    }

}
