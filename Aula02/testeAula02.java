package Aula02;

import java.util.Scanner;

public class testeAula02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1, num2, num3;

        System.out.print("Digite o Primeiro Número: ");
        num1 = sc.nextFloat();

        System.out.print("Digite o Segundo Número: ");
        num2 = sc.nextFloat();

        num3 = num1 / num2;

        System.out.printf("O total da operação é %.2f%n", num3); 

        sc.close();
    }
}
