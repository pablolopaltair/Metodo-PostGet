/**
 * 
 */
package ejemploWeb2.web.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Modelos.Empleado;




/**
 * @author Pablo López
 * Clase con los controladores de la Web
 */
@Controller
public class ControladorLista {
    protected final Log logger = LogFactory.getLog(getClass());

	 
	 	//Controlador de la ruta /segund
	    @RequestMapping(value="/lista")
	    public ModelAndView gestionSolicitud() {
	        Map<String, Object> miModelo = new HashMap<String, Object>();
	        
	        //Creación de una lista de empleados a partir de la clase empleados
	    	List<Empleado> empList=new ArrayList<Empleado>();
	    	Empleado empleado1 = new Empleado("Pablo López Luján", 21, "58556625V");
	    	Empleado empleado2 = new Empleado("Regino Fernández García", 31, "38556625V");
	    	Empleado empleado3 = new Empleado("Jesús Patricio Lozano", 21, "34556325V");
	    	Empleado empleado4 = new Empleado("Inés Gomez Luján", 28, "78556625V");
	    	empList.add(empleado1);
	    	empList.add(empleado2);
	    	empList.add(empleado3);
	    	empList.add(empleado4);
	    	
	    	
	    	
	    	//CLAVE: ("Nombre de la clave", variable)
	    	miModelo.put("listado", empList); 
	    	//Devuelve 
	        return new ModelAndView("lista", "miModelo", miModelo);
	        
	    }
	   
	    
}
