package by.oris.game.webmafia.test;

import by.oris.game.webmafia.model.entities.outgame.UserRole;
import by.oris.game.webmafia.service.outgame.UserRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class AddingUserRolesToDB {
    private final UserRoleService userRoleService;

    public AddingUserRolesToDB(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }
    @Transactional
    public void addRoles() {
        UserRole userRole1 = new UserRole();
        userRole1.setName("admin");
        userRoleService.save(userRole1);
        UserRole userRole2 = new UserRole();
        userRole2.setName("moderator");
        userRoleService.save(userRole2);
        UserRole userRole3 = new UserRole();
        userRole3.setName("user");
        userRoleService.save(userRole3);
    }
}
