package exercicios;

import java.util.Scanner;

public class ExponenciacaolWhile {

        public static void calculo() {

            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();

            int soma = 1;
            while (x != 0) { // Enquanto X for diferente ou igual a 0
                soma *= x;
                x = sc.nextInt();

            }
            // fiz de X ( vezes) mas no exemplo o professor fez de mais
            System.out.println("Total dos numeros digitados = " + soma);

            sc.close();
        }
    }
