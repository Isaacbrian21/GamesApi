package com.todo.TodoList.mapper;

import com.todo.TodoList.entity.Games;
import com.todo.TodoList.request.GamesRequest;

public class GamesMapper {
    public GamesMapper(){}

    public static Games todoEntity(GamesRequest request){
        return Games.builder()
                .url(request.getUrl())
                .name(request.getName())
                .descricao(request.getDescricao())
                .plataforma(request.getPlataforma())
                .val3(request.getVal3())
                .build();
    }
}
