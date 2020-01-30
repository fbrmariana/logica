package exercicios;

import java.util.Scanner;

public class MaiorNumero2 {

        public static void calculo () {

            Scanner sc = new Scanner(System.in);

            System.out.print("Escreva 3 numeros para saber qual é o maior: ");

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a > b && a > c) {
                System.out.println("Maior = " + a);
            } else if (b > c) {
                System.out.println("Maior = " + b);

            } else {
                System.out.println("Maior = " + c);
            }


        }
    }
