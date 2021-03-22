package modelo;

import utilidades.LecturaDatos;

public class Pelicula {
	
	private String nombre; 
	private int estreno;
	private Categorias categoria;
	private float valoracion;
	
	
	public Pelicula() {
		super();
		this.valoracion = valoracion();
	}
	
	
	
	
	public Pelicula(String nombre, int estreno, Categorias categoria) {
		super();
		this.nombre = nombre;
		this.estreno = estreno;
		this.categoria = categoria;
		this.valoracion = valoracion();
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstreno() {
		return estreno;
	}
	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}


	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	
	


	public float getValoracion() {
		return valoracion;
	}




	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}




	@Override
	public String toString() {
		return  "Pelicula: " +
				"\n Nombre=" + nombre + 
				"\n Estreno=" + estreno + 
				"\n categoria=" + categoria + 
				"\n";
	}
	
	
	public void datosPelicula() {
		
		this.setNombre(LecturaDatos.leerLinea("Introduce el nombre de la película"));
		this.setEstreno(LecturaDatos.leerInt("Introduce el año del estreno"));
		Categorias.mostrarCategorias();
		int categoriaID = LecturaDatos.leerInt("Introduce el ID de la categoría");
		
		this.setCategoria(Categorias.getNombreCategoria(categoriaID));
		
		
	}
	
	public void imprimirPelicula(int key) {
		

		System.out.println("Título: " + this.getNombre());
		System.out.println("Estreno: " + this.getEstreno());
		System.out.println("Categoría: " + this.getCategoria());
		System.out.println("Valoración: " + this.valoracion);
		System.out.println("Código: " + key);
		System.out.println("========================");
		
		
	}
	
	public float valoracion() {
		
		float valoracion = (float) (Math.random() * 5);
		return (float) (Math.round(valoracion * 100.0) / 100.0);
		
		
	}
	

}
