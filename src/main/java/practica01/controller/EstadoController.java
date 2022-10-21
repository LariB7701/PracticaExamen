package practica01.controller;

import practica01.dao.EstadoDao;
import practica01.domain.Estado;
import practica01.service.EstadoService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;
    
    //Para poder ubicar el URL de estado nuevo
    @GetMapping("/estado/nuevo")
    public String estadoNuevo(Estado estado) {

        return "modificarEstado";

    }
    
    //Mapeo para guardar estado
    @PostMapping("/estado/guardar")
    public String estadoGuardar(Estado estado) {

        estadoService.save(estado);
        //Esto es para que se vaya de nuevo al index
        return "redirect:/";

    }
    
     //Mapeo para actualizar estado
    @GetMapping("/estado/actualiza/{idEstado}")
    public String estadoActualiza(Estado estado, Model model) {

        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";

    }
    
    //Mapeo para eliminar estado
    @GetMapping("/estado/elimina/{idEstado}")
    public String estadoElimina(Estado estado) {

        estadoService.delete(estado);
        return "redirect:/";

    }
    
}
