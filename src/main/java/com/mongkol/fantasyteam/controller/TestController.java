package com.mongkol.fantasyteam.controller;

import com.mongkol.fantasyteam.dto.PlayerRequestDTO;
import com.mongkol.fantasyteam.entity.Player;
import com.mongkol.fantasyteam.repository.PlayerRepository;
import com.mongkol.fantasyteam.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    PlayerService playerService;

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/test")
    public String test(){
        return "Hello World!";
    }

    @PostMapping("/myteams")
    public Player getPlayersByWebNames(@RequestBody PlayerRequestDTO request) {
        return playerService.findReplacePlayer(request.getWebNames());
    }

    @PostMapping("/myteam")
    public List<Player> getTeam(@RequestBody PlayerRequestDTO request) {
        return playerService.findPlayer(request.getWebNames());
    }
}
