package ex01_Condicional_Stefany;

import java.util.Scanner;

public class Main01C {

	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		valor = sc.nextInt();
		
		if(valor<0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}

}
