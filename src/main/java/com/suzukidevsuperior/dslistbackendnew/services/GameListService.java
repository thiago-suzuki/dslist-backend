package com.suzukidevsuperior.dslistbackendnew.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suzukidevsuperior.dslistbackendnew.dto.GameListDTO;
import com.suzukidevsuperior.dslistbackendnew.entities.GameList;
import com.suzukidevsuperior.dslistbackendnew.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}
}
