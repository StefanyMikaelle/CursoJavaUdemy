package ex06_Stefany;

import java.util.Locale;
import java.util.Scanner;

public class Main06 {
	private static final double PI = 3.14159;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A; 
		double B;
		double C;
		double areaTriangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		
		System.out.println("Digite tr�s valores A, B e C:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura 
		
		areaTriangulo = (A*C)/2;
		
		//b) a �rea do c�rculo de raio C. (pi = 3.14159)
		areaCirculo = PI*C*C;
		
		//c) a �rea do trap�zio que tem A e B por bases e C por altura.
		areaTrapezio = ((A+B)*C)/2;
		
		//d) a �rea do quadrado que tem lado B.
		areaQuadrado = B*B;
		
		//e) a �rea do ret�ngulo que tem lados A e B.
		areaRetangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n " , areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n " , areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n " , areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n " , areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n " , areaRetangulo);
		
		sc.close();
	}

}
