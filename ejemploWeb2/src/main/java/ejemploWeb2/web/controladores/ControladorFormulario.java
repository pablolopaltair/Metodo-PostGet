	/**
 * 
 */
package ejemploWeb2.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Modelos.Usuario;




/**
 * @author Pablo López
 * Clase controlador del formulario
 */
@Controller
public class ControladorFormulario {
	
	

	 	//CONTROLADOR DEL FORMULARIO DE INTRODUCCIÓN (formulario_registro.jsp)
	    @RequestMapping(value="/formulario")
	    public String showForm(Model modelo) {
	        Usuario usuario = new Usuario();
	        modelo.addAttribute("usuarioVista", usuario);
	        
	        return "formulario_registro";
	    }
	    
	    
	    
	    //MODELO QUE ENVIA LOS DATOS REGISTRADOS (formulario_enviado.jsp)
	    @PostMapping("/registrado")
	    public String submitForm(@ModelAttribute("usuarioVista") Usuario usuario) {
	        

	        return "formulario_enviado";
	        
	    }
	   
	    
}
