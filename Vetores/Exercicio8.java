package Vetores;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] vetora = new double[5];
		double[] vetorb = new double[5];

		System.out.println("Digite os valores dos vetores para comparar.");
		System.out.println("Primeiro, vamos começar pelo vetor A.");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor A: ");
			vetora[i] = sc.nextDouble();
		}

		System.out.println("Agora vamos para o vetor B");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor do vetor B: ");
			vetorb[i] = sc.nextDouble();
		}

		System.out.print("O vetor A tem os valores: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(vetora[i] + " ");
		}
		System.out.print("\nO vetor B tem os valores: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(vetorb[i] + " ");
		}
		System.out.println("\n\nNúmeros iguais nas mesmas posições:");

		for (int i = 0; i < vetorb.length; i++) {
			if (vetora[i] == vetorb[i]) {
				System.out.println("Os números iguais são " + vetora[i] + ".");
				System.out.println("A posição deles no vetor é " + (i + 1) + ".");
			}
		}

		sc.close();

	}

}
