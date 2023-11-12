package dev.laterre.springjenkinstemplate.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/user/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "register-form";
    }

    @PostMapping("/user/reg-view")
    public String viewForm(@ModelAttribute("user") User user) {
        return "register-view";
    }
}
