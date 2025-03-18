package com.mongkol.fantasyteam.service;

import com.mongkol.fantasyteam.entity.Player;
import com.mongkol.fantasyteam.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findPlayer(List<String> webNames){
        return playerRepository.findByWebNameIn(webNames);
    }
}
