package by.oris.game.webmafia.dao.impl.outgame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.outgame.StatDAO;
import by.oris.game.webmafia.model.entities.outgame.Stat;
import org.springframework.stereotype.Repository;

@Repository
public class StatDAOImpl extends AbstractJpaDAO<Stat> implements StatDAO {
    public StatDAOImpl() {
        super();
        setClazz(Stat.class);
    }
}
