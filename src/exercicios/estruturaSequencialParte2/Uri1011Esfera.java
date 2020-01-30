package estruturaSequencialParte2;

import java.util.Locale;
import java.util.Scanner;

public class Uri1011Esfera {
	

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double X , raio,PI, volume;
		
		X = 3;
		
		PI = 3.14159;
		
		raio = sc.nextDouble();
		
		volume = 4.0 / 3.0 * PI * Math.pow(raio, X); 
		//Eleva a potencia da variavel ou do valor digitado após a virgula
		
		
		System.out.printf("VOLUME =  %.3f%n", volume);
		
		
		sc.close();

		

	}

}

