package com.todo.TodoList.mapper;

import com.todo.TodoList.entity.Favorite;
import com.todo.TodoList.entity.Games;
import com.todo.TodoList.request.FavoriteRequest;

public class FavoriteMapper {
    public FavoriteMapper(){}
    public static Favorite favorite(FavoriteRequest request){
        return Favorite.builder()
                .url(request.getUrl())
                .name(request.getName())
                .descricao(request.getDescricao())
                .plataforma(request.getPlataforma())
                .val3(request.getVal3())
                .build();
    }
}
