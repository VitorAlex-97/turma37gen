package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class CadProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Produto produto1 = new Produto();
		
		produto1.nome = "Camisa unisex";
		produto1.codigo = "001";
		produto1.valor = 49.90;
		produto1.estoque = 10;
		
		produto1.adicionarEstoque(5);
		
		System.out.println(produto1.toString());
		
		
		
	}
}
