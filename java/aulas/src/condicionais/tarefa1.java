package condicionais;

import java.util.Scanner;

public class tarefa1 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int terceiroNumero = 0;
		int maiorNumero = 0;
		
		System.out.println("O PROGRAMA L� 3 N�MEROS INTEIROS E RETORNA O MAIOR ENTRE ELES.");
		System.out.println("---------------------------------------------------------------");
		System.out.print("Digite o Primeiro n�mero: ");
		primeiroNumero = read.nextInt();
		read.nextLine();
		
		System.out.print("Digite o Segundo n�mero: ");
		segundoNumero = read.nextInt();
		read.nextLine();
		
		System.out.print("Digite o Primeiro n�mero: ");
		terceiroNumero = read.nextInt();
		read.nextLine();
		
		if ((primeiroNumero > segundoNumero) && (primeiroNumero > terceiroNumero)) {
			maiorNumero = primeiroNumero;
		} else if ((segundoNumero > primeiroNumero) && (segundoNumero > terceiroNumero)) {
			maiorNumero = segundoNumero;
		} else {
			maiorNumero = terceiroNumero;
		}
		
		System.out.printf("\nO maior n�mero Digitado foi o: %6d",maiorNumero);
		
	}
}
