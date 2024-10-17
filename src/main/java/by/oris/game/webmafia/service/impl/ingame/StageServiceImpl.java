package by.oris.game.webmafia.service.impl.ingame;

import by.oris.game.webmafia.model.entities.ingame.Stage;
import by.oris.game.webmafia.repository.ingame.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageServiceImpl {
    @Autowired
    StageRepository stageRepository;

    public Stage save(Stage stage){
        return stageRepository.save(stage);
    }
}
