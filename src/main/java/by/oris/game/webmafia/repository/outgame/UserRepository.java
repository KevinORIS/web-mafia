package by.oris.game.webmafia.repository.outgame;

import by.oris.game.webmafia.model.entities.outgame.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
