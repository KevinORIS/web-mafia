package by.oris.game.webmafia.dao.impl.ingame;

import by.oris.game.webmafia.dao.AbstractJpaDAO;
import by.oris.game.webmafia.dao.interfacedao.ingame.StageDAO;
import by.oris.game.webmafia.model.entities.ingame.Stage;
import org.springframework.stereotype.Repository;

@Repository
public class StageDAOImpl extends AbstractJpaDAO<Stage> implements StageDAO {
    public StageDAOImpl() {
        super();
        setClazz(Stage.class);
    }
}
