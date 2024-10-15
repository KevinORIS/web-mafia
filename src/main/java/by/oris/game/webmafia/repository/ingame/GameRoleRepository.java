package by.oris.game.webmafia.repository.ingame;

import by.oris.game.webmafia.model.entities.ingame.GameRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRoleRepository extends JpaRepository<GameRole, Integer> {
}