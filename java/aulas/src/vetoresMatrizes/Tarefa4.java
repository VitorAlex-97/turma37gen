package vetoresMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {
	
	/*
	 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
	 * */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int matiz[][] = new int[3][3];
		int somaElementos = 0;
		int somaDiagonalPrincipal = 0;
		
		System.out.println("PREENCHENDO A MATRIZ [linha][col]");
		System.out.println("....................................");
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ", (i+1), (j+1));
				matiz[i][j] = leia.nextInt();
				
				somaElementos += matiz[i][j];
				
				if (i==j) {
					somaDiagonalPrincipal += matiz[i][j];
				}
			}
			
		}
		System.out.println("....................................");
		System.out.printf("\nA SOMA DOS ELEMENTOS DA MATRIZ É: %d", somaElementos);
		System.out.printf("\nA SOMA D DIAGONAL PRINCIPAL DA MATRIZ É: %d", somaDiagonalPrincipal);
		

	}

}
