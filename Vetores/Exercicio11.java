	package Vetores;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];

		System.out.println("Digite os 5 números do vetor (separados por espaço):");
		for (int i = 0; i < 5; i++) {
			vetor[i] = sc.nextInt();
		}

		System.out.print("\nVetor original: ");
		for (int num : vetor) {
			System.out.print(num + " ");
		}

		int ultimo = vetor[4];

		for (int i = 4; i > 0; i--) {
			vetor[i] = vetor[i - 1];
		}

		vetor[0] = ultimo;

		System.out.print("\nVetor rotacionado: ");

		for (int i : vetor) {
			System.out.print(i + " ");
		}

		sc.close();
	}

}
