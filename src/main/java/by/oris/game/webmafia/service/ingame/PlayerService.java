package by.oris.game.webmafia.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.PlayerDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerDAOImpl playerDAO;

    public Player create(Player player){
        return playerDAO.create(player);
    }
}
