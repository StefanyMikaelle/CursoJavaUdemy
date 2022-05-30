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
		
		System.out.println("Digite o código da peça 1, "
				+ "o número de peças 1,"
				+ " o valor unitário de cada peça 1" );
		codigo1 = sc.nextInt();
		quantPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça 2, "
				+ "o número de peças 2,"
				+ " o valor unitário de cada peça 2" );
		codigo2 = sc.nextInt();
		quantPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		total = (quantPeca1 * valorPeca1)+(quantPeca2 * valorPeca2);
		
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n " , total);
		sc.close();
	}

}
