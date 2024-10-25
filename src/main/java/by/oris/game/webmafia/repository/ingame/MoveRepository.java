package by.oris.game.webmafia.repository.ingame;

import by.oris.game.webmafia.model.entities.ingame.Move;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveRepository extends JpaRepository<Move, Integer> {
}