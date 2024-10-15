package by.oris.game.webmafia.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.GameDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.Game;
import by.oris.game.webmafia.repository.ingame.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public Game save(Game game) {
        return gameRepository.save(game);
    }
}