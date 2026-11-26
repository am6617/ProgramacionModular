package relacion4; 
import java.util.Scanner;

public class Relacion4Act5AM {

    private static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        

        int hora, minutos, segundos, segundosASumar;

        do {
            System.out.print("Introduce la hora (0-23): ");
            hora = teclado.nextInt();
        } while (hora < 0 || hora > 23);

        do {
            System.out.print("Introduce los minutos (0-59): ");
            minutos = teclado.nextInt();
        } while (minutos < 0 || minutos > 59);

        do {
            System.out.print("Introduce los segundos (0-59): ");
            segundos = teclado.nextInt();
        } while (segundos < 0 || segundos > 59);

        do {
            System.out.print("Introduce los segundos a sumar: ");
            segundosASumar = teclado.nextInt();
        } while (segundosASumar < 0);

        pintarNuevaHora(hora, minutos, segundos, segundosASumar);

        teclado.close();
    }

    public static void pintarNuevaHora(int horaActual, int minutosActuales,
            int segundosActuales, int segundosASumar) {

        System.out.println("La hora anterior era " + horaActual + ":"
                + minutosActuales + ":" + segundosActuales);

        int segundosTotales = horaActual * 3600
                + minutosActuales * 60
                + segundosActuales
                + segundosASumar;

        int nuevaHora = (segundosTotales / 3600) % 24;
        int nuevosMinutos = (segundosTotales % 3600) / 60;
        int nuevosSegundos = segundosTotales % 60;

        System.out.println("La nueva hora es " + nuevaHora + ":"
                + nuevosMinutos + ":" + nuevosSegundos);
            }
        }