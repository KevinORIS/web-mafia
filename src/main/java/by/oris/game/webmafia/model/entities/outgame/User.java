package by.oris.game.webmafia.model.entities.outgame;

import by.oris.game.webmafia.model.entities.ingame.Player;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private int id;
    private String email;
    private String username;
    private String password;
    @Column(name = "profile_picture_url")
    private String profilePictureURL;
    @OneToOne
    private Stat stat;
    @ManyToOne
    @JoinColumn(name = "user_role")
    private UserRole userRole;
    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;
    @OneToMany
    private Set<Friendship> friendships;
    @CreationTimestamp
    private Timestamp createdTs;
    private Timestamp updatedTs;

    public User(String email, String username, String password) {
        super();
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
