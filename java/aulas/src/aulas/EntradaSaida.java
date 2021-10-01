package aulas;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String args[]) {
		
		Scanner read = new Scanner(System.in);
		
		int A, B, soma;
		
		System.out.println("Entre com o valor de A: ");
		A = read.nextInt();
		
		System.out.println("Entre com o valor de B: ");
		B = read.nextInt();
		
		soma = A+B; 
		
		System.out.println("A soma entre "+ A+ " e "+ B+ " é: "+ soma);
	}
}
