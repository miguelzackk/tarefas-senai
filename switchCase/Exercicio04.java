package switchCase;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome1 = "", nome2 = "";
		int forca1 = 0, forca2 = 0;
		int intel1 = 0, intel2 = 0;
		int vel1 = 0, vel2 = 0;
		int poder1 = -1, poder2 = -1;

		int opcao;
		do {
			System.out.println("\n--- MENU SUPER-HERÓIS ---");
			System.out.println("1 - Adicionar/editar Herói 1");
			System.out.println("2 - Adicionar/editar Herói 2");
			System.out.println("3 - Ver ranking entre os dois");
			System.out.println("4 - Comparar quem é mais poderoso");
			System.out.println("0 - Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Nome do Herói 1: ");
				nome1 = sc.nextLine();
				System.out.print("Força: ");
				forca1 = sc.nextInt();
				System.out.print("Inteligência: ");
				intel1 = sc.nextInt();
				System.out.print("Velocidade: ");
				vel1 = sc.nextInt();
				poder1 = (forca1 * 2) + (intel1 * 3) + vel1;
				break;

			case 2:
				System.out.print("Nome do Herói 2: ");
				nome2 = sc.nextLine();
				System.out.print("Força: ");
				forca2 = sc.nextInt();
				System.out.print("Inteligência: ");
				intel2 = sc.nextInt();
				System.out.print("Velocidade: ");
				vel2 = sc.nextInt();
				poder2 = (forca2 * 2) + (intel2 * 3) + vel2;
				break;

			case 3:
				if (poder1 == -1 || poder2 == -1) {
					System.out.println("Cadastre os dois heróis antes.");
				} else {
					System.out.println("\n--- RANKING ---");
					if (poder1 >= poder2) {
						System.out.println(nome1 + " - Poder: " + poder1);
						System.out.println(nome2 + " - Poder: " + poder2);
					} else {
						System.out.println(nome2 + " - Poder: " + poder2);
						System.out.println(nome1 + " - Poder: " + poder1);
					}
				}
				break;

			case 4:
				if (poder1 == -1 || poder2 == -1) {
					System.out.println("Cadastre os dois heróis antes.");
				} else {
					System.out.println("\n--- COMPARAÇÃO ---");
					System.out.println(nome1 + ": " + poder1);
					System.out.println(nome2 + ": " + poder2);

					if (poder1 > poder2) {
						System.out.println(nome1 + " é mais poderoso!");
					} else if (poder2 > poder1) {
						System.out.println(nome2 + " é mais poderoso!");
					} else {
						System.out.println("Empate!");
					}
				}
				break;

			case 0:
				System.out.println("Encerrando.");
				break;

			default:
				System.out.println("Opção inválida.");
			}

		} while (opcao != 0);

		sc.close();

	}
}