package problemaAlturaMedia;

import java.util.Scanner;

public class ProblemaAlturaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome1, nome2;
		float alt1, alt2, med;

		System.out.print("Digite o Primeiro Nome: ");
		nome1 = sc.nextLine();

		System.out.print("Digite a altura de " + nome1 + ": ");
		alt1 = sc.nextFloat();
		sc.nextLine();

		System.out.print("Digite o Segundo Nome: ");
		nome2 = sc.nextLine();

		System.out.print("Digite a altura de " + nome2 + ": ");
		alt2 = sc.nextFloat();

		med = (alt1 + alt2) / 2;
		System.out.printf("A altura média de %s e %s é de %.2f metros.%n", nome1, nome2, med);

		sc.close();
	}
}
