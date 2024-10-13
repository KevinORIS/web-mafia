package by.oris.game.webmafia.model.entities.ingame;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "game_roles")
public class GameRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_role_id",unique = true, nullable = false)
    private int id;
    private String name;
    @OneToMany
    private Set<Player> players;
}
