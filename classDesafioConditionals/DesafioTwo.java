package classDesafioConditionals;

import java.util.Scanner;

public class DesafioTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num = 1;

		while (num != 0) {
			System.out.println("Insira o número para fazer o laço de conta. DIgite 0 para sair do loop.");
			num = sc.nextDouble();

			double result = num * 5;
			System.out.println("O resultado do loop é " + result * 2);

		}
		sc.close();
	}

}
