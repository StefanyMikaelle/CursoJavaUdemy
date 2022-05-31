package ex08_Condicional_Stefany;

import java.util.Locale;
import java.util.Scanner;

public class Main08C {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario; 
		double imposto;
		
		/*
		 * Renda								Imposto de Renda
		 * 0-2000									-> Isento
		 * 2000.01-3000									8%
		 * 3000.01-4500									18%
		 * > 4500										28%
		 */
		
		System.out.println("Digite seu salario:" );
		salario = sc.nextDouble();
		
		if(salario < 2000) {
			System.out.println("Isento" );
		} else if (salario > 2000 && salario <= 3000) {
			imposto = (salario - 2000)*0.08;
			System.out.printf("R$ %.2f%n" , imposto );
		} else if (salario > 3000 && salario <= 4500) {
			imposto = 1000 *0.08 + (salario - 3000)*0.18;
			System.out.printf("R$ %.2f%n" , imposto );
		} else {
			imposto = 1000 *0.08 + 1500*0.18 + 
					(salario - 4500)*0.28;
			System.out.printf("R$ %.2f%n" , imposto );
		}
		
		
		sc.close();
	}

}
