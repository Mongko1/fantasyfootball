package com.mongkol.fantasyteam.repository;

import com.mongkol.fantasyteam.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "players")
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
