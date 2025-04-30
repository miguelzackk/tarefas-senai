package aula04LivroLogica;

import java.util.Scanner;

public class ExercicioE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float valor, taxa, tempo, prestacao;

        System.out.print("Informe o valor da prestação: ");
        valor = sc.nextFloat();

        System.out.print("Informe a taxa de juros (% ao mês): ");
        taxa = sc.nextFloat();

        System.out.print("Informe o tempo de atraso (em meses): ");
        tempo = sc.nextFloat();

        prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.println("\nResumo do Cálculo:");
        System.out.printf("Valor Original: R$ %.2f%n", valor);
        System.out.printf("Taxa de Juros: %.2f%%%n", taxa);
        System.out.printf("Tempo de Atraso: %.0f meses%n", tempo);
        System.out.printf("Valor Atualizado da Prestação: R$ %.2f%n", prestacao);

        sc.close();
	}

}
