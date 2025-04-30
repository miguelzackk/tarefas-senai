package classDesafioConditionals;

import java.util.Scanner;

public class DesafioThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numerador: ");
		int numerador = sc.nextInt();

		System.out.print("Digite o denominador: ");
		int denominador = sc.nextInt();

		if (denominador == 0) {
			System.out.println("Erro: Não é possível dividir por zero.");
		} else {
			int resultado = numerador / denominador;
			System.out.println("Resultado: " + resultado);
		}

		sc.close();

	}

}
