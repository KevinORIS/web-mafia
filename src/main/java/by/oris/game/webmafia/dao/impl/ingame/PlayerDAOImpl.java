package by.oris.game.webmafia.dao.impl.ingame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.model.entities.ingame.Player;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDAOImpl extends AbstractJpaDAO<Player> {
    public PlayerDAOImpl() {
        super();
        setClazz(Player.class);
    }
}
