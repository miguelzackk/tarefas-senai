package problemaPiso;

import java.util.Scanner;

public class problemPiso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lar, com, piso, area, custo;

        System.out.printf("Digite a largura do cômodo: ");
        lar = sc.nextFloat();

        System.out.print("Digite o comprimento do cômodo: ");
        com = sc.nextFloat();

        System.out.print("Digite o valor do metro quadrado do piso: ");
        piso = sc.nextFloat();

        area = lar * com;

        System.out.printf("Área do cômodo: %.2f%n", area);

        custo = piso * area;
        System.out.printf("Custo total do piso = %.2f%n", custo);
        
        sc.close();
    }
}
