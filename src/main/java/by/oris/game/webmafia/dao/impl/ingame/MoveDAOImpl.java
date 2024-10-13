package by.oris.game.webmafia.dao.impl.ingame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.ingame.MoveDAO;
import by.oris.game.webmafia.model.entities.ingame.Move;
import org.springframework.stereotype.Repository;

@Repository
public class MoveDAOImpl extends AbstractJpaDAO<Move> implements MoveDAO {
    public MoveDAOImpl() {
        super();
        setClazz(Move.class);
    }
}
