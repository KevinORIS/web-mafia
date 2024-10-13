package by.oris.game.webmafia.dao.impl.outgame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.outgame.FriendshipDAO;
import by.oris.game.webmafia.model.entities.outgame.Friendship;
import org.springframework.stereotype.Repository;

@Repository
public class FriendshipDAOImpl extends AbstractJpaDAO<Friendship> implements FriendshipDAO {
    public FriendshipDAOImpl() {
        super();
        setClazz(Friendship.class);
    }
}
