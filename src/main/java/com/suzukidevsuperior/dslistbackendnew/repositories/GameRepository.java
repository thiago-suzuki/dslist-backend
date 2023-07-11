package com.suzukidevsuperior.dslistbackendnew.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suzukidevsuperior.dslistbackendnew.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
