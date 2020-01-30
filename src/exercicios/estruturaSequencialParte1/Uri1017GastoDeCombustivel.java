package estruturaSequencialParte1;

import java.util.Locale;
import java.util.Scanner;

	public class Uri1017GastoDeCombustivel {

	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int tempo,velocidade, distancia;
			double resultado;
			
			tempo = sc.nextInt();
			velocidade = sc.nextInt();
			
			distancia = tempo * velocidade;
			
			resultado = distancia / 12.0;
			
			
			

			System.out.printf( "%.3f%n", resultado);
			
			
			sc.close();

			

		}

	}




