package datos;

import java.util.HashMap;
import java.util.Map;

import modelo.Usuario;

public class GestionUsuarios {
	private Map<Integer, Usuario> listaUsuarios = new HashMap<>();
	
	public GestionUsuarios () {
		
	}

	public GestionUsuarios(Map<Integer, Usuario> listaUsuarios) {
		super();
		this.listaUsuarios = listaUsuarios;
	}

	public Map<Integer, Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Map<Integer, Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	

	public boolean existeUsuario(Integer codigo) {
		return listaUsuarios.containsKey(codigo);
	}
	
	public Usuario buscarUsuario(Integer codigo) {
		return listaUsuarios.get(codigo);
	}
	
	//TODO Añadir throw exception y se puede mirar cómo se genera el código
	public void altaUsuarios(Integer codigo, Usuario user) {
		if(listaUsuarios.containsKey(codigo)) {
			System.out.println("Este id ya está en la lista de usuarios.");
		} else {
			listaUsuarios.put(codigo, user);
		}
	}	
	
	public void modificarUsuario(Integer codigo) {
		System.out.println("### Modificación del usuario con código " + codigo  + " ###");		
		listaUsuarios.get(codigo).crearUsuario();
		System.out.println("### Usuario actualizado ###");
		System.out.println(listaUsuarios.get(codigo).toString());
	}
	
	
}
