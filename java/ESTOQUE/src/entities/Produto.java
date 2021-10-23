package entities;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Produto {

	private String nome;
	private double preco;
	private int estoque;
	private int contador;
	
	
	//CONSTRUTOR
	public Produto(String nome, double preco) {
		this.preco = preco;
		this.nome = nome;
	}
	
	public Produto() {
		
	}
	
	
	
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void setContador(double preco) {
		this.preco = preco;
	}

	public int getContador() {
		return estoque;
	}
	
	
	
	//MÉTODOS
	
	public HashMap<String, Produto> atualizaProduto(HashMap<String, Produto> estoque, Scanner scan) throws IOException {
		
		String codDigitado;
		boolean keyNotExist = true;
		char opConfirmar;
		
		do {
			System.out.print("Digie o código que deseja alterar: ");
			codDigitado = scan.next().trim();
			
			//PERCORRENDO O ESTOQUE
			for (Map.Entry<String, Produto> iterador : estoque.entrySet()) {
				
				if(codDigitado.equals(iterador.getKey())) {
					
					System.out.println("Produto encontrado:");
					System.out.println("-----------------------------");
					System.out.println("Código: "+codDigitado);
					System.out.println(iterador.toString());
					System.out.println();
					
					System.out.println("ALTERAÇÃO DE PRODUTO");
					System.out.println("-----------------------------");
					System.out.println("1-> Estoque");
					System.out.println("2-> Preço");
					System.out.println("3-> Nome");
					System.out.println("4-> Sair");	
					System.out.print("O que você deseja altera?");
					int opAlterar = scan.nextInt();
					scan.nextLine();
					
					
					System.out.println();
					switch (opAlterar) {
					
						case 1:
							System.out.print("Novo Estoque: ");
							int qtd = scan.nextInt();
							scan.nextLine();

							while (qtd < 0) {
								System.out.print("Valor inválido\nNova quantidade: ");
								qtd = scan.nextInt();
							}
					
							System.out.println("Confirmar alteração? [S/N]: ");
							opConfirmar = scan.next().toUpperCase().charAt(0);
							
							if (opConfirmar == 'S') {
								iterador.getValue().estoque = qtd;
								keyNotExist = false;
							} 
							else {
								System.out.println();
								System.out.println("Alteração cancelada!");
							}
						break;
						
						case 2: 
							System.out.print("Novo Preço: R$");
							double newPrice = scan.nextDouble();
							scan.nextLine();
							
							while (newPrice<=0) {
								System.out.println("Valor inválido\nNovo Preço: ");
								newPrice = scan.nextDouble();
							}
							
							System.out.println("Confirmar alteração? [S/N]: ");
							opConfirmar = scan.next().toUpperCase().charAt(0);
							
							if (opConfirmar == 'S') {
								iterador.getValue().preco = newPrice;
								keyNotExist = false;
							} 
							else {
								System.out.println();
								System.out.println("Alteração cancelada!");
							}	
						break;
						
						case 3: 
							System.out.print("Novo Nome: ");
							String newName = scan.next().toUpperCase();
							scan.nextLine();				
							
							System.out.println("Confirmar alteração? [S/N]: ");
							opConfirmar = scan.next().toUpperCase().charAt(0);
							
							if (opConfirmar == 'S') {
								iterador.getValue().nome = newName;
								keyNotExist = false;
							} 
							else {
								System.out.println();
								System.out.println("Alteração cancelada!");
							}
							
						break;
						
						default: 
							break;
								
					}
					
					
				}
				
			}	
			
		} while(keyNotExist);
		
		System.out.println("Aperte ENTER para voltar ao menu");
		System.in.read();
		
		return estoque;
			
	
	}
	
	public HashMap<String, Produto> removerEstoque (Scanner scan, HashMap<String, Produto> estoque) throws IOException {
		
		Produto produtoRemovido = new Produto();
		String codRemover;
		boolean isKeyExist = false;
		char op = 'N';
		
		
		System.out.println("REMOVER PRODUTO DO ESTOQUE");
		System.out.println("-----------------------------");
		System.out.print("Cogido do produto que deseja remover: ");
		codRemover = scan.next();
		System.out.println();
		
		do {
			
			/*
			for(Map.Entry<String, Produto> iterador : estoque.entrySet()) {
				
				if(iterador.getKey().equals(codRemover)) {		
					codExiste = true;
					produtoRemovido = iterador.getValue();
				}
				
			}
			*/
			
			if(estoque.containsKey(codRemover)) {
				isKeyExist = true;
				produtoRemovido = estoque.get(codRemover);
			}
			
			if (isKeyExist) {
				System.out.println("PRODUTO");
				System.out.println("-----------------------------");
				System.out.println("Código: " + codRemover);
				System.out.printf(produtoRemovido.toString());
				
				System.out.println();
				System.out.print("Deseja confirmar o a remoção? [S/N] ");
				char confirmarRemocao = scan.next().toUpperCase().charAt(0);
				System.out.println();
				
				if (confirmarRemocao == 'S') {
					estoque.remove(codRemover);
					System.out.println("Remoção realizada com sucesso!");
					
				} else {
					System.out.println("Remoção cancelada!!");
				}
				
			} else {
				System.out.println();
				System.out.println("Código não encontrado");
				System.out.print("Deseja tentar novamente? [S/N] ");
				op = scan.next().toUpperCase().charAt(0);
				
				if (op == 'S') {
					System.out.println();
					System.out.print("Cogido do produto que deseja remover: ");
					codRemover = scan.next();
				}
			}
			isKeyExist = false;
		} while(op == 'S');
		
		System.out.println("-----------------------------");
		System.out.println("Aperte ENTER para voltar ao menu");
		System.in.read();
		
		return estoque;
	}
	
	private void listaProduto(String codDigitado, Produto iterado) {
		System.out.println();
		System.out.println("Produto encontrado:");
		System.out.println("-----------------------------");
		System.out.println("Código: "+codDigitado);
		System.out.println(iterado.toString());
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\npreco: R$" + preco + "\nestoque: " + estoque +"\n";
	}
	
	
	

	
	
	
}
