package condicionais;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		
		System.out.println("PROGRAMA L� 3 N�MEROS INTEIROS E OS COLOCA EM ORDEM CRESCENTE.");
		System.out.println("---------------------------------------------------------------");
		System.out.print("Primeiro n�mero: ");
		firstNumber = read.nextInt();
		
		System.out.print("Segundo n�mero: ");
		read.nextLine();
		secondNumber = read.nextInt();
		
		System.out.print("Terceiro n�mero: ");
		read.nextLine();
		thirdNumber = read.nextInt();
		
		if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber) && (secondNumber >= thirdNumber)){
			System.out.printf("\nA sequ�ncia �: %d, %d e %d",thirdNumber, secondNumber,firstNumber);
		} 
		else if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber) && (thirdNumber >= secondNumber)){
			System.out.printf("\nA sequ�ncia �: %d, %d e %d",secondNumber, thirdNumber,firstNumber);
		}
		else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber) && (firstNumber >= thirdNumber)){
			System.out.printf("\nA sequ�ncia �: %d, %d e %d",thirdNumber, firstNumber,secondNumber);
		} 
		else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber) && (thirdNumber >= firstNumber)){
			System.out.printf("\nA sequ�ncia �: %d, %d e %d",firstNumber, thirdNumber,secondNumber);
		} 
		else if ((thirdNumber >= firstNumber) && (thirdNumber >= secondNumber) && (secondNumber >= firstNumber)){
			System.out.printf("\nA sequ�ncia �: %d, %d e %d",firstNumber, secondNumber,thirdNumber);
		} 
		else if ((thirdNumber >= firstNumber) && (thirdNumber >= secondNumber) && (firstNumber >= secondNumber)){
			System.out.printf("\nA sequ�ncia �: %d, %d e %d",secondNumber, firstNumber,thirdNumber);
		} else {
			System.out.print("\nVoc� digitou um valor inv�lido!!");
		}
	}

}
