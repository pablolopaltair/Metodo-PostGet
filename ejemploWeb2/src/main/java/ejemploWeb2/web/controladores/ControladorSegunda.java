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
public class ControladorSegunda {
	
	@RequestMapping(value="/segunda")
    public String home() {
        return "segunda";
    }
	

	 
	 	
	    
}