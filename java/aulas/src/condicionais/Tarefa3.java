package condicionais;

import java.util.Scanner;

public class Tarefa3 {
	
	/*
	 * 3-Faça um programa que receba a idade de uma pessoa e mostre na saída 
	 * em qual categoria ela se encontra:
	 * 
		•	10-14 infantil
		•	15-17 juvenil
		•	18-25 adulto
	 * 
	 * */

	public static void main(String[] args) {
			
		Scanner read = new Scanner(System.in);
		
		int idade = 0;
		String classificacao = " ";
		
		System.out.println("PROGRAMA FAZ UMA CLASSIFICAÇÃO DE ACORDO COM A IDADE.");
		System.out.println("-------------------------------------------------------");
		System.out.print("Qual sua idade? ");
		idade = read.nextInt();
		
		if (idade<=25 && idade>=18) {
			classificacao = "Adulto";
		} else if (idade<18 && idade>=15) {
			classificacao = "Juvenil";
		} else if (idade<15 && idade>=14) {
			classificacao = "Infantil";
		} else {
			classificacao = "Sua idade não está inclusa nas faxetárias!";
		}
		
		if (classificacao == "Adulto" || classificacao == "Juvenil" || classificacao == "Infantil") {
			System.out.printf("Sua classificação é: %s",classificacao );
		} else {
			System.out.println(classificacao);
		}

	}

}
