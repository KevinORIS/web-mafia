package by.oris.game.webmafia.model.entities.ingame.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.MoveDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.Move;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoveService {
    @Autowired
    private MoveDAOImpl moveDAO;

    public Move create(Move move){
        return moveDAO.create(move);
    }
}
