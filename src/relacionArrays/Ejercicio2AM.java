package relacionArrays;
import java.util.Scanner;
public class Ejercicio2AM {
	private static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		String[] paginasVisitadas = new String[10];
		solicitarPaginasVisitadas(paginasVisitadas);
		

	}
	private static void solicitarPaginasVisitadas(String[] paginasVisitadas) {
		String paginasWeb;
		for (int i = 0; i < paginasVisitadas.length; i++) {
			System.out.println("Introduce paginas web visitadas");
			paginasWeb = teclado.nextLine();
			paginasVisitadas[i] =paginasWeb;
		}
	}

}
