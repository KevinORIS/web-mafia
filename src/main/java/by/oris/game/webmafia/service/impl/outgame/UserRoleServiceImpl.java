package by.oris.game.webmafia.service.impl.outgame;

import by.oris.game.webmafia.model.entities.outgame.UserRole;
import by.oris.game.webmafia.repository.outgame.UserRoleRepository;
import by.oris.game.webmafia.service.inter.outgame.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserRole findByName(String name) {
        return userRoleRepository.findByName(name);
    }

    @Override
    public UserRole save(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }
}
