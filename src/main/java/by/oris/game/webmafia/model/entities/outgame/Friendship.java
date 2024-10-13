package by.oris.game.webmafia.model.entities.outgame;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "friendships")
public class Friendship {
    @EmbeddedId
    private FriendshipPK id;
    @ManyToOne
    @MapsId("userId1")
    @JoinColumn(name="user_id_1")
    private User users1;
    @ManyToOne
    @MapsId("userId2")
    @JoinColumn(name="user_id_2")
    private User users2;
    private String status;
    @Column(name = "created_ts")
    private Timestamp createdTs;
}
