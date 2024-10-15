package by.oris.game.webmafia.repository.ingame;

import by.oris.game.webmafia.model.entities.ingame.VoteResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteResultRepository extends JpaRepository<VoteResult, Integer> {
}
