/**
 * 
 */
package ejemploWeb2;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import ejemploWeb2.aplicacion.AplicacionConfiguracionContexto;
import ejemploWeb2.web.WebConfiguracionContexto;


/**
 * @author Pablo López
 *
 */
public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { AplicacionConfiguracionContexto.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfiguracionContexto.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
