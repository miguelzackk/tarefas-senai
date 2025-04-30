package classDesafioConditionals;

import java.util.Scanner;

public class DesafioOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a sua nota.");
		double nota = sc.nextDouble();

		if (nota > 7) {
			System.out.println("Aluno aprovado.");
		} else if (nota <= 7 && nota >= 4) {
			System.out.println("Aluno está de recuperação");
		} else {
			System.out.println("Aluno reprovado.");
		}

		sc.close();
	}

}
