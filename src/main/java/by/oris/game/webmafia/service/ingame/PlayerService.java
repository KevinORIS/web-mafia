package by.oris.game.webmafia.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.PlayerDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.Player;
import by.oris.game.webmafia.repository.ingame.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public Player save(Player player){
        return playerRepository.save(player);
    }
}
