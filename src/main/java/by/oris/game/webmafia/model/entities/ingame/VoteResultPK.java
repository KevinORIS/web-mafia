package by.oris.game.webmafia.model.entities.ingame;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class VoteResultPK implements Serializable {
    private int stageId;
    private int playerId;
}