package by.oris.game.webmafia.model.entities.outgame;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class FriendshipPK implements Serializable {
    private int userId1;
    private int userId2;
}
