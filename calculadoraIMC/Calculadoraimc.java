package calculadoraIMC;

import java.util.Scanner;

public class Calculadoraimc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso, alt, imc;

		System.out.println("Olá, querido usuário!");
		System.out.println("Seja Bem-Vindo a nossa calculadora de IMC! Saiba qual é o seu Índice de Massa Corporal!");
		
		System.out.println("Digite o seu peso (em kg): ");
		peso = sc.nextFloat();
		System.out.println("Digite a sua altura (em metros): ");
		alt = sc.nextFloat();
		
		imc = peso / (alt * alt);
		
		System.out.printf("Seu IMC é: %.2f.%n", + imc);
		
		 if (imc < 18.5) {
	            System.out.println("Você está abaixo do peso!");
	        } else if (imc >= 18.5 && imc < 24.9) {
	            System.out.println("Você está com o peso normal!");
	        } else if (imc >= 25 && imc < 29.9) {
	            System.out.println("Você está com sobrepeso!");
	        } else if (imc >= 30 && imc < 34.9) {
	            System.out.println("Você está com obesidade grau 1!");
	        } else if (imc >= 35 && imc < 39.9) {
	            System.out.println("Você está com obesidade grau 2!");
	        } else {	
	            System.out.println("Você está com obesidade grau 3 (obesidade mórbida)!");
	        }

	        sc.close(); 		
		
			}

}
