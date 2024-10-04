package by.oris.game.webmafia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;

@Data
@Embeddable
public class FriendshipKey implements Serializable {
    @Column(name="user_id_1")
    private int userId1;

    @Column(name="user_id_2")
    private int userId2;

}
