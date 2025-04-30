package Vetores;

public class Exercicio2 {

	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		int range = max - min + 1;

		int[] numeros = new int[10];
		int soma = 0;

		System.out.print("Números gerados: ");
		for (int i = 0; i < 10; i++) {
			numeros[i] = (int) (Math.random() * range) + min;
			soma += numeros[i];
			System.out.print(numeros[i] + " ");
		}

		System.out.println("\nSoma total: " + soma);

	}

}
