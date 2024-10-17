package by.oris.game.webmafia.service.impl.outgame;

import by.oris.game.webmafia.model.entities.outgame.UserRole;
import by.oris.game.webmafia.repository.outgame.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRoleServiceImpl {
    @Autowired
    private UserRoleRepository userRoleRepository;

    public Optional<UserRole> findById(final int id) {
        return userRoleRepository.findById(id);
    }


    public UserRole save(UserRole userRole) {
       return userRoleRepository.save(userRole);
    }
}
