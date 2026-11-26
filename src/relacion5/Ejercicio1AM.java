package relacion5;
import java.util.Scanner;

public class Ejercicio1AM {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		String Cadena;
		char letra;
		System.out.println("Introduce la palabra:");
		Cadena = teclado.nextLine();
		System.out.println("Introduce la letra que quieres contar");
		letra = teclado.nextLine().charAt(0);
		ContarLetras(Cadena, letra);
		

	}
	private static int ContarLetras (String Cadena, char letra) {
		int contador = 0;
		Cadena = Cadena.toLowerCase();
		letra = Character.toLowerCase(letra);
		for (int i = 0; i < Cadena.length(); i++) {
			if (Cadena.charAt(i) == letra) {
			    contador++;
			}
		}
		return contador;
	}
}
