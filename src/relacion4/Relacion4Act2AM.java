package relacion4;

import java.util.Scanner;

public class Relacion4Act2AM {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Introduzca un numero limite para calcular factoriales:");
		numero = Integer.parseInt(teclado.nextLine());
		
		for (int i = 0; i <= numero; i++) {
			int factorial = calcularFactorial(i);
			System.out.println(i + "! = " + factorial);
		}
	}
	
	public static int calcularFactorial (int numero) {
		if(numero < 0) {
			System.out.println("Error");
			return -1;
		}
		int resultado = 1;
		
		for (int i = numero; i >= 1; i--) {
		    resultado = resultado * i;
		}
		return resultado;
	}
}
