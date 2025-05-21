package switchCase;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] feiticos = { "Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa" };

		System.out.println("=== Busca Binária no Mundo dos Feitiços ===");
		System.out.print("Digite o nome do feitiço que deseja encontrar: ");
		String alvo = sc.nextLine();

		int inicio = 0;
		int fim = feiticos.length - 1;
		boolean encontrado = false;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			int comparacao = alvo.compareToIgnoreCase(feiticos[meio]);

			if (comparacao == 0) {
				System.out.println("Feitiço encontrado na posição " + meio + ": " + feiticos[meio]);
				encontrado = true;
				break;
			} else if (comparacao < 0) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}

		if (!encontrado) {
			System.out.println("Feitiço não encontrado.");
		}

		sc.close();

	}

}
