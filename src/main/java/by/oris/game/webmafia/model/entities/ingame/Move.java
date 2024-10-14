package by.oris.game.webmafia.model.entities.ingame;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

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
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player1;
    @ManyToOne
    @JoinColumn(name = "target_player_id")
    private Player player2;
    @CreationTimestamp
    private Timestamp timestamp;
}
