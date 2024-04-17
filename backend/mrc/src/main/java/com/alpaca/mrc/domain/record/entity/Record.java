package com.alpaca.mrc.domain.record.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "record")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lap_time")
    private LocalDateTime lapTime;

    @Column(name = "distance")
    private int distance;

    @Column(name = "avg_speed")
    private int avgSpeed;

    @Enumerated(EnumType.STRING)
    @Column(name = "game_mode")
    private GameMode gameMode;

    @Column(name = "is_win")
    private boolean isWin;

    @Column(name = "map")
    private String map;

    @Column(name = "replay")
    private String replay;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
