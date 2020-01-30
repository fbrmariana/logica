package estruturaSequencialParte1;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002AreaCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio ,area, n = 3.14159;
		
		raio = sc.nextDouble();
		
		area =  raio * raio * n ;
		
		System.out.printf("A=%.4f%n", area );
		
		sc.close();
		


	}

}
