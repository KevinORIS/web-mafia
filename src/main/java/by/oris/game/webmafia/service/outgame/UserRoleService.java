package by.oris.game.webmafia.service.outgame;

import by.oris.game.webmafia.dao.impl.outgame.UserRoleDAOImpl;
import by.oris.game.webmafia.model.entities.outgame.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {
    @Autowired
    private UserRoleDAOImpl userRoleDAO;

//    public UserRole findOne(final int id) {
//        return userRoleDAO.findOne(id);
//    }
//
//    public List<UserRole> findAll() {
//        return userRoleDAO.findAll();
//    }


    public UserRole create(UserRole userRole) {
       return userRoleDAO.create(userRole);
    }

//    public UserRole update(final UserRole userRole) {
//        return userRoleDAO.update(userRole);
//    }
//
//    public void delete(final UserRole userRole) {
//        userRoleDAO.delete(userRole);
//    }
//
//    public void deleteById(final int userRoleId) {
//        userRoleDAO.deleteById(userRoleId);
//    }
}
