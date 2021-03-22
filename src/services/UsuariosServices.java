package services;

import datos.GestionUsuarios;
import modelo.Usuario;
import utilidades.LecturaDatos;

public class UsuariosServices implements IUsuariosServices {
	GestionUsuarios usuarios = new GestionUsuarios();

	public void addUsuario() {
		Usuario user = new Usuario();
		user.crearUsuario();
		usuarios.altaUsuarios((int) (Math.random() * 100000) + 1, user);
	}
	public void eliminarUsuario() {
		int cod = LecturaDatos.leerInt("Introduce el código del usuario que quieres eliminar:");
		usuarios.eliminarUsuario(cod);
	}
	public void modificarUsuario() {
		int cod = LecturaDatos.leerInt("Introduce el código del usuario que quieres modificar:");
		usuarios.modificarUsuario(cod);
	}
	public void listarUsuarios() {
		usuarios.listarUsuarios();
	}
}
