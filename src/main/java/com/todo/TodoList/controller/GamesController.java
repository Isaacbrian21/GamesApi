package com.todo.TodoList.controller;


import com.todo.TodoList.entity.Games;
import com.todo.TodoList.request.GamesRequest;
import com.todo.TodoList.service.GamesService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class GamesController {
private final GamesService service;
    @GetMapping()
    public List<Games> findAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Games> getById(@PathVariable("id") Long id ){
        return service.getByID(id);
    }
    @PostMapping()
    public Games createGame(@RequestBody @Validated GamesRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public Games updateGame(@RequestBody Games item, @PathVariable("id")  Long id){
        return service.updateGame(item, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable("id") Long id){
        service.delete(id);
    }
}
