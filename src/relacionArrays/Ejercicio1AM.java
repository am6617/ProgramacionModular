package relacionArrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1AM {

	private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[] misNumeros = numerosAleatorios();

        System.out.print("Números aleatorios: ");
        for (int i = 0; i < misNumeros.length; i++) {
            System.out.print(misNumeros[i] + " ");
        }
        System.out.println();

        System.out.print("Introduce límite: ");
        int limite = Integer.parseInt(teclado.nextLine());
        int contador = 0;
        for (int i = 0; i < misNumeros.length; i++) {
            if (misNumeros[i] > limite) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números aleatorios superiores a " + limite);
        
        
    }
    
    private static int[] numerosAleatorios() {
        Random random = new Random();
        int[] numeros = new int[10];
        int min = 1;
        int max = 100;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(max - min + 1) + min;
        }

        return numeros;
    }
}