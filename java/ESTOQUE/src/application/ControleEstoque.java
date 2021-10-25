package application;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ControleEstoque {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		HashMap<String, Produto> estoque = new HashMap<String, Produto>();
		Produto estoqueMetodos = new Produto();
		int op;
		
		
		op = estoqueMetodos.mostrarMenu(scan); 		
		while (op>=1 && op<=5) {
				
			if(op  == 1) {
				estoque = estoqueMetodos.adicionarProduto(scan, estoque);
				limpar();
			} else if (op == 2) {
				estoque = estoqueMetodos.atualizaProduto(estoque, scan);
				limpar();				
			} else if (op == 3) {
				estoqueMetodos.listarEstoque(scan, estoque);
				limpar();
			} else if(op == 4) {
				estoque = estoqueMetodos.removerProduto(scan, estoque);
				limpar();
			} else if(op == 5) {
				break;
			}
			
			op = estoqueMetodos.mostrarMenu(scan);
		}
		
		System.out.println("DESENVOLVIDO POR VITU :)");
		
	}
	
	private static void limpar() {
		for(int x=0; x<50; x++) {
			System.out.println();
		}
	}

}
