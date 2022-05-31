package ex04_Condicional_Stefany;

import java.util.Scanner;

public class Main04C {

	public static void main(String[] args) {
		int horaInicial;
		int horaFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial e a hora final do jogo:");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial - horaFinal == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else {
			if( horaFinal - horaInicial < 0) {
				System.out.printf("O JOGO DUROU %d HORA(S)", ((horaFinal - horaInicial) + 24));
				}
				else {
					System.out.printf("O JOGO DUROU %d HORA(S)", (horaFinal - horaInicial));	
				}
		}
		sc.close();
	}

}
