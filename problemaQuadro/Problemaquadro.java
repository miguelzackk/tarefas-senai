package problemaQuadro;

import java.util.Scanner;

public class Problemaquadro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lar, alt, area, peri, dia;

		System.out.print("Digite a largura: ");
		lar = sc.nextDouble();

		System.out.print("Digite a altura: ");
		alt = sc.nextDouble();

		area = lar * alt;
		System.out.printf("A área é: %.4f%n", area);

		peri = 2 * (lar + alt);
		System.out.printf("O perímetro é: %.4f%n", peri);

		dia = Math.sqrt(lar * lar + alt * alt);
		System.out.printf("A diagonal é: %.4f%n", dia);

		sc.close();
	}
}
