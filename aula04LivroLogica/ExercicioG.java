package aula04LivroLogica;

import java.util.Scanner;

public class ExercicioG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float num1, num2, num3, num4;

		System.out.println("Digite o valor do primeiro número: ");
		num1 = sc.nextFloat();
		System.out.println("Digite o valor do segundo número: ");
		num2 = sc.nextFloat();
		System.out.println("Digite o valor do terceiro número: ");
		num3 = sc.nextFloat();
		System.out.println("Digite o valor do quarto número: ");
		num4 = sc.nextFloat();
		
		System.out.println("Somas realizadas:");
		System.out.printf("Soma do 1° e 2° Número = %.2f\n", (num1 + num2));
        System.out.printf("Soma do 1° e 3° Número = %.2f\n", (num1 + num3));
        System.out.printf("Soma do 1° e 4° Número = %.2f\n", (num1 + num4));
        System.out.printf("Soma do 2° e 3° Número = %.2f\n", (num2 + num3));
        System.out.printf("Soma do 2° e 4° Número = %.2f\n", (num2 + num4));
        System.out.printf("Soma do 3° e 4° Número = %.2f\n", (num3 + num4));
        
        System.out.println("\nMultiplicações realizadas:");
        System.out.printf("Multiplicação do 1° e 2° Número = %.2f\n", (num1 * num2));
        System.out.printf("Multiplicação do 1° e 3° Número = %.2f\n", (num1 * num3));
        System.out.printf("Multiplicação do 1° e 4° Número = %.2f\n", (num1 * num4));
        System.out.printf("Multiplicação do 2° e 3° Número = %.2f\n", (num2 * num3));
        System.out.printf("Multiplicação do 2° e 4° Número = %.2f\n", (num2 * num4));
        System.out.printf("Multiplicação do 3° e 4° Número = %.2f\n", (num3 * num4));
        
        sc.close();

	}

}
