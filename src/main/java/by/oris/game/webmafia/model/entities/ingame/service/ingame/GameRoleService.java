package by.oris.game.webmafia.model.entities.ingame.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.GameRoleDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.GameRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameRoleService {
    @Autowired
    private GameRoleDAOImpl gameRoleDAOImpl;

    public GameRole create(GameRole gameRole) {
        return gameRoleDAOImpl.create(gameRole);
    }
}
