package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ImparPar {

    public static void calculo() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se é par ou impar: ");

        int n = sc.nextInt();

        if ( n % 2 == 0  ) {
            System.out.println("Numero par");
        } else  {
            System.out.println("Número Impar");

        }

    }
}