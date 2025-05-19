package switchCase;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int i = 0;
		String[] opcoes = { "Pedra", "Papel", "Tesoura", "Lagarto", "Spock" };

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("0 - Pedra");
			System.out.println("1 - Papel");
			System.out.println("2 - Tesoura");
			System.out.println("3 - Lagarto");
			System.out.println("4 - Spock");

			int jogador = sc.nextInt();
			int computador = rand.nextInt(5);

			while (jogador < 0 || jogador > 4) {
				System.out.println("Opção inválida.");
				System.out.println("Escolha uma opção:");
				System.out.println("0 - Pedra");
				System.out.println("1 - Papel");
				System.out.println("2 - Tesoura");
				System.out.println("3 - Lagarto");
				System.out.println("4 - Spock");
				jogador = sc.nextInt();
			}

			System.out.println("Você escolheu: " + opcoes[jogador]);
			System.out.println("Computador escolheu: " + opcoes[computador]);

			if (jogador == computador) {
				System.out.println("Empate!");
			} else if ((jogador == 0 && (computador == 2 || computador == 3))
					|| (jogador == 1 && (computador == 0 || computador == 4))
					|| (jogador == 2 && (computador == 1 || computador == 3))
					|| (jogador == 3 && (computador == 4 || computador == 1))
					|| (jogador == 4 && (computador == 0 || computador == 2))) {
				System.out.println("Você venceu!");
			} else {
				System.out.println("Computador venceu!");
			}

			System.out.println("Deseja jogar novamente? \n[0] - Não. \n[1] - Sim.");
			i = sc.nextInt();

			while (i != 0 && i != 1) {
				System.out.println("Opção inválida. Tente novamente.");
				System.out.println("Deseja jogar novamente? \n[0] - Não. \n[1] - Sim.");
				i = sc.nextInt();
			}
		} while (i == 1);

		sc.close();

	}

}
