package classDesafioConditionals;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = 1;

		while (num != 0) {
			System.out.println("Insira o número que deseja verificar se é primo. Digite 0 para sair.");
			num = sc.nextDouble();
			double div1 = num % 2;
			double div2 = num % 3;
			double div3 = num % 5;
			double div4 = num % 7;
			double div5 = num % 11;
			double div6 = num % 13;

			if (div1 == 0 || div2 == 0 || div3 == 0 || div4 == 0 || div5 == 0 || div6 == 0) {
				if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13) {
					System.out.println("O número é primo.");
				} else {
					System.out.println("O número não é primo.");
				}
			} else {
				System.out.println("O número é primo.");
			}
		}
		sc.close();

	}

}
