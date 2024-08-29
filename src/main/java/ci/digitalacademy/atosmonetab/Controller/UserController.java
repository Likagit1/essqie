package ci.digitalacademy.atosmonetab.Controller;

import ci.digitalacademy.atosmonetab.Models.User;
import ci.digitalacademy.atosmonetab.Repositories.UserRepository;
import ci.digitalacademy.atosmonetab.Services.UserService;
import ci.digitalacademy.atosmonetab.Services.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    public final UserService userService;


    @GetMapping
    public String showUsersPage(Model model) {
        log.debug("Request to show users ");
        List<UserDTO> users = userService.findAll();
        model.addAttribute("users" , users);
        return "users/list";
    }

    @PostMapping
    public String saveUser(UserDTO user){
        log.debug("Request to save user :{}",user);
        user.setDate_creation(LocalDateTime.now());
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/add")
    public String showAddUsers(Model model){
        log.debug("Request to show add users ");
        model.addAttribute("user" ,new User());
        return "users/forms";
    }

    @GetMapping("/{id}")
    public String showUpdateUsersForms (Model model , @PathVariable Long id){
        log.debug("Request to show update users forms");
        Optional<UserDTO> user = userService.findOne(id);
        if (user.isPresent()){
            model.addAttribute("user", user.get());
            return "users/forms";
        }else {
            return "redirect:/users";
        }

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        userService.delete(id);
        return "redirect:/users";
    }
}
