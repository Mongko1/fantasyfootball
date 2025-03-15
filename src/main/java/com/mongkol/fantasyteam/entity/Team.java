package com.mongkol.fantasyteam.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teams")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "short_name")
    private String shortName;
}
