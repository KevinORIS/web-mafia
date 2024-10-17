package by.oris.game.webmafia.test;

import by.oris.game.webmafia.model.entities.outgame.UserRole;
import by.oris.game.webmafia.service.impl.outgame.UserRoleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class AddingUserRolesToDB {
    private final UserRoleServiceImpl userRoleServiceImpl;

    public AddingUserRolesToDB(UserRoleServiceImpl userRoleServiceImpl) {
        this.userRoleServiceImpl = userRoleServiceImpl;
    }
    @Transactional
    public void addRoles() {
        UserRole userRole1 = new UserRole();
        userRole1.setName("admin");
        userRoleServiceImpl.save(userRole1);
        UserRole userRole2 = new UserRole();
        userRole2.setName("moderator");
        userRoleServiceImpl.save(userRole2);
        UserRole userRole3 = new UserRole();
        userRole3.setName("user");
        userRoleServiceImpl.save(userRole3);
    }
}
