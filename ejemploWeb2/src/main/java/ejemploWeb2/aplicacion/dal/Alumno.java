/**
 * 
 */
package ejemploWeb2.aplicacion.dal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Pablo López: Clase que define nuestra Entidad alumno así como su
 *         localización en BBDD
 */

@Entity
@Table(name = "alm_tch_alumnos", schema = "dlk_gestion")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "telefono", nullable = false)
	private String telefono;

	// GETTERS Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
