package by.oris.game.webmafia.service.impl.ingame;

import by.oris.game.webmafia.model.entities.ingame.Move;
import by.oris.game.webmafia.repository.ingame.MoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoveServiceImpl {
    @Autowired
    MoveRepository moveRepository;

    public Move save(Move move){
        return moveRepository.save(move);
    }
}
