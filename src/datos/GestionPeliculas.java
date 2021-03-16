package datos;

import java.util.HashMap;

import modelo.Pelicula;

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
	
	
}
