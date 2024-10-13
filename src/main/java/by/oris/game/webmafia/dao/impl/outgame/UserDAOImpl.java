package by.oris.game.webmafia.dao.impl.outgame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.outgame.UserDAO;
import by.oris.game.webmafia.model.entities.outgame.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends AbstractJpaDAO<User> implements UserDAO {
    public UserDAOImpl() {
        super();
        setClazz(User.class);
    }
}
