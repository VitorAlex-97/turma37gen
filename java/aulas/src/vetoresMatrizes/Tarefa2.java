package vetoresMatrizes;
import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {
	
	/*
	 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	quantas foram as ocorr�ncias da maior pontua��o.
	 * */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int lancamentoDado[] = new int[10];
		int maiorLancamento = 0;
		int contadorMaiorLancamento = 0;
		double somador = 0.0;
		double mediaLancamentos = 0.0;
		
		for (int x=0; x<lancamentoDado.length; x++) {
			
			System.out.printf("%d� la�amento: ", x+1);
			lancamentoDado[x] = leia.nextInt();
			somador += lancamentoDado[x];
			
			if (lancamentoDado[x] > maiorLancamento) {
				contadorMaiorLancamento = 0;
			}
			
			if (lancamentoDado[x] >= maiorLancamento) {
				maiorLancamento = lancamentoDado[x];
				contadorMaiorLancamento++;
			}
			
		}
		
		mediaLancamentos = (somador/lancamentoDado.length);	
		System.out.println("-----------------------");
		System.out.printf("M�DIA: %.2f \nSOMA DOS LAN�AMENTOS: %.0f \nFREQU�NCIA DO MAIOR LAN�AMENTO: %d",mediaLancamentos, somador, contadorMaiorLancamento);
		
		
		

	}

}
