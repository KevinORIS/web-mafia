package by.oris.game.webmafia.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.GameDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameDAOImpl gameDAOImpl;

    public Game create(Game game) {
        return gameDAOImpl.create(game);
    }
}