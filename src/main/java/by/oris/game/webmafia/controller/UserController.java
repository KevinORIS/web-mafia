package by.oris.game.webmafia.controller;

import java.security.Principal;

import by.oris.game.webmafia.dto.UserDTO;
import by.oris.game.webmafia.model.entities.outgame.User;
import by.oris.game.webmafia.service.inter.outgame.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public String home(Model model, Principal principal) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("userdetail", userDetails);
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model, UserDTO userDto) {

        model.addAttribute("user", userDto);
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model, UserDTO userDto) {
        model.addAttribute("user", userDto);
        return "register";
    }

    @PostMapping("/register")
    public String registerSava(@ModelAttribute("user") UserDTO userDTO, Model model) {
        User user = userService.findByName(userDTO.getName());
        if (user != null) {
            model.addAttribute("Userexist", user);
            return "register";
        }
        userService.saveDTO(userDTO);
        return "redirect:/register?success";
    }
}