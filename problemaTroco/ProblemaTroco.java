package problemaTroco;

import java.util.Scanner;

public class ProblemaTroco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float pre, qua, din, tro;

		System.out.println("Digite o preço unitário do produto: ");
		pre = sc.nextFloat();
		System.out.println("Digite a quantidade do produto: ");
		qua = sc.nextFloat();
		System.out.println("Digite o valor pago: ");
		din = sc.nextFloat();

		tro = din - (pre * qua);

		System.out.printf("O troco é: %.2f.%n", tro);

		sc.close();

	}

}
