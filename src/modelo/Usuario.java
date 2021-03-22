package modelo;
/**
*
* @author Tangerine
* @version 0.0.1
*/
import java.time.LocalDate;

import utilidades.Fechas;
import utilidades.LecturaDatos;

/**
* Crea una clase Usuario, con nombre, fecha de nacimiento
* y ciudad.
*/

public class Usuario {

	private String nombre;
	private LocalDate fechaNacimiento;
	private String ciudad;
	
	/** Constructores  */
	
	public Usuario() {
	}
	
	public Usuario(String nombre, LocalDate fechaNacimiento, String ciudad) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudad = ciudad;
	}
	
	/** Getters y Setters  */
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	/** 
	 * Método inicializa los atributos de cada Usuario.
	 * @author Víctor
	 * @param none
	 * @return void
	 */
	public void crearUsuario() {
        try {
            this.nombre = LecturaDatos.leerLinea("Introduce el nombre del usuario:");
            this.fechaNacimiento = Fechas.generarFecha("Introduce la fecha de nacimiento (dd/MM/yyyy):",  "dd/MM/yyyy");
            this.ciudad = LecturaDatos.leerLinea("Introduce su ciudad de residencia:");
        } catch (Exception e) {
            e.getStackTrace();
        }
	}
	
	/** 
	 * Método que sobreescribe toString().
	 * @author Víctor
	 * @param none
	 * @return String
	 */
	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Fecha de nacimiento: " + Fechas.formatearFecha(fechaNacimiento, "dd-MM-yyyy") + " - Ciudad: " + ciudad;
	}

	
}
