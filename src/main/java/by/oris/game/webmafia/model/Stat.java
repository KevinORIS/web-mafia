package by.oris.game.webmafia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "stats")
public class Stat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stat_id",unique = true, nullable = false)
    private int id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "last_seen_online")
    private Timestamp lastSeenOnline;
    @Column(name = "games_played")
    private int gamesPlayed;
    @Column(name = "civil_wins")
    private int civilWins;
    @Column(name = "mafia_wins")
    private int mafiaWins;
}
