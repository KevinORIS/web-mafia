package by.oris.game.webmafia.service.outgame;

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

    public User update(User user){
        return userDAO.update(user);
    }

    public User findById(int id){
        return userDAO.findOne(id);
    }
}
