package ejemploWeb2.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Modelos.Usuario;

@Controller
public class ControladorMenu {

	//CONTROLADOR DEL FORMULARIO DE INTRODUCCIÓN (formulario_registro.jsp)
    @RequestMapping(value="/gestion-portatiles")
    public String showForm(Model modelo) {

        return "menu_gestion";
    }
    
    
   
}
