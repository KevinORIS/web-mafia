package by.oris.game.webmafia.service.impl.outgame;

import by.oris.game.webmafia.dto.UserDTO;
import by.oris.game.webmafia.model.entities.outgame.Stat;
import by.oris.game.webmafia.model.entities.outgame.User;
import by.oris.game.webmafia.repository.outgame.UserRepository;
import by.oris.game.webmafia.service.inter.outgame.StatService;
import by.oris.game.webmafia.service.inter.outgame.UserRoleService;
import by.oris.game.webmafia.service.inter.outgame.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static by.oris.game.webmafia.config.SecurityConfig.passwordEncoder;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    private StatService statService;
    @Autowired
    private UserRoleService userRoleService;

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
    @Override
    public User createNew(String username, String email, String password){
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder().encode(password));
        user.setUserRole(userRoleService.findByName("user"));
        user.setStat(statService.save(new Stat()));
        return save(user);
    }
}
