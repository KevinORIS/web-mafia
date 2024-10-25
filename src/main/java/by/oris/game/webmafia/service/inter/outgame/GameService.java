package by.oris.game.webmafia.service.inter.outgame;

import by.oris.game.webmafia.model.entities.ingame.Game;

import java.util.List;

public interface GameService {
    List<Game> findActive();
    Game findByCode(String code);
    Game save(Game game);
}
