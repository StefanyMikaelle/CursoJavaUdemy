package ex03_Condicional_Stefany;

import java.util.Scanner;

public class Main03C {

	public static void main(String[] args) {
		int A;
		int B;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros:");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A>B) {
			if(A % B == 0) {
			System.out.println("Sao Multiplos");
			}
			else {
			System.out.println("Nao sao Multiplos");	
			}
		}
		else {
			if(B % A == 0) {
				System.out.println("Sao Multiplos");
				}
				else {
				System.out.println("Nao sao Multiplos");	
				}
		}
		sc.close();
	}

}
