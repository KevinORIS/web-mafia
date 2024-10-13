package by.oris.game.webmafia.model.entities.ingame;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class VoteResult {
    @EmbeddedId
    private VoteResultPK id;
    @OneToOne
    @MapsId("stageId")
    @JoinColumn(name="stage_id")
    private Stage stage;
    @OneToOne
    @MapsId("playerId")
    @JoinColumn(name="chosen_player_id")
    private Player player;
}
