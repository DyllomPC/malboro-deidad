import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar Calificación de Programación: ");
        double programacion = scanner.nextDouble();

        System.out.print("Ingresar Calificación de Geometría Analítica: ");
        double geometria = scanner.nextDouble();

        System.out.print("Ingresar Calificación de CTS y V: ");
        double ctsv = scanner.nextDouble();

        System.out.print("Ingresar Calificación de Inglés: ");
        double ingles = scanner.nextDouble();

        double promedio = (programacion + geometria + ctsv + ingles) / 4;

        System.out.println("El promedio de las calificaciones es: " + promedio);
if (promedio > 7.5) {
    System.out.println("Ahuevo morro hay carnita asada");
} else {
    System.out.println("Échale huevos para la próxima mi todo tibio");
}

}

    }