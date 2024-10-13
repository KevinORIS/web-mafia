package by.oris.game.webmafia.model.entities.outgame;

import by.oris.game.webmafia.model.entities.ingame.Player;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id",unique = true, nullable = false)
    private int id;
    private String email;
    private String name;
    private String password;
    @Column(name = "profile_picture_url")
    private String profilePictureURL;
    @OneToOne
    private Stat stat;
    @ManyToOne
    @JoinColumn(name = "user_role")
    private UserRole userRole;
    @OneToOne
    private Player player;
    @OneToMany
    private Set<Friendship> friendships;
    private Timestamp createdTs;
    private Timestamp updatedTs;

}