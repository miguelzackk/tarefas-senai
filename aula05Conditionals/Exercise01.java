package aula05Conditionals;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua nota: ");
		float nota = sc.nextFloat();

		if (nota >= 7) {
			System.out.println("O aluno está aprovado!");
		} else {
			System.out.println("O aluno está reprovado!");
		}

		sc.close();
	}

}
