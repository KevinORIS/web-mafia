package by.oris.game.webmafia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "stages")
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stage_id",unique = true, nullable = false)
    private int id;
    private String name;
    @ManyToOne
    private Game game;
    @OneToMany
    private Set<Move> moves;
    @Column(name = "stage_start")
    private Timestamp stageStart;
    @Column(name = "stage_end")
    private Timestamp stageEnd;
}
