package by.oris.game.webmafia.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntitiesController {

    @Autowired
    private AddAllEntitiesToDB addAllEntitiesToDB;

    @GetMapping("/addall")
    public String addEntities() {
        addAllEntitiesToDB.allEntitiesToDb();
        return "added successfully";
    }
}
