package by.oris.game.webmafia.dao.impl.ingame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.ingame.GameDAO;
import by.oris.game.webmafia.model.entities.ingame.Game;
import org.springframework.stereotype.Repository;

@Repository
public class GameDAOImpl extends AbstractJpaDAO<Game> implements GameDAO {
    public GameDAOImpl() {
        super();
        setClazz(Game.class);
    }
}
