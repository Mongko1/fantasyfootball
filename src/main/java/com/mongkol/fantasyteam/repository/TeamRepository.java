package com.mongkol.fantasyteam.repository;

import com.mongkol.fantasyteam.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "teams")
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
