package aula05Conditionals;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		float numero = sc.nextFloat();

		if (numero > 0) {
			System.out.println("O número " + numero + " é Positivo.");
		} else if (numero < 0) {
			System.out.println("O número " + numero + " é Negativo.");
		} else {
			System.out.println("O número é Neutro (Zero).");
		}

		sc.close();

	}

}
