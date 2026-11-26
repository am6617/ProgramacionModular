package relacionArrays;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio8AM {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("¿Cuántos invitados asistirán?");
        int cantidad = Integer.parseInt(teclado.nextLine());

        String[] nombres = new String[cantidad];
        boolean[] vip = new boolean[cantidad];

        solicitarInvitados(nombres, vip);

        System.out.println("\nLISTADO DE PERSONAS VIP:");
        mostrarVip(nombres, vip);

        String[] nombresVip = crearArrayVip(nombres, vip);

        Arrays.sort(nombresVip);

        System.out.println("\nLISTADO DE PERSONAS VIP ORDENADAS:");
        mostrarArray(nombresVip);
    }

    private static void solicitarInvitados(String[] nombres, boolean[] vip) {

        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Introduce el nombre del invitado " + (i + 1) + ":");
            nombres[i] = teclado.nextLine();

            System.out.println("¿Es VIP? (si/no)");
            String respuesta = teclado.nextLine();

            while (!respuesta.equalsIgnoreCase("si") &&
                   !respuesta.equalsIgnoreCase("no")) {

                System.out.println("Respuesta incorrecta. Introduce si o no:");
                respuesta = teclado.nextLine();
            }

            vip[i] = respuesta.equalsIgnoreCase("si");
        }
    }

    private static void mostrarVip(String[] nombres, boolean[] vip) {

        for (int i = 0; i < nombres.length; i++) {

            if (vip[i] == true) {
                System.out.println(nombres[i]);
            }
        }
    }

    private static String[] crearArrayVip(String[] nombres, boolean[] vip) {

        int contadorVip = 0;

        for (int i = 0; i < vip.length; i++) {
            if (vip[i] == true) {
                contadorVip++;
            }
        }

        String[] nombresVip = new String[contadorVip];

        int posicion = 0;

        for (int i = 0; i < nombres.length; i++) {

            if (vip[i] == true) {
                nombresVip[posicion] = nombres[i];
                posicion++;
            }
        }

        return nombresVip;
    }

    private static void mostrarArray(String[] nombres) {

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
