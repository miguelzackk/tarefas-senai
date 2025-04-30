package desafioDesconto;

import java.util.Scanner;

public class desconto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem-vindo(a) ao sistema de desconto de salário.");

		int i; // variável para o loop

		do { // loop para rodar o programa
			System.out.println("Digite o salário bruto em reais: "); // inserir valor do salário
			float salbrut = sc.nextFloat();

			while (salbrut <= 0) {
				System.out.println("Salário Invalido. Tente novamente.");
				System.out.println("Digite o salário bruto em reais: "); // inserir valor do salário
				salbrut = sc.nextFloat();
			}

			System.out.println("Digite o número de dependentes: "); // inserir número de dependentes
			int numdep = sc.nextInt();

			System.out.println("Utiliza vale transporte? (true / false)"); // inserir se tem vale transporte
			boolean vt = sc.nextBoolean();
			System.out.println("Utiliza vale alimentação? (true / false)"); // inserir se tem vale alimentação
			boolean va = sc.nextBoolean();
			System.out.println("Utiliza vale refeição? (true / false)"); // inserir se tem vale refeição
			boolean vr = sc.nextBoolean();

			System.out.println("Tipo do plano de saúde: \n[ 0 ] - Nenhum \n[ 1 ] - Básico \n[ 2 ] - Avançado "); // inserir tipo de plano de saúde
			int planoSaude = sc.nextInt();

			// inicío das condicionais

			// condicional INSS

			float descinss = 0; // variável de desconto de inss

			// verificador de condições do inss
			if (salbrut <= 1302) {
				descinss = (float) (salbrut * 0.08);
				System.out.println("Desconto do INSS de 8%.");
			} else if (salbrut >= 1302.01 && salbrut <= 2571) {
				descinss = (float) (salbrut * 0.09);
				System.out.println("Desconto do INSS de 9%.");
			} else if (salbrut >= 2571.01 && salbrut <= 3856) {
				descinss = (float) (salbrut * 0.11);
				System.out.println("Desconto do INSS de 11%.");
			} else if (salbrut >= 3856.01 && salbrut <= 7087.21) {
				descinss = (float) (salbrut * 0.14);
				System.out.println("Desconto do INSS de 14%.");
			}

			// condicional imposto de renda

			float imprend = 0; // variavel de desconto do imposto

			///verificador da condição
			if (salbrut <= 1903.98) {
				System.out.println("Isento de Imposto de Renda.");
			} else if (salbrut >= 1903.99 && salbrut <= 2826.65) {
				imprend = (float) (salbrut * 0.075);
				System.out.println("Desconto do Imposto de Renda de 7,5%.");
			} else if (salbrut >= 2826.66 && salbrut <= 3751.05) {
				imprend = (float) (salbrut * 0.15);
				System.out.println("Desconto do Imposto de Renda de 15%.");
			} else if (salbrut >= 3751.06 && salbrut <= 4664.68) {
				imprend = (float) (salbrut * 0.225);
				System.out.println("Desconto do Imposto de Renda de 22,5%.");
			} else if (salbrut > 4664.68) {
				imprend = (float) (salbrut * 0.275);

				System.out.println("Desconto do Imposto de Renda de 27,5%.");
			}

			// verificação do imposto de renda de acordo com o número de dependentes
			float deddep = (float) (189.59 * numdep);

			imprend = imprend - deddep;

			if (imprend < 0) {
				imprend = 0;
			}

			salbrut = (float) (salbrut - (imprend + descinss));

			// condicionais booleanas - vales
			if (vt == true) { // verificação do vt
				System.out.println("Vale Transporte descontado. (6% do salário bruto)");
				salbrut = (float) (salbrut - (salbrut * 0.06));
			} else {
				System.out.println("Sem desconto de Vale Transporte.");
			}
			if (va == true) { // verificação do va
				System.out.println("Vale Alimentação descontado. (R$200,00)"); // desconto do va
				salbrut = salbrut - 200;
			} else {
				System.out.println("Sem desconto de Vale Alimentação.");
			}
			if (vr == true) { // verificação do vr
				System.out.println("Vale Refeição descontado. (R$250,00)");
				salbrut = salbrut - 250;
			} else {
				System.out.println("Sem desconto de Vale Refeição.");
			}

			// condicionais - plano de saude
			if (planoSaude == 1) { // verificação do plano de saúde
				salbrut = salbrut - 150;
				System.out.println("Plano de saúde Básico descontado.");
			} else if (planoSaude == 2) {
				salbrut = salbrut - 300;
				System.out.println("Plano de saúde Avançado descontado.");
			} else {
				System.out.println("Sem desconto de plano de saúde.");
			}

			// imprimir salário final
			System.out.printf("Salário líquido: R$ %.2f\n", salbrut);

			// decisão do loop
			System.out.println(
					"Deseja continuar no programa? Digite 0 para sair. Digite qualquer número para continuar.");
			i = sc.nextInt(); // definir se o loop vai continuar ou não
		} while (i != 0);

		sc.close();
	}

}
