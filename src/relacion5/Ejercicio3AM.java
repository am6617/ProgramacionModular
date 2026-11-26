package relacion5;
import java.util.Scanner;

public class Ejercicio3AM {

    private static Scanner teclado = new Scanner(System.in);

    
    public static void main(String[] args) {

        

        String cadena;

        System.out.println("Introduce una cadena:");
        cadena = teclado.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }

    public static String invertirCadena(String cadena) {

        String inversa = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversa = inversa + cadena.charAt(i);
        }

        return inversa;
    }

    public static boolean esPalindromo(String cadena) {

        String inversa = invertirCadena(cadena);

        return cadena.equalsIgnoreCase(inversa);
    }
}
