package Vetores;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] vetor = new double[10];

		System.out.println("Digite 10 números para armazenar e verificar quais são pares e ímpares.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			vetor[i] = sc.nextDouble();
		}

		System.out.print("Os números pares são: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}

		System.out.print("\nOs números ímpares são: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		sc.close();

	}

}
