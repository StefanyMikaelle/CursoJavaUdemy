package ex05_Stefany;

import java.util.Locale;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo1;
		int quantPeca1;
		int codigo2;
		int quantPeca2;
		double valorPeca1; 
		double valorPeca2;
		double total;
		
		System.out.println("Digite o c�digo da pe�a 1, "
				+ "o n�mero de pe�as 1,"
				+ " o valor unit�rio de cada pe�a 1" );
		codigo1 = sc.nextInt();
		quantPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite o c�digo da pe�a 2, "
				+ "o n�mero de pe�as 2,"
				+ " o valor unit�rio de cada pe�a 2" );
		codigo2 = sc.nextInt();
		quantPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		total = (quantPeca1 * valorPeca1)+(quantPeca2 * valorPeca2);
		
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n " , total);
		sc.close();
	}

}
