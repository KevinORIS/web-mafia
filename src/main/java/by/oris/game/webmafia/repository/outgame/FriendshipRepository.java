package by.oris.game.webmafia.repository.outgame;

import by.oris.game.webmafia.model.entities.outgame.Friendship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendshipRepository extends JpaRepository<Friendship, Integer> {
}
