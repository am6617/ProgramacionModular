package relacionArrays;
import java.util.Scanner;

public class Ejercicio4AM {

	private static Scanner teclado = new Scanner(System.in);
    
	public static void main(String[] args) {

        

        int[] almacen = {20, 22, 5, 12, 15, 8, 10, 18, 7, 14, 9};

        int opcion;
        int numero;
        int posicion;

        do {

            System.out.println("\n--- ZAPATERIA ---");
            System.out.println("1. Ver disponibilidad");
            System.out.println("2. Venta");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Introduce el numero de calzado (35-45): ");
                    numero = teclado.nextInt();

                    if (numero >= 35 && numero <= 45) {

                        posicion = numero - 35;

                        System.out.println("Hay " + almacen[posicion]
                                + " zapatillas disponibles.");

                    } else {
                        System.out.println("Numero no valido.");
                    }

                    break;

                case 2:

                    System.out.print("Introduce el numero de calzado (35-45): ");
                    numero = teclado.nextInt();

                    if (numero >= 35 && numero <= 45) {

                        posicion = numero - 35;

                        if (almacen[posicion] > 0) {

                            almacen[posicion]--;

                            System.out.println("Venta realizada correctamente.");
                            System.out.println("Unidades restantes: "
                                    + almacen[posicion]);

                        } else {

                            System.out.println("No quedan zapatillas de ese numero.");
                        }

                    } else {
                        System.out.println("Numero no valido.");
                    }

                    break;

                case 3:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 3);

    }
}
