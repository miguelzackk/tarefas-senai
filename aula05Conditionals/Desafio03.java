package aula05Conditionals;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double saldo = 0.0;

		int opcao;

		do {

			System.out.println("\n*** Caixa Eletrônico ***");
			System.out.println("1 - Depósito");
			System.out.println("2 - Saque");
			System.out.println("3 - Consulta de Saldo");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:

				System.out.print("Digite o valor do depósito: R$ ");
				double deposito = sc.nextDouble();
				if (deposito > 0) {
					saldo += deposito;
					System.out.println("Depósito de R$ " + deposito + " realizado com sucesso!");
				} else {
					System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
				}
				break;

			case 2:

				System.out.print("Digite o valor do saque: R$ ");
				double saque = sc.nextDouble();
				if (saque > 0 && saque <= saldo) {
					saldo -= saque;
					System.out.println("Saque de R$ " + saque + " realizado com sucesso!");
				} else if (saque > saldo) {
					System.out.println("Saldo insuficiente para realizar o saque.");
				} else {
					System.out.println("Valor de saque inválido. O valor deve ser maior que zero.");
				}
				break;

			case 3:

				System.out.println("Seu saldo atual é: R$ " + saldo);
				break;

			case 4:

				System.out.println("Saindo... Até logo!");
				break;

			default:

				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 4);

		sc.close();
	}
}
