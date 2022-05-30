package ex02_Stefany;

import java.util.Locale;
import java.util.Scanner;

public class Main02 {
	private static final double PI = 3.14159;
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double area;
		
		System.out.println("Digite o valor do raio:");
		raio = sc.nextDouble();
		
		area = PI*raio*raio;
		
		System.out.printf("A = %.4f%n " , area);
		sc.close();
	}

}
