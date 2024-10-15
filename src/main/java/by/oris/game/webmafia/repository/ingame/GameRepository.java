package by.oris.game.webmafia.repository.ingame;

import by.oris.game.webmafia.model.entities.ingame.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
