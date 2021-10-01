package aulas;

import java.util.Scanner;

public class lista1tarefa5 {
	public static void mai(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaNotas;
		
		System.out.println("Nota1: ");
		nota1 = read.nextDouble();
		
		System.out.println("Nota2: ");
		nota2 = read.nextDouble();
		
		System.out.println("Nota3: ");
		nota3 = read.nextDouble();
		
		mediaNotas = (nota1*2 + nota2*3 + nota3*5)/10.0;
		
		System.out.println("A média das notas é: "+ mediaNotas);
		
	}
}
