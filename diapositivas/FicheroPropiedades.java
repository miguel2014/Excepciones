package diapositivas;

import java.util.ResourceBundle;

public class FicheroPropiedades {
	public static void main(String[] args) {
		ResourceBundle configuracion=ResourceBundle.getBundle("configuracion");
		String usuario=configuracion.getString("login");
		String password=configuracion.getString("clave");
		System.out.println("Datos obtendidos: "+usuario +" " +password);
	}
}
