package ejercicios;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
		System.out.print("Inicio del programa");
		Scanner reader = new Scanner(System.in);

		double a, b, result;

		System.out.print("digite el valor de a: ");
		a = reader.nextDouble();

		System.out.print("digite el valor de b: ");
		b = reader.nextDouble();

		result = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);

		System.out.print("El resultado es: " + result);
		System.out.print("Fin del programa");

	}

}

