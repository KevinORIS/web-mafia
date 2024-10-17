package by.oris.game.webmafia.service.impl.ingame;

import by.oris.game.webmafia.model.entities.ingame.VoteResult;
import by.oris.game.webmafia.repository.ingame.VoteResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteResultServiceImpl {
    @Autowired
    VoteResultRepository voteResultRepository;

    public VoteResult save(VoteResult voteResult) {
        return voteResultRepository.save(voteResult);
    }

}
