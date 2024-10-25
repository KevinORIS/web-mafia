package by.oris.game.webmafia.repository.ingame;

import by.oris.game.webmafia.model.entities.ingame.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    List<Game> findByStatusOrStatus(String status1, String status2);
    Game findByCode(String code);
}
