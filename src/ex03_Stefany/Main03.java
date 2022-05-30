package ex03_Stefany;

import java.util.Locale;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int C; 
		int D;
		int diferenca;
		
		
		System.out.println("Digite A, B, C e D para calcular "
				+ "DIFERENCA = (A * B - C * D)");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("DIFERENCA = " + diferenca);
		sc.close();
	}

}
