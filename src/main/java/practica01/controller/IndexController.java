package practica01.controller;

import practica01.dao.EstadoDao;
import practica01.domain.Estado;
import practica01.service.EstadoService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

     @Autowired
    private EstadoService EstadoService;
    
      @GetMapping("/")
    public String inicio(Model model) {
        var texto = "Práctica para el examen";
        model.addAttribute("saludo", texto);

        var estados = EstadoService.getEstado();
        model.addAttribute("estado", estados);

        return "index";
    }
     
}
