package aula05Conditionals;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		float num1 = sc.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float num2 = sc.nextFloat();
		
		if (num1 > num2) {
			System.out.println("O primeiro número é maior que o segundo.");
		} else if (num1 < num2) {
			System.out.println("O segundo númeiro é maior que o primeiro.");
		} else {
			System.out.println("Os números são iguais.");
		}
		
		sc.close();
	}

}
