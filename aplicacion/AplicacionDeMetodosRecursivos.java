package aplicacion;

import javax.swing.JOptionPane;
import recursividad.MetodosRecursivos;

/**
 * @author Isar Ramses Cadena Gaona
 * @version 1.0_2017/02/01, última modificiación 2017/02/17
 * 
 *          Clase aplicación que hace uso de la clase MetodosRecursivos y brinda
 *          una interfaz gráfica con la que pueda interactuar el usuario.
 */

public class AplicacionDeMetodosRecursivos {

	public static void main(String[] args) {
		// Crear el objeto no es necesario pues todos los métodos son static
		// MetodosRecursivos MetodosRecursivos = new MetodosRecursivos();

		// Arreglo de String que contiene las opciones del menú que verá el
		// usuario.
		String[] opcionesDelMenu = { "Factorial", "Cuenta Progresiva", "Cuenta Regresiva", "Elevar X a la Y",
				"Mostrar digitos de una cifra", "Decimal a binario", "Binario a decimal", "Cociente",
				"Palabra palindroma", "Oracion palindroma", "Residuo", "Cantidad de digitos de 'n'",
				"Suma de cada dígito", "Contador de uso", "Salir" };

		// Variable donde se guarda la opcion que elija el usuario.
		String opcionElegida = "";

		do {
			try {
				// Menú para el usuario.
				opcionElegida = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
						"Opciones para el usuario", JOptionPane.DEFAULT_OPTION, null, opcionesDelMenu,
						opcionesDelMenu[0]);

				switch (opcionElegida) {
				case "Factorial":
					JOptionPane.showMessageDialog(null, MetodosRecursivos.factorial(Integer
							.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial"))));
					break;

				case "Cuenta Progresiva":
					MetodosRecursivos.cuentaProgresivaDe1A(
							Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valaor de  'n'")));
					break;

				case "Cuenta Regresiva":
					MetodosRecursivos.cuentaRegresivaDeNA1(
							Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valaor de  'n'")));
					break;

				case "Elevar X a la Y":
					int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'X'"));
					int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'Y'"));
					JOptionPane.showMessageDialog(null, MetodosRecursivos.potencia(x, y));
					break;

				case "Mostrar digitos de una cifra":
					MetodosRecursivos.muestraDigitosProgresivo(
							Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cifra")));
					break;

				case "Decimal a binario":
					MetodosRecursivos.decimalABinario(
							Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo")));
					break;

				case "Binario a decimal":
					JOptionPane.showMessageDialog(null, MetodosRecursivos.binarioADecimal(
							Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero binario"))));
					break;

				case "Cociente":
					JOptionPane.showMessageDialog(null,
							MetodosRecursivos.divisionEntre2Enteros(
									Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo")),
									Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor"))));
					/*
					 * Método visto en clase
					 * 
					 * JOptionPane.showMessageDialog(null,
					 * MetodosRecursivos.cocienteEntre2EnterosRecursivo(
					 * Integer.parseInt(JOptionPane.
					 * showInputDialog("Ingrese el dividendo")),
					 * Integer.parseInt(JOptionPane.
					 * showInputDialog("Ingrese el divisor"))));
					 */
					break;

				case "Residuo":
					JOptionPane.showMessageDialog(null,
							MetodosRecursivos.residuoEntre2Enteros(
									Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo")),
									Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor"))));

					break;

				case "Palabra palindroma":
					if (MetodosRecursivos.isPalabraPalindroma(JOptionPane.showInputDialog("Ingrese la palabra"))) {
						JOptionPane.showMessageDialog(null, "Si es palindroma");
					} else {
						JOptionPane.showMessageDialog(null, "No es palindroma");
					}
					break;

				case "Oracion palindroma":
					if (MetodosRecursivos.isOracionPalindroma(JOptionPane.showInputDialog("Ingrese la oración"))) {
						JOptionPane.showMessageDialog(null, "Si es palindroma");
					} else {
						JOptionPane.showMessageDialog(null, "No es palindroma");
					}
					break;

				case "Cantidad de digitos de 'n'":
					JOptionPane.showMessageDialog(null, MetodosRecursivos
							.cantidadDeDigitosDe(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"))));
					break;

				case "Suma de cada dígito":
					JOptionPane.showMessageDialog(null, MetodosRecursivos.sumaDeCadaDigitoDe(Integer.parseInt(
							JOptionPane.showInputDialog("(Metodo 1, con diviciones y residuos)\nIngrese el número"))));

					JOptionPane.showMessageDialog(null, MetodosRecursivos.sumaDeCadaDigitoDe(
							JOptionPane.showInputDialog("(Metodo 2, uso de charAt)\nIngrese el número")));

					JOptionPane.showMessageDialog(null, MetodosRecursivos.sumaDeCadaDigitoDe(Integer
							.parseInt(JOptionPane.showInputDialog("(Metodo 3, con doubles)\nIngrese el número"))));

					break;

				case "Contador de uso":
					JOptionPane.showMessageDialog(null,
							"Se han utilizado " + MetodosRecursivos.getContador() + " métodos recursivos.");
					break;
				}// switch
			} catch (NullPointerException npe) {
				// Termina la aplicación.
				opcionElegida = "Salir";
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Ingrese unicamente cantidades numericas");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (!opcionElegida.equals("Salir"));

	}// main
}// class