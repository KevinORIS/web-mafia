package by.oris.game.webmafia.repository.outgame;

import by.oris.game.webmafia.model.entities.outgame.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    UserRole findByName(String name);
}
