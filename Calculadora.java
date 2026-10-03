import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.println("Ingresa el primer número: ");
		double numero1 = scanner.nextDouble();

		System.out.println("Ingresa el segundo número: ");
		double numero2 = scanner.nextDouble();

		System.out.println ("\n--------CALCULADORA-------");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.Division");

		System.out.println("Ingresa la opcion");
		int opcion= scanner.nextInt();

		switch(opcion) {
		case 1:
			double suma=numero1+numero2;
			System.out.println("El resultado "+ suma);

			break;
		case 2:
			double resta=numero1-numero2;
			System.out.println("El resultado "+ resta);

			break;
		case 3:
			double multiplicacion=numero1*numero2;
			System.out.println("El resultado "+ multiplicacion);

			break;

		case 4:
		    if (numero2==0){
		        System.out.println("vales madres cawn, no sabes que entre cero no se multiplicar");
		    }
			double division=numero1/numero2;
			System.out.println("El resultado "+ division);
			

			break;
		}
	}
}