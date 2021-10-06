package vetoresMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1 {
	
	/*
	 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	 * */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double notas[] = new double[5];
		double maiorNota = 0.00;
		
		for (int x=0; x<5; x++) {
			
			do {
				
				System.out.printf("Informe a %dº nota: ", x+1);
				notas[x] = leia.nextDouble();
				
				if(notas[x]<0 || notas[x]>10) {
					System.out.println();
					System.out.println("DIGITE UMA NOTA VÁLIDA!");
				}
				
			} while(notas[x]<0 || notas[x]>10);
			
			
			if (notas[x] > maiorNota) {
				maiorNota = notas[x];
			}
		}
		
		System.out.println();
		System.out.printf("A maior nota é: %.2f", maiorNota);
		

		
	}

}
