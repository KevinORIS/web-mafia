package by.oris.game.webmafia.dao.impl.ingame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.ingame.GameRoleDAO;
import by.oris.game.webmafia.model.entities.ingame.GameRole;
import org.springframework.stereotype.Repository;

@Repository
public class GameRoleDAOImpl extends AbstractJpaDAO<GameRole> implements GameRoleDAO {
    public GameRoleDAOImpl() {
        super();
        setClazz(GameRole.class);
    }
}
