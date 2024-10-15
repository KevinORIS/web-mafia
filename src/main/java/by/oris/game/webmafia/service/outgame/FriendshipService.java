package by.oris.game.webmafia.service.outgame;

import by.oris.game.webmafia.dao.impl.outgame.FriendshipDAOImpl;
import by.oris.game.webmafia.model.entities.outgame.Friendship;
import by.oris.game.webmafia.repository.outgame.FriendshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendshipService {
    @Autowired
    FriendshipRepository friendshipRepository;

    public Friendship save(Friendship friendship) {
        return friendshipRepository.save(friendship);
    }

}
