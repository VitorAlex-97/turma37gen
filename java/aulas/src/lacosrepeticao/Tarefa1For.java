package lacosrepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1For {
	
	/*
	 * Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)
	 * 
	 * */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia =  new Scanner (System.in);
		
		
		System.out.println("PROGRAMA PRINTA TODOS OS NÚMEROS DE 1000 A 1999 QUE");
		System.out.println("QUANDO DIVIDO POR 11 OBTEMOS RESTO = 5.");
		System.out.println("------------------------------------------------------");
		
		for (int x=1000; x<=1999; x++) {
			if (x%11 == 5) {
				System.out.println(x);
			}
		}
		

	}

}
