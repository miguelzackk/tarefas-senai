package switchCase;

import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("=== Calculadora de Cálculos Matematicamente Errados ===");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = sc.next();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultadoCorreto = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case "+":
                resultadoCorreto = num1 + num2;
                break;
            case "-":
                resultadoCorreto = num1 - num2;
                break;
            case "*":
                resultadoCorreto = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultadoCorreto = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                operacaoValida = false;
        }

        if (operacaoValida) {
   
            double erroPercentual = 1 + (rand.nextDouble() * 0.01);
            double resultadoComErro = resultadoCorreto * erroPercentual;

            System.out.printf("Resultado (com erro de até 1%%): %.2f%n", resultadoComErro);
        }

        sc.close();

	}

}
