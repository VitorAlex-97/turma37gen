package app;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaEmpresa;

public class G2Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		ContaEmpresa contaEmpresa = new ContaEmpresa(2364, "4566131245"); 
		int opConta, contador=0;
		char opMovi, opConti;
		double valor;
		
		
		System.out.println("[NOME DO BANCO]");
		System.out.println("[SLOGAN]");
		System.out.println();
		
		System.out.println("1- CONTA POUPAN�A");
		System.out.println("2- CONTA CORRENTE");
		System.out.println("3- CONTA ESPECIAL");
		System.out.println("4- CONTA EMPRESA");
		System.out.println("5- CONTA ESTUDANTIL");
		System.out.println("6- SAIR");
		System.out.println();
		System.out.print("DIGITE O C�DIGO DA OP��O SELECIONADA: ");
		opConta = leia.nextInt();
		
		while(opConta<1 && opConta>6) {
			System.out.println("OP��O INV�LIDA!");
			System.out.print("ESCOLHA UMA OP��O V�LIDA: ");
			opConta = leia.nextInt();
		}
		
		if (opConta == 4) {
			
			do {	
				System.out.println("[NOME DO BANCO]");
				System.out.println("[SLOGAN]");
				System.out.println();
				System.out.println("CONTA [EMPRESA]");
				
				System.out.printf("Saldo atual: R$ %.2f \n", contaEmpresa.getSaldo());	
				System.out.print("MOVIMENTO D-d�bito ou C-cr�dito: ");
				opMovi = leia.next().toUpperCase().charAt(0);
				
				while(opMovi != 'S' && opMovi != 'N') {
					System.out.print("OP��O INV�LIDA!! D-d�dito ou C-cr�dito: ");
					opMovi = leia.next().toUpperCase().charAt(0);
				}
				
				if (opMovi == 'S') {
					contaEmpresa.pedirEmprestimo(valor);
				} 
				
				System.out.print("Valor do movimento: R$");
				valor = leia.nextInt();
				
				
				
				
				System.out.print("Continuar [S/N]: ");
				opConti = leia.next().toUpperCase().charAt(0);
			} while(opConti == 'S' && contador<3);
			
			
			
			
			
			
		}
		
		

	}

}
