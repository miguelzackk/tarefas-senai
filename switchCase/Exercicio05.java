package switchCase;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] candidatos = { "Tigre", "Coruja", "Lobo", "Gato Ninja" };
		int[] votos = new int[candidatos.length];
		int totalVotos = 0;

		System.out.println("=== Sistema de Votação para o Mascote da Turma ===");
		System.out.println("Candidatos disponíveis:");
		for (String c : candidatos) {
			System.out.println("- " + c);
		}

		System.out.println("\nDigite o nome do mascote para votar ou 'fim' para encerrar:");

		while (true) {
			System.out.print("Seu voto: ");
			String voto = sc.nextLine().trim();

			if (voto.equalsIgnoreCase("fim")) {
				break;
			}

			boolean votoValido = false;
			for (int i = 0; i < candidatos.length; i++) {
				if (voto.equalsIgnoreCase(candidatos[i])) {
					votos[i]++;
					totalVotos++;
					votoValido = true;
					break;
				}
			}

			if (!votoValido) {
				System.out.println("Candidato inválido! Tente novamente.");
			}
		}

		System.out.println("\n=== Resultado da Votação ===");
		if (totalVotos == 0) {
			System.out.println("Nenhum voto registrado.");
		} else {
			for (int i = 0; i < candidatos.length; i++) {
				double porcentagem = (votos[i] * 100.0) / totalVotos;
				System.out.printf("%s: %d votos (%.2f%%)%n", candidatos[i], votos[i], porcentagem);
			}
		}

		sc.close();

	}

}
