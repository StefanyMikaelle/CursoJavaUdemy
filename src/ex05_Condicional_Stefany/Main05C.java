package ex05_Condicional_Stefany;

import java.util.Locale;
import java.util.Scanner;

public class Main05C {
	
	
	
	public static void main(String[] args) {
		int codigo;
		int quantidade;
		double valor = 0.0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código de um item e a quantidade "
				+ "deste item:");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		switch (codigo) {
		case 1:
			// Valor cachorro quente
			valor = 4.00;
			break;
		case 2:
			// Valor X-Salada
			valor = 4.50;
			break;
		case 3:
			// Valor X-Bacon
			valor = 5.00;
			break;
		case 4:
			// Valor Torrada Simples
			valor = 2.00;
			break;
		case 5:
			// Valor Refrigerante
			valor = 1.50;
			break;
		default: 
			System.out.println("Valor Invalido! Produto Inexistente!");
			break;
		}
		
		System.out.printf("Total: R$ %.2f%n", (valor * quantidade));
	}
	
}
