package estruturaSequencialParte2;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009SalarioComBonus {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioFixo, totalVendas, totalSalario;
		
		nome = sc.next();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		
		totalSalario = salarioFixo + totalVendas * 0.15;
		

		System.out.printf("TOTAL = R$ %.2f%n" , totalSalario);
		
		
		sc.close();

		

	}

}


