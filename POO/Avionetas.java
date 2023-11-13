/* El estacionamiento de las avionetas de un aeródromo es en línea, con una capacidad de hasta 12 avionetas.
Las avionetas llegan por el extremo izquierdo y salen por el extremo derecho.
Cuando llega un piloto a recoger su avioneta, si ésta no está justamente en el extremo de salida (derecho),
todas las avionetas a su derecha han de ser retiradas, sacar la suya y las retiradas colocadas de nuevo en el mismo orden relativo en que estaban.
La salida de una avioneta supone que las demás son movidas hacia delante, de tal forma que los espacios libres del estacionamiento están en la parte izquierda.
El programa para emular este estacionamiento tiene como entrada un carácter que indica una acción sobre la avioneta ,
y la matrícula de la avioneta. La acción puede ser llegada (E) o salida (S) de avioneta.
En la llegada puede ocurrir que el estacionamiento esté lleno; si es así, la avioneta espera hasta que se quede una plaza libre, o hasta que se de la orden de retirada (salida).

*/





import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Avionetas {

    public static void main(String[] args) {
        Queue<String> estacionamiento = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escriba (E para entrada y S para salida) y la patente de la avioneta:");
            String entrada = scanner.nextLine().toUpperCase();



            char accion = entrada.charAt(0);
            String matricula = entrada.substring(1);

            switch (accion) {
                case 'E':
                    llegadaAvioneta(estacionamiento, matricula);
                    break;
                case 'S':
                    salidaAvioneta(estacionamiento, matricula);
                    break;
                default:
                    System.out.println("Acción no válida. Use 'E' para llegada o 'S' para salida.");
            }

            // Mostrar estado actual del estacionamiento
            System.out.println("Estado actual del estacionamiento: " + estacionamiento);
        }
    }

    private static void llegadaAvioneta(Queue<String> estacionamiento, String matricula) {
        if (estacionamiento.size() < 12) {
            estacionamiento.offer(matricula); // Agregar avioneta al final de la cola
            System.out.println("Avioneta con matrícula " + matricula + " llegó al estacionamiento.");
        } else {
            System.out.println("Estacionamiento lleno. La avioneta con matrícula " + matricula + " espera.");
        }
    }

    private static void salidaAvioneta(Queue<String> estacionamiento, String matricula) {
        if (estacionamiento.contains(matricula)) {
            // Retirar avionetas hasta llegar a la deseada
            while (!estacionamiento.peek().equals(matricula)) {
                String avionetaRetirada = estacionamiento.poll();
                System.out.println("Avioneta con matrícula " + avionetaRetirada + " sale del estacionamiento.");
            }

            // Sacar la avioneta deseada
            String avionetaSalida = estacionamiento.poll();
            System.out.println("Avioneta con matrícula " + avionetaSalida + " sale del estacionamiento.");
        } else {
            System.out.println("La avioneta con matrícula " + matricula + " no está en el estacionamiento.");
        }
    }
}