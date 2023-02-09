	/**
 * 
 */
package ejemploWeb2.web.controladores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Modelos.Empleado;
import Modelos.Usuario;




/**
 * @author Pablo López
 * Clase con los controladores de la Web
 */
@Controller
public class ControladorFormulario {
	 
	 	//Controlador de la ruta /segund
	    @RequestMapping(value="/formulario")
	    public String showForm(Model modelo) {
	        Usuario usuario = new Usuario();
	        modelo.addAttribute("usuario", usuario);
	        return "formulario_registro";
	    }
	    
	    //MODELO QUE ENVIA A EL MOSTRADO DE DATOS REGISTRADOS
	    @PostMapping("/registrado")
	    public String submitForm(@ModelAttribute("usuario") Usuario usuario) {
	         
	        System.out.println(usuario);
	         
	        return "formulario_enviado";
	    }
	    
}
