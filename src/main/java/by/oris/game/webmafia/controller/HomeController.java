package by.oris.game.webmafia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/play")
    public String goToPlay() {
        return "play";
    }

    @GetMapping("/profile")
    public String goToProfile() {
        return "profile";
    }

    @GetMapping("/friends")
    public String goToFriends() {
        return "friends";
    }

    @GetMapping("/rules")
    public String goToRules() {
        return "rules";
    }
}