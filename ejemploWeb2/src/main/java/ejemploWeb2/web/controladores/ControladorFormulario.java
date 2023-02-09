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
 * Clase controlador del formulario
 */
@Controller
public class ControladorFormulario {
	 
	 	//CONTROLADOR DEL FORMULARIO DE INTRODUCCIÓN (formulario_registro.jsp)
	    @RequestMapping(value="/formulario")
	    //Model - modelo: Recoge los atributos del modelo Usuario
	    public String showForm(Model modelo) {
	    	//Se crea una instancia nueva de usuario
	        Usuario usuario = new Usuario();
	        //Se añaden los atributos a "usuarioVista", la variable que llamo en la vista
	        modelo.addAttribute("usuarioVista", usuario);
	        return "formulario_registro";
	    }
	    
	    
	    
	    //MODELO QUE ENVIA LOS DATOS REGISTRADOS (formulario_enviado.jsp)
	    @PostMapping("/registrado")
	    //"submitForm" guarda los datos que hemos introducido en la vista anterior
	    //@ModelAttribute sirve para recuperar atributos del @RequestMapping
	    //Todo esto se devuelve a la vista que muestra los resultaods(formulario_enviado.jsp)
	    public String submitForm(@ModelAttribute("usuarioVista") Usuario usuario) {
	    	
	        return "formulario_enviado";
	    }
	    
}
