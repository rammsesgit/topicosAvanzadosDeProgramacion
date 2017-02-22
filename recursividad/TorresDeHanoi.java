package recursividad;

/**
 * @author Cadena Gaona Isar Ramses, Martinez Villafa�e Diego Said
 * @version v1_2017/02/21
 *
 */
public class TorresDeHanoi {
	// Variable que se va incrementando conforme se requieren movimientos.
	static int contadorDeMovimientos = 0;

	// Variable bandera que define si se muestran los movimientos en ventana
	// (true) o en consola (false), �sta cambia de valor seg�n sea el numero de
	// discos introducido.
	static boolean ventana = true;

	// Variable a la que se le van concatenando los movimientos necesarios para
	// mostrarla al final.
	static String solucion = "Mueva los discos seg�n el orden indicado: \nMov     Disco     Instrucci�n";

	/**
	 * M�todo que recibe un n�mero de discos, valida que sean <=5 y manda a
	 * llamar a un m�todo recursivo.
	 * 
	 * @param numeroDeDiscos
	 * @return metodoTorresDeHanoiRecursivo(numeroDeDiscos, 'A', 'B', 'C',
	 *         numeroDeDiscos)
	 */
	public static String metodoTorresDeHanoi(int numeroDeDiscos) throws Exception {
		if (Math.abs(numeroDeDiscos) <= 20) {
			if (Math.abs(numeroDeDiscos) > 5) {
				ventana = false;
			}
			return metodoTorresDeHanoiRecursivo(numeroDeDiscos, 'A', 'B', 'C', numeroDeDiscos);
		}
		throw new Exception("N�mero de discos excede el l�mite, introduzca m�ximo 20");
	}

	/**
	 * M�todo recursivo que a partir de un numero de discos recibido, regresa
	 * los movimientos necesarios para resolver el juego de las torres de Hanoi.
	 * 
	 * @param numeroDeDiscos
	 * @param origen
	 * @param auxiliar
	 * @param destino
	 * @param numeroDeDiscosOriginal
	 * @return metodoTorresDeHanoiRecursivo(numeroDeDiscos - 1, origen, destino,
	 *         auxiliar, numeroDeDiscosOriginal)
	 */
	private static String metodoTorresDeHanoiRecursivo(int numeroDeDiscos, char origen, char auxiliar, char destino,
			int numeroDeDiscosOriginal) {

		if (numeroDeDiscos == 1) {// Caso base.
			if (ventana) {
				// Si el n�mero de discos es menor o igual a 5; se concatena el
				// mensaje en la variable "solucion" que ser� mostrada al
				// finalizar todos los procesos necesarios.
				solucion += "\n#" + ++contadorDeMovimientos + "           " + numeroDeDiscos + "          De la torre "
						+ origen + " a la torre " + destino;
			} else {// Si no, el movimiento se imprime directamente en consola.
				System.out.println("#" + ++contadorDeMovimientos + "\t" + numeroDeDiscos + "\tDe la torre " + origen
						+ " a la torre " + destino);
			}
		} else {
			// El m�todo se manda llamar a si mismo con el numeroDeDiscos menos
			// uno, y el resto de los parametros iguales.
			metodoTorresDeHanoiRecursivo(numeroDeDiscos - 1, origen, destino, auxiliar, numeroDeDiscosOriginal);

			if (ventana) {
				// Si el n�mero de discos es menor o igual a 5; se concatena el
				// mensaje en la variable "solucion" que ser� mostrada al
				// finalizar todos los procesos necesarios.
				solucion += "\n#" + ++contadorDeMovimientos + "           " + numeroDeDiscos + "          De la torre "
						+ origen + " a la torre " + destino;
			} else {// Si no, el movimiento se imprime directamente en consola.
				System.out.println("#" + ++contadorDeMovimientos + "\t" + numeroDeDiscos + "\tDe la torre " + origen
						+ " a la torre " + destino);
			}

			// El m�todo se manda llamar a si mismo con el numeroDeDiscos menos
			// uno, y con dos parametros cambiados de orden (origen y auxiliar).
			metodoTorresDeHanoiRecursivo(numeroDeDiscos - 1, auxiliar, origen, destino, numeroDeDiscosOriginal);
		}
		return solucion;
	}
}// Class
