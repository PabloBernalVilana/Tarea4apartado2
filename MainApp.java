package tarea4Apartado2;
/* @Author Pablo Bernal Vilana
 * declara 1 variable int
 * 1 variable double
 * 1 variable char
 * y muestra por pantalla unos resultados
*/
public class MainApp {

	public static void main(String[] args) {
		// Declaracion de las variables
		// y asignacion de una valor
		int N = 5;
		double A = 4.56;
		// la letra 'a' en codigo ASCII
		// equivale al numero 97
		char C = 'a';
		// conversion de ASCII en un tipo de dato entero
		int valorConvertido = (int)C;
		// muestra por pantalla el valor de las variables
		System.out.println("El valor de N = " + N);
		System.out.println("El valor de A = " + A);
		System.out.println("El valor de C = " + C);
		// muestra la suma de N+A
		System.out.println(N + " + " + A + " = " + (N + A));
		// muestra la diferencia de A-N
		System.out.println(A + " - " + N + " = " + (A - N));
		// muestra el valor numerico de C
		System.out.println("El valor numerico del caracter C = " + valorConvertido);
	}

}
