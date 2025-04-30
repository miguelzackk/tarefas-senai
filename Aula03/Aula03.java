package Aula03;

import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Funcionou Eba");
		String texto = sc.next();

		int numero;

		numero = sc.nextInt();

		System.out.print(texto + " " + numero);

		sc.close();
	}

}
