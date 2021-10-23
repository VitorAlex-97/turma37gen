package application;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Produto;

public class ControleEstoque {
	
public static int contador = 1;

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		HashMap<String, Produto> estoque = new HashMap<String, Produto>();
		Produto estoqueMetodos = new Produto();
		int op;
		
		
		op = mostrarMenu(scan); 		
		while (op>=1 && op<=5) {
				
			if(op  == 1) {
				estoque = adicionarProduto(scan, estoque);
				limpar();
			} else if (op == 2) {
				estoque = estoqueMetodos.atualizaProduto(estoque, scan);
				limpar();				
			} else if (op == 3) {
				listarEstoque(scan, estoque);
				limpar();
			} else if(op == 4) {
				estoque = estoqueMetodos.removerEstoque(scan, estoque);
				limpar();
			} else if(op == 5) {
				break;
			}
			
			op = mostrarMenu(scan);
		}
		
		System.out.println("DESENVOLVIDO POR VITU :)");
		
		
		
	}
	
	
	
	private static int mostrarMenu(Scanner scan) {
		
		int op;
		
		System.out.println("BEM VINDO AO CONTROLE DE ESTOQUE:");
		System.out.println("-----------------------------------");
		System.out.println("1-> Adicionar");
		System.out.println("2-> Atualizar");
		System.out.println("3-> Listar");
		System.out.println("4-> Remover");
		System.out.println("5-> Sair");
		System.out.print(">>O que você deseja? ");
		op = scan.nextInt();
		scan.nextLine();
		
		while (op<1 || op>5) {
			System.out.println();
			System.out.println("Opção inválida!");
			System.out.print("O que você deseja: ");
			op = scan.nextInt();
			scan.nextLine();
		} 
		
		limpar();
		
		return op;

	}
	
	private static HashMap<String, Produto> adicionarProduto(Scanner scan, HashMap<String, Produto> estoque) throws IOException {
	
		char op;
		
		do {
			System.out.println("ADICIONANDO PRODUTOS NO ESTOQUE");
			System.out.println("----------------------------------");
			
			System.out.print("Nome: ");
			String nomeProduto = scan.nextLine().toLowerCase();
			
			
			System.out.print("Preço: R$");
			double precoProduto = scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Estoque: ");
			int qtdEstoque = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Confimar adição? [S/N]: ");
			char confirmarAdicao = scan.nextLine().toUpperCase().charAt(0);
			
			if (confirmarAdicao == 'S') {
				estoque.put("00"+contador, new Produto(nomeProduto, precoProduto));
				estoque.get("00"+contador).setEstoque(qtdEstoque);
				System.out.println();
				System.out.println("Produto adicionado com sucesso!");
				contador++;
				
			} else {
				System.out.println("Adição cancelada!");
			}
				
			System.out.println();
			System.out.print("Deseja continuar adicionando? [S/N]: ");
			op = scan.next().toUpperCase().charAt(0);
			scan.nextLine();
			
			System.out.println();
		} while(op == 'S');
		
		System.out.println("Aperte ENTER para voltar ao menu");
		System.in.read();
		
		return estoque;
		
	}
	
	private static void listarEstoque (Scanner scan, HashMap<String, Produto> estoque) throws IOException {	
		System.out.println("ESTOQUE:");
		System.out.println("-----------------------------");
		for (String chave : estoque.keySet()) {
			System.out.printf("Código: %s\n", chave);
			System.out.printf("Nome: %s\n", estoque.get(chave).getNome());
			System.out.printf("Preço: R$%.2f\n", estoque.get(chave).getPreco());
			System.out.printf("Estoque: %d\n", estoque.get(chave).getEstoque());
			System.out.println();
		}
		
		if (estoque.isEmpty()) {
			System.out.println("Estoque está vazio!\nVolte ao menu e adicione produtos.");
		}
		System.out.println("\nAperte ENTER para voltar ao menu");
		System.in.read();
	}
	

	
	private static void limpar() {
		for(int x=0; x<50; x++) {
			System.out.println();
		}
	}
	
	
	

}
