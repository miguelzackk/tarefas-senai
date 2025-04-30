package Aula02;

import java.util.Scanner;

public class somar_dois {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//declarar variaveis
		int num1 = 0;
		int num2 = 0;
		int soma = 0;
		
		//entrada
		System.out.print("Digite o número 1: ");
		num1 = scn.nextInt();
		
		System.out.print("Digite o número 2: ");
		num2 = scn.nextInt();
		//processamento
		soma = num1 + num2;
		//saida
		System.out.print("Soma = " + soma);
		scn.close();
	}

}
