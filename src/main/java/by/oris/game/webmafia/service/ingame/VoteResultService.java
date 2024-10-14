package by.oris.game.webmafia.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.VoteResultDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.VoteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteResultService {
    @Autowired
    private VoteResultDAOImpl voteResultDAO;

    public VoteResult create(VoteResult voteResult) {
        return voteResultDAO.create(voteResult);
    }

    public VoteResult update(VoteResult voteResult) {
        return voteResultDAO.update(voteResult);
    }
}
