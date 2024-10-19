package by.oris.game.webmafia.service.inter.outgame;

import by.oris.game.webmafia.model.entities.outgame.UserRole;

public interface UserRoleService {
    UserRole save(UserRole userRole);

    UserRole findByName(String name);
}
