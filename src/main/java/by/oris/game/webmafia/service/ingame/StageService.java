package by.oris.game.webmafia.service.ingame;

import by.oris.game.webmafia.dao.impl.ingame.StageDAOImpl;
import by.oris.game.webmafia.model.entities.ingame.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageService {
    @Autowired
    private StageDAOImpl stageDAO;

    public Stage create(Stage stage){
        return stageDAO.create(stage);
    }
}
