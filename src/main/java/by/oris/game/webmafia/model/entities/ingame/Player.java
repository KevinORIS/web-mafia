package by.oris.game.webmafia.model.entities.ingame;

import by.oris.game.webmafia.model.entities.outgame.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id",unique = true, nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "player_game")
    private Game game;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "player_role")
    private GameRole gameRole;
    @Column(name="card_url")
    private String cardUrl;
    @OneToMany
    private Set<Move> moves;
    @OneToOne
    private VoteResult voteResult;
    @Column(name = "is_alive")
    private boolean isAlive;
    @Column(name = "is_online")
    private boolean isOnline;
}
