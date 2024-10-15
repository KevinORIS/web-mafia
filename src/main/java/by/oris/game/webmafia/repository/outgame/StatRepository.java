package by.oris.game.webmafia.repository.outgame;

import by.oris.game.webmafia.model.entities.outgame.Stat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatRepository extends JpaRepository<Stat, Integer> {
}
