
package relacionArrays;

import java.util.Scanner;

public class Ejercicio7AM {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[] temperaturaMensual = new int[12];

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        solicitarTemperaturas(temperaturaMensual, meses);
        mostrarTemperaturas(temperaturaMensual, meses);
        mostrarDiagrama(temperaturaMensual, meses);
    }

    private static int[] solicitarTemperaturas(int[] temperaturaMensual, String[] meses) {

        for (int contador = 0; contador < 12; contador++) {

            System.out.println("Introduce la temperatura de " + meses[contador]);
            temperaturaMensual[contador] = Integer.parseInt(teclado.nextLine());

            while (temperaturaMensual[contador] < 0 || temperaturaMensual[contador] > 45) {
                System.out.println("Temperatura incorrecta. Introduce un valor entre 0 y 45:");
                temperaturaMensual[contador] = Integer.parseInt(teclado.nextLine());
            }
        }

        return temperaturaMensual;
    }

    private static void mostrarTemperaturas(int[] temperaturaMensual, String[] meses) {

        for (int contador = 0; contador < 12; contador++) {
            System.out.println(meses[contador] + ": " + temperaturaMensual[contador]);
        }
    }

    private static void mostrarDiagrama(int[] temperaturaMensual, String[] meses) {

        for (int contador = 0; contador < 12; contador++) {

            System.out.print(meses[contador] + ": ");

            for (int i = 0; i < temperaturaMensual[contador]; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
