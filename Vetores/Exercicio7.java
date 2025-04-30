package Vetores;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] vetor = new double[5];

		System.out.println("Digite 5 números que deseja armazenar.");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println("Digite um número para multiplicar.");
		double mult = sc.nextDouble();
		
		System.out.print("Os números multiplicados são: ");
		for (int i = 0; i < 5; i++) {
			System.out.print((vetor[i] * mult) + " " );
		}
		
		sc.close();
	}

}
