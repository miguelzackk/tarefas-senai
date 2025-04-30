package Vetores;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] nota = new double[6];
		double soma = 0;

		System.out.println("Vamos calcular a média.");
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite a " + (i + 1) + "° nota:");
			nota[i] = sc.nextDouble();
			soma += nota[i];
		}

		double media = soma / 6;

		System.out.print("Notas: ");
		for (double n : nota) {
			System.out.print(n + " ");
		}

		System.out.printf("\nMédia: %.2f\n", media);

		if (media >= 7.0) {
			System.out.println("Resultado: Aprovado");
		} else {
			System.out.println("Resultado: Reprovado");
		}

		sc.close();
	}

}
