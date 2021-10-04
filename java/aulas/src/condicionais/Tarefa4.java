package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {

	/*
	 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e 
	 * exiba se este n�mero � par ou �mpar.
	 * 	
	 * 	Se for par exiba tamb�m a raiz quadrada do mesmo; 
	 * 	se for �mpar exiba o n�mero elevado ao quadrado.
	 * 
	 * */
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double numero = 0.0;
		double resto = 0.0;
		
		System.out.print("Digite um n�mero inteiro (ex: 4.0): ");
		numero = leia.nextDouble();
		
		resto = numero%2.0;
		
		if (numero!=0.0) {
			
			if (resto == 0.0) {
				System.out.printf("Como o n�mero � %.2f par, elevamos ele ao quadrado: %.2f",numero, numero*numero);
			}
			else {
				System.out.printf("Como o n�mero %.2f � impar, fizemos sua raiz quadrada : %.2f",numero, Math.sqrt((numero)));
			}
		} else {
			System.out.println("Voc� digitou o zero (N�mero neutro)");
		}
		
	}

}
