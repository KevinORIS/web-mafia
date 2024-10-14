package by.oris.game.webmafia.service.outgame;

import by.oris.game.webmafia.dao.impl.outgame.StatDAOImpl;
import by.oris.game.webmafia.model.entities.outgame.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatService {
    @Autowired
    private StatDAOImpl statDAO;

    public Stat create(Stat stat){
        return statDAO.create(stat);
    }
}
