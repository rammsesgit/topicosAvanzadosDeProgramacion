package aplicacion;

import recursividad.TorresDeHanoi;
import javax.swing.JOptionPane;

/**
 * @author Cadena Gaona Isar Ramses, Martinez Villafa�e Diego Said
 * @version v1_2017/02/21
 *
 *          Clase aplicaci�n.
 */
public class AplicacionTorresDeHanoi {
	/**
	 * M�todo main que brinda una interfaz gr�fica con la que interact�a el
	 * usuario.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeroDeDiscos = 0;

		try {
			// El usuario ingresa el n�mero de discos.
			numeroDeDiscos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n�mero de discos"));

			// Se muestra un mensaje que a su ves manda a llamar al m�todo
			// Torres De Hanoi
			JOptionPane.showMessageDialog(null, TorresDeHanoi.metodoTorresDeHanoi(numeroDeDiscos));
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Introduzca un n�mero entre 1 y 20");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}