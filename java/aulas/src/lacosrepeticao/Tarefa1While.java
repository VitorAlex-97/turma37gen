package lacosrepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1While {
	
	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
	 * */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idadeDigitada = 0;
		int contadorPessoasAbaixoVinteUm = 0;
		int contadorPessoasAcmaCinquenta = 0;
		
		System.out.println("DIGITE -99 PARA SAIR, E VER O RESULTADO.");
		System.out.println("-----------------------------------------");
		
		//NÃO INTERFERE NA LÓGICA
		idadeDigitada = 30;
		
		while (idadeDigitada != -99) {
			System.out.print("Informe a idade de uma pessoa: ");
			idadeDigitada = leia.nextInt();
			
			if (idadeDigitada < 21 && idadeDigitada!= -99) {
				contadorPessoasAbaixoVinteUm++;
			}
			
			if (idadeDigitada > 50) {
				contadorPessoasAcmaCinquenta++;
			}
		}
		
		System.out.printf("Há %d pessoas com idade abaixo de 21 anos\n",contadorPessoasAbaixoVinteUm );
		System.out.printf("Há %d pessoas com idade acima de 50 anos\n",contadorPessoasAcmaCinquenta );
		
	}

}
