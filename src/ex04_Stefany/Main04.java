package ex04_Stefany;

import java.util.Locale;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int funcionario;
		int horas;
		double valorHora; 
		double salario;
		
		System.out.println("Digite seu número:" );
		funcionario = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.println("Digite o valor que recebe por hora" );
		valorHora = sc.nextDouble();
		
		
		salario = horas * valorHora;
		
		System.out.println("NUMERO = " + funcionario);
		System.out.printf("SALARIO = U$ %.2f%n " , salario);
		sc.close();
	}

}
