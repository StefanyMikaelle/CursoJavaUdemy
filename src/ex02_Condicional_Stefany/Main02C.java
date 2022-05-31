package ex02_Condicional_Stefany;

import java.util.Scanner;

public class Main02C {

	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		valor = sc.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();

	}

}
