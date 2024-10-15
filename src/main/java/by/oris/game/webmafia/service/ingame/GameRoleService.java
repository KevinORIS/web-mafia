package by.oris.game.webmafia.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.GameRoleDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.GameRole;
import by.oris.game.webmafia.repository.ingame.GameRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameRoleService {
    @Autowired
    GameRoleRepository gameRoleRepository;

    public GameRole save(GameRole gameRole) {
        return gameRoleRepository.save(gameRole);
    }
}
