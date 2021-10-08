package applications;

import java.util.Scanner;

import entities.Aviao;

public class TesteAviao {
	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("G-02",200,"Gol");
		Scanner leia = new Scanner(System.in);
		
		char op = ' ';
		
		System.out.print("AVIÃO ESTÁ [1]-EM.USO OU [2]-GARAGEM? ");
		op = leia.next().charAt(0);
		
		if (op=='1') {
			aviao.setStatus(true);
			System.out.printf("\nDESEJA [1]-ATERRISSAR OU [2]-DECOLAR? ");
			op = leia.next().toUpperCase().charAt(0);
			
			if(op=='1') {
				aviao.aterrissar();
			}
			if (op=='2') {
				aviao.decolar();
			}
			
		} else {
			aviao.setStatus(false);
			System.out.print("\nDESEJA COLOCA-LO EM USO [S/N]? ");
			op = leia.next().toUpperCase().charAt(0);
			
			if(op=='S') {
				aviao.setStatus(true);
				aviao.prepararParaUsar();
			} 
			if(op=='N') {
				aviao.setStatus(false);
				aviao.disponivel();
			}	
		}

		
		
		
		
	}

}
