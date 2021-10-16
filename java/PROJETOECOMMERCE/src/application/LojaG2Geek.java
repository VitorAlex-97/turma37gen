package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class LojaG2Geek {

	public static void limpa() {

		for (int x = 0; x < 50; x++) {
			System.out.println();
		}

	}

	public static void cabecalho() {

		String nomeLoja = "『G』『2』『-』『G』『E』『E』『K』";
		String slogan = "♥ Dê START no seu estilo ♥";
		System.out.println();
		System.out.println(nomeLoja);
		System.out.print("\n" + slogan + "\n");
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Produto> produto = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();

		String nomeProduto[] = { "Camiseta Unissex Duff:Os Simpsons", "Camiseta Unissex The Game Master",
				"Camiseta Unissex Superman", "Camiseta Unissex Fortnite", "Camiseta Unissex Sonserina: HARRY POTTER",
				"Chaveiro Funko Pocket POP R2-D2:STAR WARS ", "Chaveiro Funko Pocket POP Home de ferro:VINGADORES",
				"Caneca Trono de ferro: GAME OF THRONES", "Almofada Geek Mulher maravilha:DC COMICS",
				"Almofada Geek Escudo Hylian: THE LEGEND OF ZELDA" };
		double valor[] = { 11.65, 13.95, 14.95, 15.92, 29.90, 36.90, 44.75, 59.90, 59.90, 59.90 };
		int indiceProduto = 0;
		char op;
		char opNovaCompra;
		String codCarrinho;
		String validacao;
		int quantidadeDig;

		for (int x = 0; x < nomeProduto.length; x++) {
			produto.add(new Produto("GK0" + (x + 1), nomeProduto[x], valor[x], 10));
		}

		cabecalho();
		System.out.print("\n\nDeseja iniciar a compra S/N? ");
		op = scan.next().toUpperCase().charAt(0);

		while (op != 'S' && op != 'N') {
			System.out.println("Opção inválida tente novamente!!!");
			System.out.print("Deseja iniciar a compra S/N? ");
			op = scan.next().toUpperCase().charAt(0);
		}
		limpa();

		do {

			if (op == 'N') {
				break;
			}

			while (op == 'S') {

				System.out.print("CÓD.\t\tPRODUTO \t\t\t\t\t    PREÇO \tESTOQUE");
				System.out.println(
						"\n*--------------------------------------------------------------------------------------------*");
				for (Produto product : produto) {
					System.out.printf("%-6s |%-57s |R$%-7.2f |%5d \n", product.getCodigo(), product.getNome(),
							product.getValor(), product.getEstoque());

				}

				// CARRINHO
				if (!carrinho.isEmpty()) {
					System.out.print(
							"*--------------------------------------------------------------------------------------------*");
					System.out.print("\n\nCarrinho de Compras\n");
					System.out.print("CÓD.\t\tPRODUTO \t\t\t\t\t    PREÇO \tESTOQUE");
					System.out.print(
							"\n*--------------------------------------------------------------------------------------------*");

				} else {
					System.out.print(
							"\n*--------------------------------------------------------------------------------------------*");
					System.out.println("\nSeu carrinho está vazio... :(");
				}

				System.out.print(
						"\n\n*--------------------------------------------------------------------------------------------*");
				System.out.print("\nOBS: Para alteração de quantidade, inserir novamente o código.");
				System.out.print("\nDigite o codigo do produto que você deseja: ");
				codCarrinho = scan.next().toUpperCase();
				System.out.println(codCarrinho);

				validacao = "INVALIDO";
				// Validação do código do cliente.
				while (validacao == "INVALIDO") {
					for (int x = 0; x < 10; x++) {
						if (codCarrinho.equals(produto.get(x).getCodigo())) {
							carrinho.add(x, produto.get(x));
							validacao = "VALIDO"; // VÁLIDO

							// Validação da quantidade se é na quantidade do nosso estoque.
							System.out.print("\nQuantidade: ");
							quantidadeDig = scan.nextInt();
							scan.nextLine();

							if (produto.get(x).getEstoque() >= quantidadeDig) {
								
							}

						}
					}
					if (validacao == "INVALIDO") {
						System.out.print("Código inválido!!");
						System.out.print("\nDigite o codigo do produto que você deseja: ");
						codCarrinho = scan.next().toUpperCase();
						System.out.println("passei aqui 2");
					}
				}

				System.out.print("\nContinua a compra S/N: ");
				op = scan.next().toUpperCase().charAt(0);

				while (op != 'S' && op != 'N') {
					System.out.print("Opção inválida. Tente novamente!!");
					System.out.println("\nContinua a compra S/N: ");
					op = scan.next().toUpperCase().charAt(0);
				}

			}

			System.out.print("DESEJA FAZER UMA NOVA COMPRA [S/N]? ");
			opNovaCompra = scan.next().toUpperCase().charAt(0);

		} while (opNovaCompra == 'S');

	}

}
