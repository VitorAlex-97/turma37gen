package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {

	/*
	 * 4- Faça um programa em que permita a entrada de um número qualquer e 
	 * exiba se este número é par ou ímpar.
	 * 	
	 * 	Se for par exiba também a raiz quadrada do mesmo; 
	 * 	se for ímpar exiba o número elevado ao quadrado.
	 * 
	 * */
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double numero = 0.0;
		double resto = 0.0;
		
		System.out.print("Digite um número inteiro (ex: 4.0): ");
		numero = leia.nextDouble();
		
		resto = numero%2.0;
		
		if (numero!=0.0) {
			
			if (resto == 0.0) {
				System.out.printf("Como o número é %.2f par, elevamos ele ao quadrado: %.2f",numero, numero*numero);
			}
			else {
				System.out.printf("Como o número %.2f é impar, fizemos sua raiz quadrada : %.2f",numero, Math.sqrt((numero)));
			}
		} else {
			System.out.println("Você digitou o zero (Número neutro)");
		}
		
	}

}
