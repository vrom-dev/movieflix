package datos;

import java.util.HashMap;

import modelo.Pelicula;
import modelo.Usuario;

public class GestionPeliculas {

	private HashMap<Integer, Pelicula> peliculas = new HashMap<Integer, Pelicula>();

	public void altaPelicula(Pelicula p, Integer id) {
		
		//Pelicula p = new Pelicula();
		
		if (peliculas.containsKey(id)) {
			
			System.out.println("El código ya existe");
			
		} else {
			
			p.datosPelicula();
			peliculas.put(id, p);
			
		}
		
	}
		public Pelicula buscarPelicula(Integer codigo) {
			return peliculas.get(codigo);
		}
		
		// falta añadir un exception
		public void eliminarPelicula(Integer codigo) {
			if(peliculas.containsKey(codigo)) {
				peliculas.remove(codigo);
			} else {
				System.out.println("Este id no está en la lista de peliculas.");
			}
			
		}
		
		
	}


