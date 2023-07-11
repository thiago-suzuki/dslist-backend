package com.suzukidevsuperior.dslistbackendnew.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suzukidevsuperior.dslistbackendnew.dto.GameMinDTO;
import com.suzukidevsuperior.dslistbackendnew.entities.Game;
import com.suzukidevsuperior.dslistbackendnew.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
