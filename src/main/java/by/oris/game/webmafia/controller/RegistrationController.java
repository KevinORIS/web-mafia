package by.oris.game.webmafia.controller;

import by.oris.game.webmafia.dto.UserDTO;
import by.oris.game.webmafia.model.entities.outgame.Stat;
import by.oris.game.webmafia.model.entities.outgame.User;
import by.oris.game.webmafia.service.inter.outgame.StatService;
import by.oris.game.webmafia.service.inter.outgame.UserRoleService;
import by.oris.game.webmafia.service.inter.outgame.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static by.oris.game.webmafia.config.SecurityConfig.passwordEncoder;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;
    @Autowired
    private StatService statService;
    @Autowired
    private UserRoleService userRoleService;


    @GetMapping("/register")
    public String register(Model model, UserDTO userDto) {
        model.addAttribute("user", userDto);
        return "register";
    }

    @PostMapping("/register")
    public String registerSave(@ModelAttribute("user") UserDTO userDTO, Model model) {
        User user = userService.findByUsername(userDTO.getUsername());
        if (user != null) {
            model.addAttribute("Userexist", user);
            return "register";
        }

        user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder().encode(userDTO.getPassword()));
        user.setUserRole(userRoleService.findByName("user"));
        user.setStat(statService.save(new Stat()));

        userService.save(user);

        if(userService.findByUsername(userDTO.getUsername()) != null){
            return "redirect:/login?success";
        }

        return "redirect:/register?error";
    }
}