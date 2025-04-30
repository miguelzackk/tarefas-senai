package aula05Conditionals;

import java.io.File;
import java.util.Scanner;

public class Desafio01V2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = (int) (Math.random() * 21);

		System.out.println(
				"Tente adivinhar qual é o número ou a sua pasta será deletada! Ele é um número inteiro entre 0 e 20!");
		System.out.println("QUal a sua aposta?");
		int num = sc.nextInt();

		if (num != random) {
			File myObj = new File("C:\\Users\\1DM\\Documents\\new");

			if (myObj.delete()) {
				System.out.println("Tu se fudeu! A pasta foi deletada! ");
			} else {
				System.out.println("Erro ao deletar a pasta.");
			}
		} else {
			System.out.println("Parabéns! Tu não se fudeu!");
		}

		sc.close();
	}
}
