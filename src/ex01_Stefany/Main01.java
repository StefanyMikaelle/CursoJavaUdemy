package ex01_Stefany;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		int valor1;
		int valor2;
		int soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor2 = sc.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
