package switchCase;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo(a) ao seu cofrinho inteligente!");

		double cofre = 0;
		double moed01 = 0.01;
		double moed05 = 0.05;
		double moed10 = 0.10;
		double moed25 = 0.25;
		double moed50 = 0.50;
		double moed1 = 1;
		int quant;
		int valormenu;
		int i = 0;
		double depositoAtual = 0;

		do {
			System.out.println(
					"Deseja adicionar moeda de qual valor ao seu cofrinho? \n [1] - 0.01 centavos; \n [2] - 0.05 centavos; \n [3] - 0.10 centavos; \n [4] - 0.25 centavos; \n [5] - 0.50 centavos; \n [6] - 1 real.");
			valormenu = sc.nextInt();
			while (valormenu > 6) {
				System.out.println("Valor inválido, tente novamente.");
				System.out.println(
						"Deseja adicionar que valor ao seu cofrinho? \n [1] - 0.01 centavos; \n [2] - 0.05 centavos; \n [3] - 0.10 centavos; \n [4] - 0.25 centavos; \n [5] - 0.50 centavos; \n [6] - 1 real.");
				valormenu = sc.nextInt();
			}

			switch (valormenu) {
			case 1:
				System.out.println("Deseja adicionar quantas moedas de 0.01 centavos?");
				quant = sc.nextInt();
				depositoAtual = moed01 * quant;
				cofre += depositoAtual;
				break;
			case 2:
				System.out.println("Deseja adicionar quantas moedas de 0.05 centavos?");
				quant = sc.nextInt();
				depositoAtual = moed05 * quant;
				cofre += depositoAtual;
				break;
			case 3:
				System.out.println("Deseja adicionar quantas moedas de 0.10 centavos?");
				quant = sc.nextInt();
				depositoAtual = moed10 * quant;
				cofre += depositoAtual;
				break;
			case 4:
				System.out.println("Deseja adicionar quantas moedas de 0.25 centavos?");
				quant = sc.nextInt();
				depositoAtual = moed25 * quant;
				cofre += depositoAtual;
				break;
			case 5:
				System.out.println("Deseja adicionar quantas moedas de 0.50 centavos?");
				quant = sc.nextInt();
				depositoAtual = moed50 * quant;
				cofre += depositoAtual;
				break;
			case 6:
				System.out.println("Deseja adicionar quantas moedas de 1 real?");
				quant = sc.nextInt();
				depositoAtual = moed1 * quant;
				cofre += depositoAtual;
				break;
			default:
				System.out.println("Erro, tente novamente.");
				break;
			}
			System.out.printf("Seu novo saldo é: R$ %.2f.%n", cofre);

			if (cofre < 100) {
				System.out.println("Falta R$" + (100 - cofre) + " para chegar em R$100.00.");
				double falta = 100 - cofre;
				int semanas = (int) Math.ceil(falta / depositoAtual);
				System.out.printf(
						"Se você continuar depositando R$ %.2f por semana, levará aproximadamente %d semanas para chegar a R$ 100,00.%n",
						depositoAtual, semanas);
			} else {
				System.out.println("");
			}

			System.out.println("Operação Finalizada! \nMenu de opções: \n[0] - Sair \n[1] - Adicionar mais moedas.");
			i = sc.nextInt();

			while (i != 0 && i != 1) {
				System.out.println("Opção inválida. Tente novamente.");
				System.out.println("Menu de opções: \n[0] - Sair \n[1] - Adicionar mais moedas.");
				i = sc.nextInt();
			}

		} while (i == 1);

	}

}