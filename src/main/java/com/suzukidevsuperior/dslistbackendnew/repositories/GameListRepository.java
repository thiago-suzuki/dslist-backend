package com.suzukidevsuperior.dslistbackendnew.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suzukidevsuperior.dslistbackendnew.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
