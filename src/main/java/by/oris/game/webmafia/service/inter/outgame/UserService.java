package by.oris.game.webmafia.service.inter.outgame;

import by.oris.game.webmafia.dto.UserDTO;
import by.oris.game.webmafia.model.entities.outgame.User;

import java.util.Optional;

public interface UserService {
    User save(User user);

    Optional<User> findById(int id);

    User saveDTO(UserDTO userDTO);

    User findByUsername(String username);

    User createNew(String username, String email, String password);
}
