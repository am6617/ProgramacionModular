package relacion4;
import java.util.Scanner;

public class Relacion4Act4AM {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        

        System.out.print("Introduce el mes (1-12): ");
        int mes = teclado.nextInt();

        System.out.print("Introduce el año: ");
        int anio = teclado.nextInt();

        int dias = diasDeUnMes(mes, anio);

        if (dias == -1) {
            System.out.println("El mes introducido no es válido.");
        } else {
            System.out.println("El mes tiene " + dias + " días.");
        }

    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static int diasDeUnMes(int mes, int anio) {
        int dias;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;

            case 2:
                if (esBisiesto(anio)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;

            default:
                dias = -1;
                break;
        }

        return dias;
    }

    
}
