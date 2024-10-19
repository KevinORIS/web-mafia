package by.oris.game.webmafia.service.impl.outgame;

import by.oris.game.webmafia.dto.UserDTO;
import by.oris.game.webmafia.model.entities.outgame.User;
import by.oris.game.webmafia.repository.outgame.UserRepository;
import by.oris.game.webmafia.service.inter.outgame.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User save(User user){
        return userRepository.save(user);
    }
    @Override
    public Optional<User> findById(int id){
        return userRepository.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    @Override
    public User saveDTO(UserDTO userDTO) {
        User user = new User(userDTO.getEmail(), userDTO.getUsername(), userDTO.getPassword());
        return user;
    }
}
