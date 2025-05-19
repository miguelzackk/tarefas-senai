package switchCase;

import java.util.Scanner;

public class ExemploCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int[] numeros = {10, 20, 30};

	        for (int i = 0; i < numeros.length; i++) {
	            switch (i) {
	                case 0:
	                    System.out.println("Primeiro valor: " + numeros[i]);
	                    break;
	                case 1:
	                    System.out.println("Segundo valor (dobro): " + (numeros[i] * 2));
	                    break;
	                case 2:
	                    System.out.println("Terceiro valor ao quadrado: " + (numeros[i] * numeros[i]));
	                    break;
	                default:
	                    System.out.println("Índice fora do esperado.");

			}

		}
	}
}
