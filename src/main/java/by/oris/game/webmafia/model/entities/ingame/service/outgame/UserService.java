package by.oris.game.webmafia.model.entities.ingame.service.outgame;

import by.oris.game.webmafia.dao.impl.outgame.UserDAOImpl;
import by.oris.game.webmafia.model.entities.outgame.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAOImpl userDAO;

    public User create(User user){
        return userDAO.create(user);
    }
}
