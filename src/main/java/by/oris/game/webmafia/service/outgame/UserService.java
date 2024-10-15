package by.oris.game.webmafia.service.outgame;

import by.oris.game.webmafia.model.entities.outgame.User;
import by.oris.game.webmafia.repository.outgame.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    public Optional<User> findById(int id){
        return userRepository.findById(id);
    }
}
