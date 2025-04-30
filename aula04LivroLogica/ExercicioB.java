package aula04LivroLogica;

import java.util.Scanner;

public class ExercicioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float c, f;

		System.out.println("Digite a temperatura em Fahrenheit:");
		f = sc.nextFloat();

		c = ((f - 32) * 5) / 9;

		System.out.printf("A sua temperatura em Fahrenheit é: %.2f°C.%n", c);

		sc.close();

	}

}
