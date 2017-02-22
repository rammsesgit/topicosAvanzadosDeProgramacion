package recursividad;

import general.MetodosGenerales;

/**
 * @author Isar Ramses Cadena Gaona
 * @version 1.0 2017/02/01
 * 
 *          Clase instanciable que contiene métodos recursivos.
 */

public class MetodosRecursivos {
	static int contador = 0;

	public MetodosRecursivos() {
		// Ya que mi clase aplicación crea un único objeto que pone a
		// disposicion todos los métodos para ser usados una cantidad de veces
		// indefinida, el incremento del contador se encuentra en cada uno de
		// los métodos y no aquí.
		// contador++;
	}

	public static int getContador() {
		return contador;
	}

	/**
	 * Método que recibe un número (n) y valida que sea mayor que 0 y menor que
	 * 171 y manda a llamar a un método recursivo que muestra el factorial de n.
	 * 
	 * @param n
	 * @return factorialRecursivo(n)
	 * @throws Exception
	 */
	public static int factorial(int n) throws Exception {
		contador++;
		// MetodosRecursivos referencia = new MetodosRecursivos();
		if (n >= 1 && n <= 170) {
			// return referencia.factorialRecursivo(n);
			return factorialRecursivo(n);
		} else {
			throw new Exception("Sólo se admiten números enteros comprendidos entre 1 y 170");
		}
	}

	/**
	 * Método recursivo que recibe un número (n) y muestra su factorial.
	 * 
	 * @param n
	 * @return 1, n * factorialRecursivo(n - 1)
	 */
	private static int factorialRecursivo(int n) {
		if (n == 1) {// Caso base.
			return 1;
		} else {
			return n * factorialRecursivo(n - 1);
		}
	}

	/**
	 * Método que recibe un número (n), valida que n >= 1 y manda llamar a un
	 * método recursivo para imprimir una cuenta progresiva.
	 * 
	 * @param n
	 * @throws Exception
	 * @return sinValoresDeRetorno
	 */
	public static void cuentaProgresivaDe1A(int n) throws Exception {
		contador++;
		if (n >= 1) {
			// Se crea la variable cuyo valor es necesario mantener
			// constante para que el método recursivo imprima la cuenta
			// progresiva.
			int constante = n - 1;
			cuentaProgresivaDe1ANRecursiva(n, constante);
		}
		throw new Exception("Sólo se admiten números positivos");
	}

	/**
	 * Método recursivo que recibe un número (n) e imprime los números enteros
	 * comprendidos entre 1 y n como cuenta progresiva.
	 * 
	 * @param n
	 * @param constante
	 * @return sinValoresDeRetorno
	 */
	private static void cuentaProgresivaDe1ANRecursiva(int n, int constante) {
		if (n == constante * 2 + 1) {
			System.out.println(constante + 1);
			System.exit(0);
		} else {
			System.out.println(n - constante);
			cuentaProgresivaDe1ANRecursiva(n + 1, constante);
		}
	}

	/**
	 * Método que recibe un número (n), valida que n >= 1 y manda llamar a un
	 * método recursivo para imprimir una cuenta regresiva.
	 * 
	 * @param n
	 * @throws Exception
	 * @return sinValoresDeRetorno
	 */
	public static void cuentaRegresivaDeNA1(int n) throws Exception {
		contador++;
		if (n >= 1) {
			cuentaRegresivaDeNA1Recursiva(n);
		}
		throw new Exception("Solo se admiten números positivos");
	}

	/**
	 * Método recursivo que recibe un número (n) e imprime los números enteros
	 * comprendidos entre 1 y n como cuenta regresiva.
	 * 
	 * @param n
	 * @return sinValoresDeRetorno
	 */
	private static void cuentaRegresivaDeNA1Recursiva(int n) {
		if (n == 1) {
			System.out.println(1);
			System.exit(0);
		} else {
			System.out.println(n);
			cuentaRegresivaDeNA1Recursiva(n - 1);
		}
	}

