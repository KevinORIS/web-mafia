package by.oris.game.webmafia.dao.impl.ingame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.ingame.VoteResultDAO;
import by.oris.game.webmafia.model.entities.ingame.VoteResult;
import org.springframework.stereotype.Repository;

@Repository
public class VoteResultDAOImpl  extends AbstractJpaDAO<VoteResult> implements VoteResultDAO {
    public VoteResultDAOImpl() {
        super();
        setClazz(VoteResult.class);
    }
}