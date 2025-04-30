package aula04LivroLogica;

import java.util.Scanner;

public class ExercicioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float tem, vel, dis, lit;

		System.out.print("Informe o tempo gasto na viagem (em horas): ");
		tem = sc.nextFloat();

		System.out.print("Informe a velocidade média da viagem (em km/h): ");
		vel = sc.nextFloat();

		dis = tem * vel;

		lit = dis / 12;

		System.out.println("\nResumo da Viagem:");
		System.out.printf("Velocidade Média: %.2f km/h%n", vel);
		System.out.printf("Tempo Gasto: %.2f horas%n", tem);
		System.out.printf("Distância Percorrida: %.2f km%n", dis);
		System.out.printf("Combustível Utilizado: %.2f litros%n", lit);

		sc.close();
	}

}
