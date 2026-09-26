import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa tu estatura: ");
        double estatura = scanner.nextDouble();

        System.out.print("Ingresa tu peso: ");
        double peso = scanner.nextDouble();

        double imc = peso / (estatura * estatura);

        System.out.printf("HOLA! %s, tu edad es de %d años, tu estatura es %.2f metros, tu índice de masa corporal es de: %.2f\n",
                nombre, edad, estatura, imc);

        scanner.close();
    }
}