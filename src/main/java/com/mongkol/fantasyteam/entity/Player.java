package com.mongkol.fantasyteam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "players")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "web_name")
    private String webName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "team_id")
    private Integer teamId;

    @Column(name = "element_type")
    private Integer position;

    @Column(name = "now_cost")
    private Integer cost;

    @Column(name = "predicted_points")
    private BigDecimal predict_points;

    @Column(name = "predicted_value")
    private BigDecimal predict_value;

    @Column(name = "can_select")
    private Boolean canSelect;
}
