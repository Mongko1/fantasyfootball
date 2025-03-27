package com.mongkol.fantasyteam.service;

import com.mongkol.fantasyteam.entity.Player;
import com.mongkol.fantasyteam.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player findReplacePlayer(List<String> webNames){
        List<Player> allPlayer = playerRepository.findAll();
        List<Player> playerList = playerRepository.findByWebNameIn(webNames);

        Player weakestPlayer = playerList.stream()
                .min(Comparator.comparing(Player::getPredict_points))
                .orElse(null);

        if (weakestPlayer == null) {
            return null;
        }

        Player bestReplacement = allPlayer.stream()
                .filter(p -> !webNames.contains(p.getWebName()))
                .max(Comparator.comparing(Player::getPredict_points)) // BigDecimal comparator
                .orElse(null);

        return bestReplacement;
    }

    public List<Player> findPlayer(List<String> webNames){
        return playerRepository.findByWebNameIn(webNames);
    }
}


