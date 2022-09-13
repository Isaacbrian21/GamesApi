package com.todo.TodoList.repository;


import com.todo.TodoList.entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface GamesRepository extends JpaRepository<Games, Long> {
    Optional<Games> findById(Long id);
}
