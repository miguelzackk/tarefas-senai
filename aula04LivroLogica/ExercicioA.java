package aula04LivroLogica;

import java.util.Scanner;

public class ExercicioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float c, f;
		
		System.out.println("Digite a temperatura (em C°):");
		c = sc.nextFloat();
		
		f = c * 9 / 5 + 32;
		
		System.out.printf("A sua temperatura em Fahrenheit é: %.2f°F.%n", f);


		
		sc.close();
		

	}

}
