package aulas;

import java.util.Scanner;

public class lista1tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		int duracaoEvento, qtdHoras, qtdMinutos, qtdSegundos;
		
		
		System.out.print("Informe a duração do evento (em segundos): ");
		duracaoEvento = read.nextInt();
		
		qtdHoras = duracaoEvento/3600;
		qtdMinutos = (duracaoEvento%3600)/60;
		qtdSegundos = (duracaoEvento%3600)%60;
		
		System.out.println("O evento durou cerca de "+qtdHoras+" hora(s), "+qtdMinutos+" minuto(s) e "+qtdSegundos+" segundo(s)");
	}

}
