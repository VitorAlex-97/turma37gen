package application;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Estoque {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		HashMap<String, Produto> estoque = new HashMap<String, Produto>();
		int op;
		
		op = mostrarMenu(scan); 
		
		while(op>=1 && op<5) {
				
			if(op == 1) {
				adicionarProduto(scan, estoque);
				limpar();
			} else if (op == 2) {
				atualizarProduto();
				
			} else if (op == 3) {
				
			} else if(op == 4) {
				listarEstoque(scan, estoque);
				limpar();
			} else {
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
		System.out.println("1. Adicionar");
		System.out.println("2. Atualizar");
		System.out.println("3. Remover");
		System.out.println("4. Listar");
		System.out.println("5. Sair");
		System.out.print(">>O que você deseja? ");
		op = scan.nextInt();
		scan.nextLine();
		
		while(op<1 || op>5) {
			System.out.println();
			System.out.println("Opção inválida!");
			System.out.print("O que você deseja: ");
			op = scan.nextInt();
			scan.nextLine();
		}
		limpar();
		
		return op;

	}
	
	private static void adicionarProduto(Scanner scan, HashMap<String, Produto> estoque) throws IOException {
		
		int contador = 0;
		char op;
		
		do {	
			contador++;
			System.out.println("ADICIONANDO PRODUTOS NO ESTOQUE");
			System.out.println("----------------------------------");
			
			System.out.print("Nome: ");
			String nomeProduto = scan.next().toLowerCase().trim();
			
			System.out.print("Preço: R$");
			double precoProduto = scan.nextDouble();
			scan.nextLine();
			
			System.out.print("Estoque: ");
			int qtdEstoque = scan.nextInt();
			scan.nextLine();
			
			estoque.put("G20"+contador, new Produto(nomeProduto, precoProduto));
			estoque.get("G20"+contador).setEstoque(qtdEstoque);
			
			System.out.print("Deseja continuar adicionando? [S/N]: ");
			op = scan.next().toUpperCase().charAt(0);
			System.out.println();
		} while(op == 'S');
		
		System.out.println("Aperte ENTER para voltar ao menu");
		System.in.read();
		
		
	}
	
	private static void listarEstoque (Scanner scan, HashMap<String, Produto> estoque) throws IOException {	
		System.out.println("ESTOQUE:");
		System.out.println("-----------------------------");
		for (String chave : estoque.keySet()) {
			System.out.printf("Código %s\n", chave);
			System.out.printf("Nome: %s\n", estoque.get(chave).getNome());
			System.out.printf("Preço: %.2f\n", estoque.get(chave).getPreco());
			System.out.printf("Estoque: %d\n", estoque.get(chave).getEstoque());
			System.out.println();
		}
		System.out.println("Aperte ENTER para voltar ao menu");
		System.in.read();
	}
	
	
	private static void limpar() {
		for(int x=0; x<60; x++) {
			System.out.println();
		}
	}
	
	
	

}
