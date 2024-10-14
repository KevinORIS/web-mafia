package by.oris.game.webmafia.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    private AddingUserRolesToDB addingUserRolesToDB;

    @GetMapping("/addroles")
    public String addRoles() {
        addingUserRolesToDB.addRoles();
        return "Roles added successfully";
    }
}