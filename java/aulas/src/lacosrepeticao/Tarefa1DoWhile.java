package lacosrepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1DoWhile {
	
	/*
	 * Crie um programa que leia um número do teclado até que encontre um
		número igual a zero. No final, mostre a soma dos números
		digitados.(DO...WHILE)
	 * */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numeroDigitado = 0;
		int somador = 0;
		int contador = 1;
		System.out.println("DIGITE ZERO (0) PARA PARAR A SOMA.");
		System.out.println("-------------------------------------");
		
		do {	
			System.out.printf("Digite o %dº número inteiro: ",contador);
			numeroDigitado = leia.nextInt();
			
			somador += numeroDigitado;
			contador++; 
			
		} while(numeroDigitado != 0);
		System.out.println("--------------------------------------");
		System.out.printf("A SOMA DOS NÚMEROS INTEIROS DIGITADOS É: %d", somador);
		System.out.println();
		
		
	}

}
