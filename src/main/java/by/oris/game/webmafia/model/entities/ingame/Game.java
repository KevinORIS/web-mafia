package by.oris.game.webmafia.model.entities.ingame;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id",unique = true, nullable = false)
    private int id;
    private String code;
    private String status;
    private String result;
    @OneToMany
    private Set<Player> players;
    @OneToMany
    private Set<Stage> stages;
    @Column(name = "start_time")
    private Timestamp startTime;
    @Column(name = "end_time")
    private Timestamp endTime;

}
