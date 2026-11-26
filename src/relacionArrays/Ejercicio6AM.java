package relacionArrays;
import java.util.Random;

public class Ejercicio6AM {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] combinacion = new int[6];

        int numero;
        int contador = 0;

        while (contador < combinacion.length) {

            numero = aleatorio.nextInt(49) + 1;

            if (!estaEnArray(combinacion, numero)) {

                combinacion[contador] = numero;
                contador++;

            }

        }
        
        
        System.out.println("--- LOTERIA PRIMITIVA ---");
        System.out.println("Tu combinacion es:");

        for (int i = 0; i < combinacion.length; i++) {

            System.out.print(combinacion[i] + " ");

        }

        System.out.println();

    }
    private static boolean estaEnArray(int[] numeros, int numero) {

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == numero) {

                return true;

            }

        }

        return false;
    }
}
