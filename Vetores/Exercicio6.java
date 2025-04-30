package Vetores;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetor = new double[6];

		System.out.println("Digite os 6 números de deseja armazenar.");
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o " + (i + 1) + "°  número:");
			vetor[i] = sc.nextDouble();
		}

		System.out.print("Vetor original: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(vetor[i] + " ");
		}

		System.out.print("\nVetor Invertido: ");
		for (int i = 5; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		
		sc.close();
	}

}
