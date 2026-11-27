package relacion5;

import java.util.Scanner;

public class Ejercicio4AM {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        

        String usuario;
        String contraseña;

        System.out.println("Introduce el nombre de usuario:");
        usuario = teclado.nextLine();

        System.out.println("Introduce la contraseña:");
        contraseña = teclado.nextLine();

        if (ValidarUsuario(usuario) && ValidarContraseña(contraseña)) {
            System.out.println("Usuario y contraseña válidos");
        } else {
            System.out.println("Usuario o contraseña no válidos");
        }

    }

    private static boolean ValidarUsuario(String usuario) {

        if (usuario.length() > 30 || usuario.isEmpty()) {
            return false;
        }

        for (int i = 0; i < usuario.length(); i++) {

            if (!Character.isLetter(usuario.charAt(i))) {
                return false;
            }

        }

        return true;
    }

    private static boolean ValidarContraseña(String contraseña) {

        boolean tieneLetra = false;
        boolean tieneDigito = false;
        boolean tieneEspecial = false;

        if (contraseña.length() < 7) {
            return false;
        }

        for (int i = 0; i < contraseña.length(); i++) {

            char caracter = contraseña.charAt(i);

            if (Character.isLetter(caracter)) {
                tieneLetra = true;
            } else if (Character.isDigit(caracter)) {
                tieneDigito = true;
            } else {
                tieneEspecial = true;
            }

        }

        return tieneLetra && tieneDigito && tieneEspecial;
    }
}