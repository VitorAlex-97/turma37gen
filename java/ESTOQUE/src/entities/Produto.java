package entities;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Produto {

	private String nome;
	private double preco;
	private int estoque;
	public static int contador = 1;
	
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
	
	
	
	//MÉTODOS
	public HashMap<String, Produto> atualizaProduto(HashMap<String, Produto> estoque, Scanner scan) throws IOException {
		
		String codDigitado;
		boolean keyNotExist = true;
		char opConfirmar;
		
		
		if (!estoque.isEmpty()) {
			
			do {
				System.out.println("ATUALIZAÇÃO DE PRODUTO");
				System.out.println("-----------------------------");		
				System.out.print("Digie o código que deseja alterar: ");
				codDigitado = scan.next().trim();
				
				if (!estoque.containsKey(codDigitado)) {
					System.out.println();
					System.out.println("PRODUTO NÃO ENCOTRADO!");
				}
				
				//PERCORRENDO O ESTOQUE
				for (Map.Entry<String, Produto> iterador : estoque.entrySet()) {
					
					if(codDigitado.equals(iterador.getKey())) {
						
						int opAlterar;
						System.out.println();
						System.out.println();
						System.out.println("Produto encontrado:");
						System.out.println("-----------------------------");
						System.out.println("CÓDIGO: "+codDigitado);
						System.out.println(iterador.getValue().toString());
						System.out.println();
				
						System.out.println("ESCOLHA UMA DAS OPÇÕES [1 à 4]: ");
						System.out.println("1-> ESTOQUE");
						System.out.println("2-> PREÇO");
						System.out.println("3-> NOME");
						System.out.println("4-> SAIR");
						System.out.print(">>> ");
						
						try {
							opAlterar = scan.nextInt();
							scan.nextLine();
						} catch (InputMismatchException exception) {
							System.out.println();
							scan.nextLine();
							System.out.println("ERRO: DIGITE APENAS NÚMEROS!");
							System.out.print(">>ESCOLHA UMA DAS OPÇÕES [1 à 4]: ");
							opAlterar = scan.nextInt();
							scan.nextLine();
						}
						
						
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
						
								System.out.print("Confirmar alteração? [S/N]: ");
								opConfirmar = scan.next().toUpperCase().charAt(0);
								
								if (opConfirmar == 'S') {
									iterador.getValue().estoque = qtd;
									keyNotExist = false;
									System.out.println();
									System.out.println("PRODUTO ATUALIZADO!");
								} 
								else {
									System.out.println();
									System.out.println("ALTERAÇÃO CANCELADA!");
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
									System.out.println();
									System.out.println("PRODUTO ATUALIZADO!");
								} 
								else {
									System.out.println();
									System.out.println("ALTERAÇÃO CANCELADA!");
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
									System.out.println();
									System.out.println("PRODUTO ATUALIZADO!");
								} 
								else {
									System.out.println();
									System.out.println("ALTERAÇÃO CANCELADA!");
								}
								
							break;
							
							default: 
								keyNotExist = false;
								break;
									
						}		
						
					} else {
						keyNotExist = false;
					}
					
				}	
				
			} while(keyNotExist);
			
		}
		else {
			System.out.println("ESTOQUE VAZIO!");
			System.out.println("VÁ AO MENU, E ADICIONE PRODUTOS AO ESTOQUE.");
		}
			
		System.out.println("\nAperte ENTER para voltar ao menu");
		System.in.read();
		
		return estoque;
			
	
	}
	
	public HashMap<String, Produto> removerProduto (Scanner scan, HashMap<String, Produto> estoque) throws IOException {
		
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
				System.out.println("CÓDIGO: " + codRemover);
				System.out.println(produtoRemovido.toString());
				
				System.out.print("Confirmar o a remoção? [S/N] ");
				char confirmarRemocao = scan.next().toUpperCase().charAt(0);
				System.out.println();
				
				if (confirmarRemocao == 'S') {
					estoque.remove(codRemover);
					System.out.println("PRODUTO REMOVIDO!");
					
				} else {
					System.out.println("REMOÇÃO CANCELADA!");
				}
				
			} else {
				System.out.println();
				System.out.println("CÓDIGO NÃO ENCONTRADO");
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
	
	public void listarEstoque (Scanner scan, HashMap<String, Produto> estoque) throws IOException {	
		System.out.println("ESTOQUE:");
		System.out.println("-----------------------------");
		for (String chave : estoque.keySet()) {
			System.out.printf("CÓDIGO: %s\n", chave);
			System.out.printf("NOME: %s\n", estoque.get(chave).getNome());
			System.out.printf("PREÇO: R$%.2f\n", estoque.get(chave).getPreco());
			System.out.printf("ESTOQUE: %d\n", estoque.get(chave).getEstoque());
			System.out.println();
		}
		
		if (estoque.isEmpty()) {
			System.out.println("ESTOQUE VAZIO!\nVolte ao menu e adicione produtos.");
		}
		System.out.println("\nAperte ENTER para voltar ao menu");
		System.in.read();
	}
	
	public  HashMap<String, Produto> adicionarProduto(Scanner scan, HashMap<String, Produto> estoque) throws IOException {
		
		char op;
		
		do {
			System.out.println("ADICIONANDO PRODUTOS NO ESTOQUE");
			System.out.println("----------------------------------");
			
			System.out.println("CÓDIGO: 00"+contador);
			
			System.out.print("NOME: ");
			String nomeProduto = scan.nextLine().toUpperCase();
			
			System.out.print("PREÇO: R$");
			double precoProduto = scan.nextDouble();
			scan.nextLine();
			
			System.out.print("ESTOQUE: ");
			int qtdEstoque = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Confimar adição? [S/N]: ");
			char confirmarAdicao = scan.nextLine().toUpperCase().charAt(0);
			
			if (confirmarAdicao == 'S') {
				estoque.put("00"+contador, new Produto(nomeProduto, precoProduto));
				estoque.get("00"+contador).setEstoque(qtdEstoque);
				System.out.println();
				System.out.println("PRODUTO ADICIONADO!");
				contador++;
				
			} else {
				System.out.println("OPERAÇÃO CANCELADA!");
			}
				
			System.out.println();
			System.out.print("Continuar adicionando? [S/N]: ");
			op = scan.next().toUpperCase().charAt(0);
			scan.nextLine();
			
			System.out.println();
			System.out.println();
		} while(op == 'S');
		
		System.out.println("----------------------------------");
		System.out.println("Aperte ENTER para voltar ao menu");
		System.in.read();
		
		return estoque;
		
	}
	
	public int mostrarMenu(Scanner scan) {
		
		int op = 0;
		
		try {
			System.out.println("BEM VINDO AO CONTROLE DE ESTOQUE:");
			System.out.println("-----------------------------------");
			System.out.println();
			System.out.println(">>ESCOLHA UMA DAS OPÇÕES [1 à 5]: ");
			System.out.println("1-> ADICIONAR");
			System.out.println("2-> ATUALIZAR");
			System.out.println("3-> LISTAR");
			System.out.println("4-> REMOVER");
			System.out.println("5-> SAIR");
			System.out.print(">>> ");
			op = scan.nextInt();
			scan.nextLine();
		}
		catch (InputMismatchException exception) {
			System.out.println();
			scan.nextLine();
			System.out.println("ERRO: DIGITE APENAS NÚMEROS!");
			System.out.print(">>ESCOLHA UMA DAS OPÇÕES [1 à 5]: ");
			op = scan.nextInt();
			scan.nextLine();
		}
		
		while (op<1 || op>5) {
			System.out.println();
			System.out.println("OPÇÃO INVÁLIDA!");
			System.out.print(">>ESCOLHA UMA DAS OPÇÕES [1 à 5]: ");
			op = scan.nextInt();
			scan.nextLine();
		} 
		
		limpar();
		
		return op;

	}
		
	private void limpar() {
		for(int x=0; x<50; x++) {
			System.out.println();
		}
	}

	public String dadosProduto() {
		return "NOME: " + nome + "\nPREÇO: R$" + preco + "\nESTOQUE: " + estoque +"\n";
	}
	
	@Override
	public String toString() {
		return "NOME: " + nome + "\nPREÇO: R$" + preco + "\nESTOQUE: " + estoque +"\n";
	}
	
	
	

	
	
	
}
