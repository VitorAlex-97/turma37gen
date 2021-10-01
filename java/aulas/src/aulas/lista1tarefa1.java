package aulas;

import java.util.Scanner;

/*
 * Faça um sistema que leia a idade 
 * de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 * 
 */

public class lista1tarefa1 {
	public static void main(String args[]) {
		
		Scanner read = new Scanner(System.in);
		
		int diaIdade, mesIdade, anoIdade, transformaDia;
		
		System.out.println("Infor sua idade da forma pedida abaixo: ");
		
		System.out.print("Dias: ");
		diaIdade = read.nextInt();
		
		System.out.print("Meses: ");
		mesIdade = read.nextInt();
		
		System.out.print("Anos: ");
		anoIdade = read.nextInt();
		
		System.out.println("");
		
		transformaDia = diaIdade + mesIdade*30 + anoIdade*365;
		
		System.out.print("Você tem, atualmente, " + transformaDia + " dias de vida");
		
	}
}
