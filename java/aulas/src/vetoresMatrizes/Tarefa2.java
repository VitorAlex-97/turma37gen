package vetoresMatrizes;
import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {
	
	/*
	 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.
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
			
			System.out.printf("%dº laçamento: ", x+1);
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
		System.out.printf("MÉDIA: %.2f \nSOMA DOS LANÇAMENTOS: %.0f \nFREQUÊNCIA DO MAIOR LANÇAMENTO: %d",mediaLancamentos, somador, contadorMaiorLancamento);
		
		
		

	}

}
