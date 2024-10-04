package by.oris.game.webmafia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "moves")
public class Move {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "move_id",unique = true, nullable = false)
    private int id;
    private String name;
    @ManyToOne
    private Stage stage;
    @ManyToMany
    private Set<Player> players1;
    @ManyToMany
    private Set<Player> players2;
    private Timestamp timestamp;
}
