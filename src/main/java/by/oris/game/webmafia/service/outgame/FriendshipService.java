package by.oris.game.webmafia.service.outgame;

import by.oris.game.webmafia.dao.impl.outgame.FriendshipDAOImpl;
import by.oris.game.webmafia.model.entities.outgame.Friendship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendshipService {
    @Autowired
    private FriendshipDAOImpl friendshipDAO;

    public Friendship create(Friendship friendship) {
        return friendshipDAO.create(friendship);
    }

    public Friendship update(Friendship friendship){
        return friendshipDAO.update(friendship);
    }
}
