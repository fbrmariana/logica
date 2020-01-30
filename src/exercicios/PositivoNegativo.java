package exercicios;

import java.util.Scanner;

public class PositivoNegativo {

    public static void calculo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber se é negativo ou positivo : ");

        int a = sc.nextInt();

        if (a <0 ) {
            System.out.println("Número negativo");
        } else  {
            System.out.println("Número positivo");

        }

    }
}
