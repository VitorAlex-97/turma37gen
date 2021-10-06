package vetoresMatrizes;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Tarefa3 {
	
	/*
	 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		as matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.
	 * */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		final int LINHA = 4;
		final int COLUNA = 6;
		
		int N1[][] = new int[LINHA][COLUNA];
		int N2[][] = new int[LINHA][COLUNA];
		int M1[][] = new int[LINHA][COLUNA];
		int M2[][] = new int[LINHA][COLUNA];
		
		System.out.println("PREENCHENDO A MATRIZ N1[linha][col]");
		System.out.println("...........................");
		
		for (int i=0; i<LINHA; i++) {
			for (int j=0; j<COLUNA; j++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ", (i+1), (j+1));
				N1[i][j] = leia.nextInt();
			}
			
		}
		
		System.out.println();
		System.out.println("PREENCHENDO A MATRIZ N2[linha][col]");
		System.out.println("...........................");
		for (int i=0; i<LINHA; i++) {
			for (int j=0; j<COLUNA; j++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ", (i+1), (j+1));
				N2[i][j] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("MATRIZ M1 = N1 + N2:");
		System.out.println("...........................");
		for (int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
				System.out.print(M1[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("MATRIZ M2 = N1 - N2:");
		System.out.println("...........................");
		for (int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++) {
				M2[i][j] = N1[i][j] - N2[i][j];
				System.out.print(M2[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
