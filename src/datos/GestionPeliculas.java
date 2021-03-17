package datos;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

import modelo.Categorias;
import modelo.Pelicula;
import utilidades.LecturaDatos;

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
	
	public void cargarPeliculas() {
		
		try {
			
			FileReader archivo = new FileReader("peliculas_numCat.txt");
			Scanner leer = new Scanner(archivo);
			
			while (leer.hasNext()) {
				
				int contador = 1;
				
				String pelicula = leer.next();
				String[] datosPelicula = pelicula.split(",");
				
				Pelicula p = new Pelicula();
				
				p.setNombre(datosPelicula[0]);
				p.setEstreno(Integer.parseInt(datosPelicula[1]));
				int categoriaID = Integer.parseInt(datosPelicula[2]);				
				p.setCategoria(Categorias.getNombreCategoria(categoriaID));
				
				peliculas.put(contador, p);
				
				contador++;
				
				
			}
			
			
		} catch (Exception e) {
			
			System.out.println("Archivo de películas no encontrado");
			e.printStackTrace();
			
		}
		

		
		
	}
	
	
	
	
}
