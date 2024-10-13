package by.oris.game.webmafia.dao.impl.outgame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.outgame.UserRoleDAO;
import by.oris.game.webmafia.model.entities.outgame.UserRole;
import org.springframework.stereotype.Repository;

@Repository
public class UserRoleDAOImpl extends AbstractJpaDAO<UserRole> implements UserRoleDAO {


    public UserRoleDAOImpl() {
        super();
        setClazz(UserRole.class);
    }


}
