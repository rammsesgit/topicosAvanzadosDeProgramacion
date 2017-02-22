package aplicacion;

import recursividad.TorresDeHanoi;
import javax.swing.JOptionPane;

/**
 * @author Cadena Gaona Isar Ramses, Martinez Villafañe Diego Said
 * @version v1_2017/02/21
 *
 *          Clase aplicación.
 */
public class AplicacionTorresDeHanoi {
	/**
	 * Método main que brinda una interfaz gráfica con la que interactúa el
	 * usuario.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeroDeDiscos = 0;

		try {
			// El usuario ingresa el número de discos.
			numeroDeDiscos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de discos"));

			// Se muestra un mensaje que a su ves manda a llamar al método
			// Torres De Hanoi
			JOptionPane.showMessageDialog(null, TorresDeHanoi.metodoTorresDeHanoi(numeroDeDiscos));
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Introduzca un número entre 1 y 20");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}