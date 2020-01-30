package exercicios;

import java.util.Scanner;

public class MediaDeIdade {

        public static void calculo() {

            Scanner sc = new Scanner(System.in);

            int idade = sc.nextInt();
            int soma = 0;
            int cont = 0;

            while (idade > 0) { // (while) Enquanto idade for (<) maior  do que zero
                soma = soma + idade;
                cont = cont + 1;
                idade = sc.nextInt();
            }
            if (cont > 0 ) {
                double media = (double) soma / cont;
                System.out.printf("Media %.2f%n" , media);
            }
            else {
                System.out.println("impossivel calcular");
            }


            sc.close();
        }
}

