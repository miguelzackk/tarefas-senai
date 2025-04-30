package aula04LivroLogica;

import java.util.Scanner;

public class ExercicioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float a, b;

		System.out.println("Digite o valor de a: ");
		a = sc.nextFloat();
		System.out.println("Digite o valor de b: ");
		b = sc.nextFloat();

		float temp = a;
		a = b;
		b = temp;

		System.out.println(
				String.format("Ops, deu erro no sistema! Agora, o valor de a é %.2f e o valor de b é %.2f.", a, b));

		sc.close();

	}

}
