package by.oris.game.webmafia.service.impl.ingame;

import by.oris.game.webmafia.model.entities.ingame.Game;
import by.oris.game.webmafia.repository.ingame.GameRepository;
import by.oris.game.webmafia.service.inter.outgame.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    GameRepository gameRepository;
    @Override
    public Game save(Game game) {
        return gameRepository.save(game);
    }
    @Override
    public Game findByCode(String code){
        return gameRepository.findByCode(code);
    }
    @Override
    public List<Game> findActive(){
        return gameRepository.findByStatusOrStatus("awaits", "going");
    }
}