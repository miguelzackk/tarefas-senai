package aula04LivroLogica;

import java.util.Scanner;

public class ExercicioC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Informe o raio da lata (em cm): ");
        double raio = sc.nextDouble();
        
        System.out.print("Informe a altura da lata (em cm): ");
        double altura = sc.nextDouble();
        

        double volume = 3.14159 * Math.pow(raio, 2) * altura;
        
  
        System.out.printf("O volume da lata de óleo é: %.2f%n", volume);
        
        sc.close();

	}

}
