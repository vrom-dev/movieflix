package datos;

import java.util.HashMap;

import modelo.Pelicula;

public class GestionPeliculas {

	
	private HashMap<Integer, Pelicula> peliculas = new HashMap<Integer, Pelicula>();
	
	
	
	public GestionPeliculas() {
		super();
	}



	public GestionPeliculas(HashMap<Integer, Pelicula> peliculas) {
		super();
		this.peliculas = peliculas;
	}



	public HashMap<Integer, Pelicula> getPeliculas() {
		return peliculas;
	}



	public void setPeliculas(HashMap<Integer, Pelicula> peliculas) {
		this.peliculas = peliculas;
	}



	public void altaPelicula(Integer id, Pelicula p) {
		
		//Pelicula p = new Pelicula();
		
		if (peliculas.containsKey(id)) {
			
			System.out.println("El código ya existe");
			
		} else {
			
			p.datosPelicula();
			peliculas.put(id, p);
			
			System.out.println("Película añadida");
		}
		
	}
	
	public void imprimirListaPeliculas() {

		
		for (Integer i : this.peliculas.keySet()) {
			
			this.peliculas.get(i).imprimirPelicula();
			
		}
		
		
	}
	
	
	
	
}
