package aulas;

import java.util.Scanner;

public class lista1tarefa4 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int A, B, C;
		int R, S;
		double D;
		
		System.out.print("Digite o valor de A: ");
		A = read.nextInt();
		
		System.out.print("Digite o valor de B: ");
		B = read.nextInt();
		
		System.out.print("Digite o valor de C: ");
		C = read.nextInt();
		
		R = (A+B)*(A+B);
		S = (B+C)*(B+C);
		
		D = (R+S)/2.0;
		
		System.out.println("Valor de D: "+D);
	}
}
