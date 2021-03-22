package datos;

import java.util.HashMap;
import java.util.Map;

import modelo.Usuario;

public class GestionUsuarios {
	private Map<Integer, Usuario> listaUsuarios = new HashMap<>();

	public GestionUsuarios() {

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
	/**
	 * Añade un usuario al HashMap. Recibe por parámetro un Integer (codigo) con la key
	 * del mapa y un user (Usuario), que es el usuario a añadir. Devuelve true si el alta 
	 * se ha realizado con éxito y false si falla.
	 * 
	 * @author Víctor
	 * @param codigo, user
	 * @return boolean
	 * 
	 */
	// TODO Añadir throw exception y se puede mirar cómo se genera el código
	public boolean altaUsuarios(Integer codigo, Usuario user) {
		if(codigo == null) return false;
		if (listaUsuarios.containsKey(codigo)) {
			System.out.println("Este id ya está en la lista de usuarios.");
			return false;
		} else {
			listaUsuarios.put(codigo, user);
			return true;
		}
	}

	public boolean modificarUsuario(Integer codigo) {
		if(codigo == null) return false;
		if (listaUsuarios.containsKey(codigo)) {
			System.out.println("### Modificación del usuario con código " + codigo + " ###");
			listaUsuarios.get(codigo).crearUsuario();
			System.out.println("### Usuario actualizado ###");
			System.out.println(listaUsuarios.get(codigo).toString());
			return true;
		} else {
			System.out.println("El código de usuario introducido no existe");
			return false;
		}
	}

	// metodo eliminarUsuario, falta añadir exception

	public boolean eliminarUsuario(Integer codigo) {
		if (listaUsuarios.containsKey(codigo)) {
			listaUsuarios.remove(codigo);
			System.out.println("### Eliminación del usuario con código " + codigo + " ###");
			System.out.println("### Usuario eliminado ###");
			return true;
		} else {
			System.out.println("El usuario no existe ");
			return false;
		}

	}

	public void listarUsuarios() {
		System.out.println("### Listado de usuarios ###");
		for (Integer key : listaUsuarios.keySet()) {
			System.out.print(listaUsuarios.get(key).toString());
			System.out.println(" -  Código de usuario: " + key);
		}
	}

}
