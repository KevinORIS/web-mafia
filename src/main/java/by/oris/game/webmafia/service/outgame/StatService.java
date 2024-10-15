package by.oris.game.webmafia.service.outgame;

import by.oris.game.webmafia.dao.impl.outgame.StatDAOImpl;
import by.oris.game.webmafia.model.entities.outgame.Stat;
import by.oris.game.webmafia.repository.outgame.StatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatService {
    @Autowired
    StatRepository statRepository;

    public Stat save(Stat stat){
        return statRepository.save(stat);
    }
}
