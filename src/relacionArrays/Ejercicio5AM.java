package relacionArrays;
import java.util.Random;

public class Ejercicio5AM {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] duracionVideos = new int[8];

        int videosLargos = 0;
        int tiempoTotal = 0;
        int posicionMayor = 0;
        int mayorDuracion = 0;
        int posicionSaltado = -1;

        for (int i = 0; i < duracionVideos.length; i++) {

            duracionVideos[i] = aleatorio.nextInt(100) + 1;

        }

        

        System.out.println("--- DURACION DE LOS VIDEOS ---");

        for (int i = 0; i < duracionVideos.length; i++) {

            System.out.println("Video " + (i + 1) + ": "
                    + duracionVideos[i] + " segundos");

        }

        for (int i = 0; i < duracionVideos.length; i++) {

            if (duracionVideos[i] > 45) {

                videosLargos++;

            }

        }

        System.out.println("\nVideos largos: " + videosLargos);

        for (int i = 0; i < duracionVideos.length; i++) {

            tiempoTotal += duracionVideos[i];

        }

        int minutos = tiempoTotal / 60;
        int segundos = tiempoTotal % 60;

        System.out.println("Tiempo total: " + minutos
                + " minutos y " + segundos + " segundos");

        for (int i = 0; i < duracionVideos.length; i++) {

            if (duracionVideos[i] > mayorDuracion) {

                mayorDuracion = duracionVideos[i];
                posicionMayor = i + 1;

            }

        }

        System.out.println("Video mas largo: posicion "
                + posicionMayor + " (" + mayorDuracion + " segundos)");

        for (int i = 0; i < duracionVideos.length; i++) {

            if (duracionVideos[i] < 10) {

                posicionSaltado = i + 1;
                break;

            }

        }

        if (posicionSaltado != -1) {

            System.out.println("Primer video saltado: posicion "
                    + posicionSaltado);

        } else {

            System.out.println("No se ha saltado ningun video.");

        }

    }
}
