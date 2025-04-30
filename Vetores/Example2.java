package Vetores;

public class Example2 {

	public static void main(String[] args) {
		//declarando vetor
		int vetor[] = { 1, 3, 2 };

		int maior = 0;

		int menor = 0;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maior) {

				maior = vetor[i];
			}

			for (int e = 0; e < vetor.length; e++) {

				if (vetor[e] < menor) {

					menor = vetor[e];
				}

			}

			int vetorA[] = { 1, 3, 2 };
			int vetorB[] = { 2, 4, 2 };

			for (int a = 0; a < vetorB.length; a++) {

				if (vetorA[a] == vetorB[a]) {
					System.out.println(vetorA[a] + " posicao " + a);
				}

			}

			int vetorAB[] = { 2, 4, 6, 1 };

			for (int e = 0; e < vetorA.length; e++) {
				int temp1 = vetorAB[0];
				int temp2 = vetorAB[1];
				int temp3 = vetorAB[2];
				int temp4 = vetorAB[3];

				vetorAB[0] = temp4;
				vetorAB[1] = temp1;
				vetorAB[2] = temp2;
				vetorAB[3] = temp3;
			}

		}
	}
}