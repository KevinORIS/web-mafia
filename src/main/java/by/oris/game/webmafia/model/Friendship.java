package by.oris.game.webmafia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "friendships")
public class Friendship {
    @EmbeddedId
    private FriendshipKey id;
    @ManyToMany(mappedBy = "friends")
    private Set<User> users1;
    @ManyToMany(mappedBy = "friends")
    private Set<User> users2;
    private String status;
    @Column(name = "created_ts")
    private Timestamp createdTs;
}
