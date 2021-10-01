package aulas;

import java.util.Scanner;

public class lista1tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		int idadeDias, dias, meses, anos;
		
		System.out.print("Digite sua idade (em dias): ");
		idadeDias = read.nextInt();
		
		anos = idadeDias/365;
		meses = (idadeDias%365)/30;
		dias = (idadeDias%365)%30;
		
		System.out.println("Você tem "+anos+" ano(s), "+meses+" mes(es) e "+dias+" dias.");
	}

}