	/**
	 * Método que recibe un número (base) y un exponencial, valida que el
	 * exponencial >= 0 y manda llamar a un método recursivo para mostrar el
	 * resultado.
	 * 
	 * @param base
	 * @param exponencial
	 * @return double
	 * @throws Exception
	 */
	public static double potencia(int base, int exponencial) throws Exception {
		contador++;
		if (exponencial >= 0) {
			return potenciaRecursiva(base, exponencial);
		}
		throw new Exception("El exponencial no puede ser negativa");
	}

	/**
	 * Método recursivo que recibe un número (base) y un exponencial y muestra
	 * su resultado.
	 * 
	 * @param base
	 * @param exponencial
	 * @return double
	 */
	private static double potenciaRecursiva(int base, int exponencial) {
		if (exponencial == 0) {// Caso base 1.
			return 1;
		} else if (exponencial == 1) {// Caso base 2.
			return base;
		}
		return base * potenciaRecursiva(base, exponencial - 1);
	}

	/**
	 * Método que recibe un número (n), calcula su valor absoluto y manda llamar
	 * a un método recursivo para mostrar cada uno de sus dígitos.
	 * 
	 * @param n
	 */
	public static void muestraDigitosProgresivo(int n) {
		contador++;
		muestraDigitosDeNRecursivo(Math.abs(n));
	}

	/**
	 * Método recursivo que recibe un número (n) y muestra cada uno de sus
	 * dígitos haciendo uso de un método que imprime el nombre de cada número.
	 * 
	 * @param n
	 */
	private static void muestraDigitosDeNRecursivo(int n) {
		MetodosGenerales metodosGenerales = new MetodosGenerales();
		if (n <= 9) {
			System.out.println(metodosGenerales.mostrarNombreDeNumeros(n));
		} else {
			muestraDigitosDeNRecursivo(n / 10);
			System.out.println(metodosGenerales.mostrarNombreDeNumeros(n % 10));
		}
	}

	/**
	 * Método que recibe un número entero positivo decimal, valida que sea >= 1
	 * y manda a llamar a un método recursivo que imprime su valor en notación
	 * binaria.
	 * 
	 * @param decimal
	 * @throws Exception
	 */
	public static void decimalABinario(int decimal) throws Exception {
		contador++;
		if (decimal >= 1) {
			decimalABinarioRecursivo(decimal);
		} else {
			throw new Exception("Solo números enteros positivos");
		}
	}

	/**
	 * Método recursivo que recibe un número entero positivo decimal e imprime
	 * su valor en notación binaria.
	 * 
	 * @param decimal
	 */
	private static void decimalABinarioRecursivo(long decimal) {
		if (decimal == 1) {// Caso base.
			System.out.print(decimal);
		} else {
			decimalABinarioRecursivo(decimal / 2);
			System.out.print(decimal % 2);
		}
	}

	/**
	 * Método que recibe un número binario, valida que sea >= 0, inicializa las
	 * variables "exponencial" y "resultadoDecimal", y manda a llamar a un
	 * método recursivo que muestra su valor en notación decimal.
	 * 
	 * @param binario
	 * @return binarioADecimalRecursivo(binario, exponencial, resultadoDecimal)
	 * @throws Exception
	 */
	public static int binarioADecimal(int binario) throws Exception {
		contador++;
		if (binario >= 0) {
			int exponencial = 0, resultadoDecimal = 0;
			return binarioADecimalRecursivo(binario, exponencial, resultadoDecimal);
		} else {
			throw new Exception("No se admiten números negativos");
		}
	}

	/**
	 * Método recursivo que recibe un número en binario y muestra su valor en
	 * notación decimal.
	 * 
	 * @param binario
	 * @param exponencial
	 * @param resultadoDecimal
	 * @return binarioADecimalRecursivo(binario, exponencial, resultadoDecimal)
	 */
	private static int binarioADecimalRecursivo(int binario, int exponencial, int resultadoDecimal) {
		if (binario == 0) {
			return resultadoDecimal;
		} else {
			resultadoDecimal += (binario % 10) * (int) Math.pow(2, exponencial);
			exponencial++;
			binario /= 10;
			return binarioADecimalRecursivo(binario, exponencial, resultadoDecimal);
		}
	}

