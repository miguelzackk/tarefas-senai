package aula04LivroLogica;

import java.util.Scanner;

public class ExercicioH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float com, lar, alt, volume;
		
		System.out.println("Digite o comprimento da caixa (em centímetros): ");
        com = sc.nextFloat();
        System.out.println("Digite a largura da caixa (em centímetros): ");
        lar = sc.nextFloat();
        System.out.println("Digite a altura da caixa (em centímetros): ");
        alt = sc.nextFloat();


        volume = com * lar * alt;
        
        System.out.printf("O volume da caixa é: %.2fcm³\n", volume);
        
        sc.close();
	}

}
