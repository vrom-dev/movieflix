package utilidades;

/**
*
* @author Tangerine (Víctor Romero)
* @version 0.0.1
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/**
* Clase para trabajar con Fechas.
*/


public class Fechas {
	
	/**
	 * Genera un objeto LocalDate a partir de una fecha introducida por teclado y lo devuelve.
	 * @param mensaje = mensaje que verá el usuario por consola para solicitarle la fecha.
	 * @param formato = String con el formato de la fecha que tendrá que introducir el usuario (ej: "dd/MM/yyyy", "dd-MM-yyyy", "yyyy-MM-dd").
	 * @return LocalDate
	 */

	public static LocalDate generarFecha(String mensaje, String formato) {
		boolean seguir;
		LocalDate fecha = LocalDate.now();
		do {
			try {
				fecha = LocalDate.parse(LecturaDatos.leerLinea(mensaje), DateTimeFormatter.ofPattern(formato));
	            seguir = false;
			} catch (DateTimeParseException e) {
				System.out.println("El formato de la fecha introducido es incorrecto.");
				System.out.println(e.getMessage());
	            seguir = true;
			} catch (Exception e) {
				System.out.print("El formato de la fecha introducido es incorrecto.");
	            seguir = true;
			} 
		} while (seguir == true);
		return fecha;
	}
	
	/**
	 * Recibe un Objeto tipo LocalDate, lo convierte a String, siguiendo el formato especificado, y lo devuelve.
	 * @param fecha = objeto LocalDate que queremos convertir a String.
	 * @param formato = String con el formato de fecha que tendrá que seguirá la conversión (ej: "dd/MM/yyyy", "dd-MM-yyyy", "yyyy-MM-dd").
	 * @return String  
	 */

	public static String formatearFecha(LocalDate fecha, String formato) {
		return fecha.format(DateTimeFormatter.ofPattern(formato));
	}
}
