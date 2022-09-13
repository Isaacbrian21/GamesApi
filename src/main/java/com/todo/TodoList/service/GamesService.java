package com.todo.TodoList.service;


import com.todo.TodoList.entity.Games;
import com.todo.TodoList.mapper.GamesMapper;
import com.todo.TodoList.repository.GamesRepository;
import com.todo.TodoList.request.GamesRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GamesService {


    private final GamesRepository repository;


    public List<Games> getAll(){
        return repository.findAll();
    }

    public Optional<Games> getByID(Long id){
        if(id != null){
          return repository.findById(id);
        }else {
            return null;
        }
    }

    public Games create(GamesRequest request){
        return repository.save(GamesMapper.todoEntity(request));
    }

    public void delete(Long id){
        Optional<Games> todoItem = repository.findById(id);
        repository.delete(todoItem.get());
    }
public Games updateGame(Games games, Long id){
        Optional<Games> item = repository.findById(id);
        if(item.isPresent()){
            item.get().setUrl(games.getUrl());
            item.get().setName(games.getName());
            item.get().setDescricao(games.getDescricao());
            item.get().setPlataforma(games.getPlataforma());
            item.get().setVal3(games.getVal3());
        return  repository.save(item.get());
        }else{
            return  null;
        }
    }


}

