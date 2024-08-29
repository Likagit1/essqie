package ci.digitalacademy.atosmonetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AuthController {
    @GetMapping
    public String connexion(){
        return "auth/login";
    }
}
