package pe.unjfsc.daw.choclotv.choclotv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.unjfsc.daw.choclotv.choclotv.service.impl.ITituloService;

// Controlador HOME para la aplicacion:
/*
 * Se encargara de gestionar las peticiones HTTP de carga de vistas, para la parte principal de la aplicacion.
 * Ejm: Vista inicio, login, vista planes, etc.
 */
@Controller
public class HomeController {

    @Autowired
    ITituloService tituloService;

    @GetMapping({"", "/"})
    public String Home(Model model) {
        model.addAttribute("titulos", tituloService.listarTitulos());
        model.addAttribute("title", "ChocloTV");
        return "home";
    }

}
