package pe.unjfsc.daw.choclotv.choclotv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.unjfsc.daw.choclotv.choclotv.service.impl.ITituloService;

@Controller
public class HomeController {

    @Autowired
    ITituloService tituloService;
    
    @GetMapping({"", "/"})
    public String home(Model model) {
        return "home";
    }
    
    @GetMapping({"/home2"})
    public String home2(Model model) {
        return "index";
    }

    @GetMapping("home")
    public String Home(Model model) {
        model.addAttribute("titulos", tituloService.listarTitulos());
        model.addAttribute("title", "ChocloTV");
        return "index-2";
    }

}
