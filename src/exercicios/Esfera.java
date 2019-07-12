package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {

    public static void calculo() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double R, volume,pi;
        R = sc.nextDouble();
        pi = 3.14159;
        volume = (double) 4/3 * pi * Math.pow(R, 3.0);


        System.out.printf("VOLUME = %.3f%n", volume) ;

        sc.close();


    }
}
