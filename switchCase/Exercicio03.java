package switchCase;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// declarando variáveis
		String senha;
		char[] asenha;
		boolean maiusc = false;
		boolean minusc = false;
		boolean primo = false;
		boolean especial = false;
		boolean duplicadas = false;
		String vogais = "aeiouAEIOU";
		int a = 0;

		
			// mensagem de boas vindas
			System.out.println("Bem-vindo(a) ao verificador de senha!");

			do {
			// declaração de senha
			System.out.println(
					"A sua senha deve conter o menos uma letra maiúscula, um número primo, um caractere especial e não pode conter vogais duplicadas seguidas. \nDigite a sua senha:");
			senha = sc.next();
			asenha = senha.toCharArray();

			// for para letra maiúscula
			for (int i = 0; i < asenha.length; i++) {
				if (Character.isUpperCase(senha.charAt(i))) {
					maiusc = true;
					break;
				} else {
					maiusc = false;
				}
			}

			// for para letra minúscula
			for (int i = 0; i < asenha.length; i++) {
				if (Character.isLowerCase(senha.charAt(i))) {
					minusc = true;
					break;
				} else {
					minusc = false;
				}
			}

			// for para número primo
			for (int i = 0; i < senha.length(); i++) {
				char c = senha.charAt(i);

				if (Character.isDigit(c)) {
					int num = Character.getNumericValue(c);
					if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0
							|| num % 13 == 0) {
						if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13) {
							primo = true;
							break;
						} else {
							primo = false;
						}
					} else {
						primo = false;
					}
				} else {

					primo = false;
				}
			}

			// for para caractere especial
			for (int i = 0; i < asenha.length; i++) {
				if (!Character.isLetterOrDigit(senha.charAt(i))) {
					especial = true;
					break;
				} else {
					especial = false;
				}
			}

			// for para vogais duplicadas
			for (int i = 0; i < senha.length() - 1; i++) {
				if (vogais.indexOf(senha.charAt(i)) != -1 && senha.charAt(i) == senha.charAt(i + 1)) {
					duplicadas = true;
					break;
				} else {
					duplicadas = false;
				}
			}

//		// console para eu saber se ta funcionando
//		if (maiusc == true) {
//			System.out.println("A senha contém letra maiúscula.");
//		} else {
//			System.out.println("A senha não contém letra maiúscula.");
//		}
//
//		if (minusc == true) {
//			System.out.println("A senha contém letra minúscula.");
//		} else {
//			System.out.println("A senha não contém letra minúscula.");
//		}
//
//		if (primo == true) {
//			System.out.println("A senha contém um número primo.");
//		} else {
//			System.out.println("A senha não contém um número primo.");
//		}
//
//		if (especial == true) {
//			System.out.println("A senha contém um caractere especial.");
//		} else {
//			System.out.println("A senha não contém um caractere especial.");
//		}
//
//		if (duplicadas == true) {
//			System.out.println("A senha possui vogais duplicadas seguidas com mesma caixa.");
//		} else {
//			System.out.println("A senha não possui vogais duplicadas seguidas com mesma caixa.");
//		}

			// console para usuário
			if (maiusc == true && minusc == true && primo == true && especial == true && duplicadas == false) {
				System.out.println("Sua senha é válida.");
			} else {
				System.out.println("Senha invalida.");
				if (maiusc == false) {
					System.out.println("Sua senha é inválida porque não contém no mínimo uma letra maiúscula.");
				}
				if (minusc == false) {
					System.out.println("Sua senha é inválida porque não contém no mínimo uma letra minúscula.");
				}
				if (primo == false) {
					System.out.println("Sua senha é inválida porque não contém no mínimo um número primo.");
				}
				if (especial == false) {
					System.out.println("Sua senha é inválida porque não contém no mínimo um caractere especial.");
				}
				if (duplicadas == true) {
					System.out.println("Sua senha é inválida porque contém duas vogais seguidas na mesma caixa.");
				}
			}

			System.out.println("Verificação finalizada! \nMenu de opções: \n[0] - Sair. \n[1] - Testar outra senha.");
			a = sc.nextInt();

			while (a != 0 && a != 1) {
				System.out.println("Opção inválida. Tente novamente.");
				System.out.println("Menu de opções: \n[0] - Sair. \n[1] - Testar outra senha.");
				a = sc.nextInt();

			}
		} while (a == 1);

		sc.close();
	}

}
