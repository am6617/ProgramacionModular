package relacion4;
import java.util.Scanner;

public class Relacion4Act1AM {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int resultado = solicitarNumeroEnRango(10, 20);
		System.out.println("El numero devuelto es: " + resultado);
		
	}
	
	
	public static int solicitarNumeroEnRango (int limiteInferior, int limiteSuperior){
		int numero;
		if (limiteInferior > limiteSuperior) {
		    int auxiliar = limiteInferior;
		    limiteInferior = limiteSuperior;
		    limiteSuperior = auxiliar;
		}
		System.out.println("Introduzca un numero:");
		numero = Integer.parseInt(teclado.nextLine());
		do {
			if(numero < limiteInferior || numero > limiteSuperior) {
				System.out.println("El numero está fuera de rango");
				System.out.println("Introduzca un numero:");
				numero = Integer.parseInt(teclado.nextLine());
			}
		} while (numero < limiteInferior || numero > limiteSuperior);
		return numero;
		
	}

}
