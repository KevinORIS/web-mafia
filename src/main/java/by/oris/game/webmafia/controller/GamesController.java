package by.oris.game.webmafia.controller;

import by.oris.game.webmafia.model.entities.ingame.Game;
import by.oris.game.webmafia.service.inter.outgame.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class GamesController {
        @Autowired
        private GameService gameService;

        @GetMapping("/games")
        public String getActiveGames(Model model){
                List<Game> games = gameService.findActive();
                model.addAttribute("games", games);
                return "games";
        }

        @GetMapping("/games/{code}")
        public String getGameByCode(@PathVariable String code, Model model) {
                Game game = gameService.findByCode(code);

                model.addAttribute("game", game);

                return "game-details";
        }
}
