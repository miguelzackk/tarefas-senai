package Vetores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetor = new double[15];
		int numpares = 0;

		System.out.println("Digite os 15 números que deseja verificar quantos são pares.");

		for (int i = 0; i < 15; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			vetor[i] = sc.nextDouble();
		}

		for (int i = 0; i < 15; i++) {
			if (vetor[i] % 2 == 0) {
				numpares++;
			}
		}

		System.out.print("Os números digitados foram: ");
		for (double d : vetor) {
			System.out.print(d + " ");
		}

		System.out.println("\nNesses números há " + numpares + " números pares.");
		sc.close();
	}

}
