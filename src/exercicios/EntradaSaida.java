package exercicios;

import java.util.Scanner;

public class EntradaSaida {
    public static void calculo() {
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        System.out.println("Digite 3 palavras  :");

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Você digitou: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // Variável String recebe sc.next - Ex: x = sc.next();
        // Variável Int recebe sc.nextInt - Ex: x = sc.next();
        // Variável Char recebe sc.next().charAt - EX: x = sc.next().charAt(0);
        // CharAt(0) pega o primeiro caractere do seu string,
        //     (0) pq é a primeira letra se quiser a segunda letra é só digitar (1) entre os parenteses
        // O Println ele pega localidade independente, o Prontf não.
        //Se você digitar mais de um caractere naturalmente ele vai pegar o primeiro.
        //  para ler vários dados na mesma linha, você vai chamar cada um dos comandos correspondentes
        // Ex: x = sc.next();
        //y = sc.nextInt();
        //z = sc.nextDouble();


        sc.close();
    }
}

