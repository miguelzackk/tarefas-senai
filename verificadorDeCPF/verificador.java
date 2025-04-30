package verificadorDeCPF;

import java.util.Scanner;

public class verificador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem-vindo(a) ao verificador de CPF!");

		// variável para o loop do
		double i = 0;

		do {

			System.out.println("Digite o CPF (sem espaços e pontuação): ");
			String cpf = sc.next();
			// verificação da quantidade de número no cpf
			while (cpf.length() != 11) {
				System.out.println("O quantidade de números do CPF é inválido. Tente novamente.");
				System.out.println("Digite o CPF (sem espaços e pontuação): ");
				cpf = sc.next();
			}

			// verificação de sequência de dígitos iguais
			if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
					|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
					|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
					|| cpf.equals("99999999999")) {
				System.out.println("O CPF é uma sequência de números iguais. CPF inválido.");
				System.out.println("Verificação finalizada! \nMenu de opções: \n[0] - Sair \n[1] - Testar outro CPF.");
				i = sc.nextDouble();

				while (i != 0 && i != 1) {
					System.out.println("Opção inválida. Tente novamente.");
					System.out.println("Menu de opções: \n[0] - Sair \n[1] - Testar outro CPF.");
					i = sc.nextDouble();
				}
			} else {

				System.out.println("Iniciando verificação...");
				// Primeiro Dígito
				int digver1 = (Character.getNumericValue(cpf.charAt(0)) * 10)
						+ (Character.getNumericValue(cpf.charAt(1)) * 9)
						+ (Character.getNumericValue(cpf.charAt(2)) * 8)
						+ (Character.getNumericValue(cpf.charAt(3)) * 7)
						+ (Character.getNumericValue(cpf.charAt(4)) * 6)
						+ (Character.getNumericValue(cpf.charAt(5)) * 5)
						+ (Character.getNumericValue(cpf.charAt(6)) * 4)
						+ (Character.getNumericValue(cpf.charAt(7)) * 3)
						+ (Character.getNumericValue(cpf.charAt(8)) * 2);

				digver1 = digver1 % 11;

				if (digver1 < 2) {
					digver1 = 0;
				} else if (digver1 >= 2) {
					digver1 = 11 - digver1;
				}

				// Segundo dígito
				int digver2 = (Character.getNumericValue(cpf.charAt(0)) * 11)
						+ (Character.getNumericValue(cpf.charAt(1)) * 10)
						+ (Character.getNumericValue(cpf.charAt(2)) * 9)
						+ (Character.getNumericValue(cpf.charAt(3)) * 8)
						+ (Character.getNumericValue(cpf.charAt(4)) * 7)
						+ (Character.getNumericValue(cpf.charAt(5)) * 6)
						+ (Character.getNumericValue(cpf.charAt(6)) * 5)
						+ (Character.getNumericValue(cpf.charAt(7)) * 4)
						+ (Character.getNumericValue(cpf.charAt(8)) * 3)
						+ (Character.getNumericValue(cpf.charAt(9)) * 2);

				digver2 = digver2 % 11;

				if (digver2 < 2) {
					digver2 = 0;
				} else if (digver2 >= 2) {
					digver2 = 11 - digver2;
				}

				// Verificação dos dois dígitos com o CPF
				if (digver1 == Character.getNumericValue(cpf.charAt(9))
						&& digver2 == Character.getNumericValue(cpf.charAt(10))) {
					System.out.println("O CPF é válido!");
				} else {
					System.out.println("O CPF é inválido!");
				}

				// Finalização do programa
				System.out.println("Verificação finalizada! \nMenu de opções: \n[0] - Sair \n[1] - Testar outro CPF.");
				i = sc.nextDouble();

				while (i != 0 && i != 1) {
					System.out.println("Opção inválida. Tente novamente.");
					System.out.println("Menu de opções: \n[0] - Sair \n[1] - Testar outro CPF.");
					i = sc.nextDouble();

				}

			}

		} while (i == 1);

		sc.close();

	}
}