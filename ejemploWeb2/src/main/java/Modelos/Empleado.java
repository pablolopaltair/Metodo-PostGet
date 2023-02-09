/**
 * 
 */
package Modelos;

/**
 * @author Pablo López
 *
 */
public class Empleado {

	private String nombre;
    private int edad;
    private String departamento;
    
    //CONSTRUCTOR
	public Empleado(String nombre, int edad, String departamento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "Empleado: [Nombre: " + nombre + " - Edad: " + edad + " - Departamento: " + departamento + "]";
	}
	
	
	
	
    
    

	
}
