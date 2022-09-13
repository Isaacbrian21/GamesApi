package com.todo.TodoList.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GamesRequest {
    @NotNull
    private URL url;
    @NotNull
    private String name;
    @NotNull
    private String descricao;
    @NotNull
    private String plataforma;
    @NotNull
    private Integer val3;
}
