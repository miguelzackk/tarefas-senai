package Vetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] vetor = new double[8];

		System.out.println("Digite 8 números para verificar qual é o maior e o menor de todos eles.");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número.");
			vetor[i] = sc.nextDouble();
		}

		double maior = vetor[0];
		double menor = vetor[0];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);

		sc.close();

	}
}
