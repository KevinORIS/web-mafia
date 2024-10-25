package by.oris.game.webmafia.repository.ingame;

import by.oris.game.webmafia.model.entities.ingame.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
