package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//CONSTRUINDO O OBJETO PESSOA DA CLASSE ContaBancaria
		ContaBancaria pessoa = new ContaBancaria("Maria Alyce Sales da Costa", 5631, 01, 1000.00);
		
		char op;
		double valor = 0.0;
		
		
		System.out.printf("Olá, %s! \n", pessoa.getTitular());
		System.out.print("\nO QUE VOCÊ DESEJA?\n[1]-SACAR / [2]-DEPOSITAR / [3]-SALDO: ");	
		op = leia.next().toUpperCase().charAt(0);
		
		if(op == '3') {
			System.out.printf("\nSEU SALDO É DE R$%.2f \n",pessoa.getSaldo());
			System.out.println("--------------------------------");
			System.out.print("DESEJA REALIZAR ALGUMA OPERAÇÃO? \n[1]-SACAR / [2]-DEPOSITAR /[3]-SAIR: ");
			op = leia.next().toUpperCase().charAt(0);
		}
		
		if(op == '1') {
			System.out.print("\nQUAL VALOR VOCÊ DESEJA SACAR? ");	
			valor = leia.nextInt();
			
			if(pessoa.getSaldo()>=valor) {
				pessoa.sacar(valor);
			} 
			else {
				do {
					System.out.println("\nSALDO INSUFICIENTE!");
					System.out.print("NOVO VALOR: ");
					valor = leia.nextInt();
				} while (pessoa.getSaldo()<valor);
				pessoa.sacar(valor);
			}
		}
		
		if(op=='2') {
			System.out.print("\nQUAL O VALOR DESJA DEPOSITAR? ");	
			valor = leia.nextInt();
			pessoa.depositar(valor);
		}
		
		System.out.println("\n\nOBRIGADO POR USAR NOSSOS SERVIÇOS!!");

	}

}
