package Vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os 5 números que deseja armazenar.");
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double num3 = sc.nextDouble();
		System.out.println("Digite o quarto número: ");
		double num4 = sc.nextDouble();
		System.out.println("Digite o quinto número: ");
		double num5 = sc.nextDouble();
		
		double vetor[] = {num1, num2, num3, num4, num5};
		
		for (double d : vetor) {
			System.out.print(d + ", ");
		}
		
		sc.close();
	}

}
