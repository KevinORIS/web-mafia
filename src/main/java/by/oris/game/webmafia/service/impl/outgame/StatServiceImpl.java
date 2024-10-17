package by.oris.game.webmafia.service.impl.outgame;

import by.oris.game.webmafia.model.entities.outgame.Stat;
import by.oris.game.webmafia.repository.outgame.StatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatServiceImpl {
    @Autowired
    StatRepository statRepository;

    public Stat save(Stat stat){
        return statRepository.save(stat);
    }
}
