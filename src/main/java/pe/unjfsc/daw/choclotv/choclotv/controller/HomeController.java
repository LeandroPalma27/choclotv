package pe.unjfsc.daw.choclotv.choclotv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping({"", "/"})
    public String home(Model model) {
        return "home";
    }
    
    @GetMapping({"/home2"})
    public String home2(Model model) {
        return "Index";
    }

}