	/**
	 * Método que recibe dos números enteros (dividendo y divisor), valida que
	 * sean positivos y manda a llamar a un método recursivo.
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return divisionEntre2EnterosRecursivo(dividendo, divisor, 1)
	 * @throws Exception
	 */
	public static int divisionEntre2Enteros(int dividendo, int divisor) throws Exception {
		contador++;
		if (dividendo >= 1 && divisor >= 1) {
			return divisionEntre2EnterosRecursivo(dividendo, divisor, 0);
		}
		throw new Exception("Solo números positivos");
	}

	/**
	 * Método recursivo que recibe un dividendo y un divisor para calcular su
	 * cociente.
	 * 
	 * @param dividendo
	 * @param divisor
	 * @param resultado
	 * @return divisionEntre2EnterosRecursivo((dividendo - divisor), divisor,
	 *         resultado)
	 */
	private static int divisionEntre2EnterosRecursivo(int dividendo, int divisor, int resultado) {
		if (dividendo < divisor) {// Caso base.
			return resultado;
		} else if (dividendo - divisor >= 0) {
			resultado++;
		}
		return divisionEntre2EnterosRecursivo((dividendo - divisor), divisor, resultado);
	}

	// Método visto en clase.
	public static int cocienteEntre2EnterosRecursivo(int dividendo, int divisor) {
		if (dividendo < divisor) {// Caso base.
			return 1 + cocienteEntre2EnterosRecursivo((dividendo - divisor), divisor);
		}
		return 1 + cocienteEntre2EnterosRecursivo((dividendo - divisor), divisor);
	}

	/**
	 * Método que recibe dos números enteros (dividendo y divisor), valida que
	 * sean positivos y manda a llamar a un método recursivo.
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return divisionEntre2EnterosRecursivo(dividendo, divisor, 1)
	 * @throws Exception
	 */
	public static int residuoEntre2Enteros(int dividendo, int divisor) throws Exception {
		contador++;
		if (dividendo >= 1 && divisor >= 1) {
			return residuoEntre2EnterosRecursivo(dividendo, divisor);
		}
		throw new Exception("Solo números positivos");
	}

	/**
	 * Método recursivo que recibe un dividendo y un divisor para calcular y
	 * regresar su residuo.
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return
	 */
	private static int residuoEntre2EnterosRecursivo(int dividendo, int divisor) {
		if (dividendo < divisor) {// Caso base.
			return dividendo;
		}
		return residuoEntre2EnterosRecursivo((dividendo - divisor), divisor);
	}

	/**
	 * Método que recibe una palabra y manda llamar a un método recursivo.
	 * 
	 * @param palabra
	 * @return isPalabraPalindromaRecursvio(palabra, 0, palabra.length() - 1)
	 */
	public static boolean isPalabraPalindroma(String palabra) {
		contador++;
		return isPalabraPalindromaRecursvio(palabra, 0, palabra.length() - 1);
	}

	/**
	 * Método recursivo que recibe una palabra y dos indices y regresa true o
	 * false si es palindroma o no.
	 * 
	 * @param palabra
	 * @param inferior
	 * @param superior
	 * @return isPalabraPalindromaRecursvio(palabra, ++inferior, --superior)
	 */
	private static boolean isPalabraPalindromaRecursvio(String palabra, int inferior, int superior) {
		if (palabra.charAt(inferior) != palabra.charAt(superior)) {
			// Caso base 1, si los extremos NO coinciden.
			return false;
		} else if (palabra.length() == 1) {
			// Caso base 2, Si solo hay una letra.
			return true;
		} else if (inferior + 1 == superior || inferior == superior) {
			return true;
		}
		return isPalabraPalindromaRecursvio(palabra, ++inferior, --superior);
	}

	/**
	 * Método que recibe una oración, quita los espacios y convierte cada letra
	 * a minúscula, para despues mandarla por parámetro al método
	 * isPalabraPalindroma.7
	 * 
	 * @param oracion
	 * @return isPalabraPalindroma(Oracion.replaceAll("\\s", "").toLowerCase())
	 */
	public static boolean isOracionPalindroma(String oracion) {
		// replaceAll("\\s", "") reemplaza todos los espacios, tabuladores y
		// retornos.
		return isPalabraPalindroma(oracion.replaceAll("\\s", "").toLowerCase());
	}

