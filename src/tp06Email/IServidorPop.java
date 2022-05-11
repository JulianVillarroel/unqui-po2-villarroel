package tp06Email;

import java.util.List;

public interface IServidorPop {

	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passUsuario);
	
	public void enviar(Correo correo);
}