	/**
	 * Método que recibe un número y envía su valor absoluto por parámetro a un
	 * método recursivo.
	 * 
	 * @param n
	 * @return cantidadDedígitosDeNRecursivo(Math.abs(numero), 0)
	 */
	public static int cantidadDeDigitosDe(int numero) {
		contador++;
		return cantidadDeDigitosDeNRecursivo(Math.abs(numero), 0);
	}

	/**
	 * Método recursivo que regresa la cantidad de dígitos del número que recibe
	 * por parámetro.
	 * 
	 * @param n
	 * @param cantidadDedígitos
	 * @return cantidadDedígitosDeNRecursivo(n / 10, cantidadDedígitos)
	 */
	private static int cantidadDeDigitosDeNRecursivo(int numero, int cantidadDedígitos) {
		if (numero <= 9) {// Caso base.
			return cantidadDedígitos + 1;
		}
		cantidadDedígitos++;
		return cantidadDeDigitosDeNRecursivo(numero / 10, cantidadDedígitos);
	}

	/**
	 * Método que recibe un número y manda su valor absoluto a un método
	 * recursivo.
	 * 
	 * @param n
	 * @return sumaDeCadaDigitoDeNRecursivo(Math.abs(n), 0)
	 */
	public static int sumaDeCadaDigitoDe(int numero) {
		contador++;
		return sumaDeCadaDigitoDeNRecursivo(Math.abs(numero), 0);
	}

	/**
	 * Método recursivo que recibe un número y regresa la suma de cada uno de
	 * sus dígitos.
	 * 
	 * @param n
	 * @param suma
	 * @return sumaDeCadaDigitoDeNRecursivo(n / 10, suma)
	 */
	private static int sumaDeCadaDigitoDeNRecursivo(int numero, int suma) {
		if (numero <= 9) {
			return suma += numero;
		} else {
			suma += numero % 10;
			return sumaDeCadaDigitoDeNRecursivo(numero / 10, suma);
		}
	}

	/**
	 * Método que recibe un String que contiene un número y llama a un método
	 * recursivo.
	 * 
	 * @param n
	 * @return sumaDeCadaDigitoDeNRecursivo(Math.abs(n), 0)
	 */
	public static int sumaDeCadaDigitoDe(String numero) {
		contador++;
		return sumaDeCadaDigitoDeNRecursivo(numero, numero.length() - 1, 0);
	}

	/**
	 * Método recursivo que recibe un String, convierte cada carácter en un
	 * digito y regresa la suma de cada uno de ellos.
	 * 
	 * @param n
	 * @param suma
	 * @return sumaDeCadaDigitoDeNRecursivo(n / 10, suma)
	 */
	private static int sumaDeCadaDigitoDeNRecursivo(String numero, int indice, int suma) {
		if (indice == 0) {
			return suma += (int) (numero.charAt(indice) - 48);
		}
		suma += (int) (numero.charAt(indice) - 48);
		return sumaDeCadaDigitoDeNRecursivo(numero, --indice, suma);
	}

	/**
	 * Método que recibe un numero (float) y envía su valor absoluto.
	 * 
	 * @param n
	 * @return sumaDeCadaDigitoDeNRecursivo(Math.abs(n), 0, n / 10)
	 */
	public static int sumaDeCadaDigitoDe(float numero) {
		contador++;
		return sumaDeCadaDigitoDeNRecursivo(Math.abs(numero), 0, numero / 10);
	}

	/**
	 * Método recursivo que recibe un número (double) y regresa la suma de cada
	 * uno de sus dígitos.
	 * 
	 * @param n
	 * @param suma
	 * @param decimal
	 * @return sumaDeCadaDigitoDeNRecursivo(Math.floor(n / 10), suma, decimal /
	 *         10)
	 */
	private static int sumaDeCadaDigitoDeNRecursivo(double numero, float suma, float decimal) {
		if (numero <= 9) {
			return (int) (suma + numero);
		}
		suma += Math.floor((decimal - Math.floor(numero / 10)) * 10);
		return sumaDeCadaDigitoDeNRecursivo(Math.floor(numero / 10), suma, decimal / 10);
	}

}// class