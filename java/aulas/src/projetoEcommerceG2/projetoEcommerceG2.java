package projetoEcommerceG2;

import java.util.Locale;
import java.util.Scanner;

public class projetoEcommerceG2 {
	
	
	public static void limpa() {
		
		for(int x=0; x<50; x++) {
			System.out.println();
		}
		
	}
	
	public static void cabecalho() {

		String nomeLoja="▂▃▄▅▆▇█▓▒░G2 GEEK░▒▓█▇▆▅▄▃▂";
		String slogan="♥ Dê START no seu estilo ♥";
		System.out.println();
		System.out.println(nomeLoja);
		System.out.print("\n"+slogan+"\n");
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		char opNovaCompra = 'S';
		
		String codigoProduto[]={"GK01","GK02","GK03","GK04","GK05","GK06","GK07","GK08","GK09","GK10"};
		String nomeProduto[]={"Camiseta Unissex Duff:Os Simpsons		  ","Camiseta Unissex The Game Master		  "
		,"Camiseta Unissex Superman			  ","Camiseta Unissex Fortnite                         ","Camiseta Unissex Sonserina: HARRY POTTER          "
		,"Chaveiro Funko Pocket POP R2-D2:STAR WARS         ","Chaveiro Funko Pocket POP Home de ferro:VINGADORES"
		,"Caneca	Trono de ferro: GAME OF THRONES	 	  ","Almofada Geek Mulher maravilha:DC COMICS	  ","Almofada Geek Escudo Hylian: THE LEGEND OF ZELDA  "
		};
		double valor[] = {11.65,13.95,14.95,15.92,29.90,36.90,44.75,59.90,59.90,59.90};
		
		double valorTotal=0.0,totalPagamento=0.00;
		int estoque[]={10,10,10,10,10,10,10,10,10,10},quantidadeDig=0;
		int quantidadeDigAux[]={0,0,0,0,0,0,0,0,0,0};
		int lugarQuant=0;
		int quantidadeFinal[]={0,0,0,0,0,0,0,0,0,0};
		int opPagamento=0;
		int produtosNoCarrinho=0;
		char op= 'S';
		String codCarrinho = " "; 
		String carrinho[]= new String[10];
		String validacao  = "INVALIDO";
		boolean carrinhoVazio = false;
		
		
		cabecalho();
		System.out.print("\n\nDeseja iniciar a compra S/N? " );
		op = leia.next().toUpperCase().charAt(0);
		
		while(op!='S' && op!='N'){
			System.out.println("Opção inválida tente novamente!!!");
			System.out.print("Deseja iniciar a compra S/N? " );
			op = leia.next().toUpperCase().charAt(0);
		}
		
		
		limpa();
		
		do {
			
			if (op == 'N') {
				break;
			}
			
			while (op == 'S') {
				cabecalho();
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.printf("\nCódigo","\t|","Nome do Produto","\t\t\t\t\t|","Valor(R$)","\t|","Estoque\n");
				System.out.println("----------------------------------------------------------------------------------------");
				
				for (int x=0; x<10;x++) {
					System.out.print("\n"+codigoProduto[x]+"\t|"+nomeProduto[x]+"\t|"+valor[x]+"\t\t|"+estoque[x]);
				}
				System.out.print("\n*--------------------------------------------------------------------------------------------*");
				System.out.print("\nCarrinho de Compras\n");	
				System.out.print("\nCódigo"+"\t|"+"Nome do Produto"+"\t\t\t\t\t|"+"Valor(R$)"+"|"+"Estoque"+"|Quantidade\n");
				System.out.print("\n*--------------------------------------------------------------------------------------------*");
				
				
				//CARRINHO
				for (int x=0; x<10; x++){
					if (quantidadeFinal[x]>0){
						System.out.print("\n"+codigoProduto[x]+"\t|"+nomeProduto[x]+"\t|"+valor[x]+"\t   |"+estoque[x]+"\t"+"    |"+quantidadeFinal[x]+"\n");
					}
				}
				
				System.out.print("\n\n*--------------------------------------------------------------------------------------------*");
				System.out.print("\nOBS: Para alteração de quantidade, inserir novamente o código.");
				System.out.print("\nDigite o codigo do produto que você deseja: "); 
				codCarrinho = leia.next().toUpperCase();
				System.out.println(codCarrinho);
				
				validacao = "INVALIDO";
				//Validação do código do cliente.
				while (validacao == "INVALIDO") {
					for (int x=0; x<10; x++){
						if (codCarrinho.equals(codigoProduto[x])){					
							carrinho[x]=codCarrinho;
							validacao = "VALIDO"; //VÁLIDO							
						}					
					}				
					if (validacao == "INVALIDO"){
						System.out.print("Código inválido!!");
						System.out.print("\nDigite o codigo do produto que você deseja: ");
						codCarrinho = leia.next().toUpperCase();
					}					
				}
				
				//Validação da quantidade se é na quantidade do nosso estoque.
				System.out.print("\nQuantidade: ");
				quantidadeDig = leia.nextInt();
				for (int x=0; x<10; x++){
					if (codCarrinho.equals(codigoProduto[x])) {
						quantidadeDigAux[x] = quantidadeDig;
					}
				}
				
				validacao = "INVALIDO"; 
				while(validacao == "INVALIDO") {
					for (int x = 0; x<10;x++){
						if (codCarrinho.equals(codigoProduto[x]) && quantidadeDigAux[x]>=0 && quantidadeDigAux[x]<=estoque[x]){
							quantidadeFinal[x] = quantidadeDigAux[x];
							validacao = "VALIDO"; 				
						}
					}
					
					for (int x=0; x<10; x++) {
						if (quantidadeDigAux[x]<0 || quantidadeDigAux[x]>estoque[x]) {
							if (quantidadeDigAux[x]<0) {
								System.out.print("\nValor inválido!!");
								System.out.print("\nDigite novamente a quantidade: ");
								quantidadeDigAux[x] = leia.nextInt();
							} 
							else {
								System.out.print("\nNÃO HÁ ESTA QUANTIDADE NO ESTOQUE!");
								System.out.print("\nDigite novamente a quantidade: ");
								quantidadeDigAux[x] = leia.nextInt();
							}
						}
					}	
				}
				
				System.out.print("\nContinua a compra S/N: ");
				op = leia.next().toUpperCase().charAt(0);
				
				while(op!='S' && op!='N') {
					System.out.print("Opção inválida. Tente novamente!!");
					System.out.println("\nContinua a compra S/N: ");
					op = leia.next().toUpperCase().charAt(0);
				}
				limpa();
			}
			limpa();
			
			for(int x=0; x<10; x++) {
				if(quantidadeDigAux[x]==0) {
					produtosNoCarrinho++;
				}
			}
			
			if(produtosNoCarrinho == 10) {
				carrinhoVazio = true;
				break;
			}
			
			//Subtração Estoque
			for(int x = 0; x<10;x++){
				estoque[x] = estoque[x] - quantidadeFinal[x];
			}
				
			//Calcula Valor Total Da Compra
			for(int x=0; x<10; x++){
				valorTotal=valorTotal+(quantidadeFinal[x]*valor[x]);
			}
			
			//Calcula o total a pagar com os descontos e acréscimos
			while (opPagamento<1 || opPagamento>3){
				System.out.print("\nEscolha a opção de pagamento");
				System.out.print("\n-------------------------------------------------");
				System.out.print("\n1. À vista com 10% de desconto (R$"+Math.ceil((valorTotal - (valorTotal*0.1)))+")");
				System.out.print("\n2. No cartão com acréscimo de 10% (R$"+Math.ceil((valorTotal + (valorTotal*0.1)))+")");
				System.out.print("\n3. 2x no cartão com 15% de acréscimo (2x R$"+Math.ceil((valorTotal + (valorTotal*0.15))/2)+")");
				System.out.print("\n-------------------------------------------------");
				System.out.print("\nDigite a opção de pagamento: ");
				opPagamento = leia.nextInt();
				
				if (opPagamento<1 || opPagamento>3){
					System.out.print("\nOpção inválida, tente novamente!!");
				}
				else if (opPagamento==1){
					totalPagamento = Math.ceil(valorTotal - (valorTotal*0.1));
				}
				else if (opPagamento==2){
					totalPagamento = Math.ceil(valorTotal + (valorTotal*0.1));
				}
				else if (opPagamento==3){
					totalPagamento = Math.ceil((valorTotal + (valorTotal*0.15))/2);
				}
			}
			limpa();
			
			//NOTA FISCAL
			System.out.print("\nNota Fiscal");
			System.out.print("\n-------------------------------------------------------------------------------------------------");
			cabecalho();	
			System.out.print("\nCódigo"+"\t|"+"Nome do Produto"+"\t\t\t\t\t|Valor(R$)Imposto(R$)"+"\t|"+"Quantidade");
			System.out.print("\n-------------------------------------------------------------------------------------------------");
			
			if(opPagamento==1){
				for(int x=0; x<10; x++){
					if(quantidadeFinal[x]>0){
						System.out.print("\n"+codigoProduto[x]+"\t|"+nomeProduto[x]+"\t|"+valor[x]+" ("+Math.ceil((valor[x]*0.09))+")"+"\t\t|"+quantidadeFinal[x]);
					}
				}
				System.out.print("\n-------------------------------------------------------------------------------------------------");
				System.out.print("\nOpção à vista com 10% de desconto selecionada");
				System.out.print("\nO valor total da compra foi: R$"+totalPagamento);	
				System.out.print("\nOBS: Imposto já incluso no valor do produto");
				System.out.print("\n-------------------------------------------------------------------------------------------------");		
			}
			
			if(opPagamento==2){
				for (int x=0; x<10; x++){
					if(quantidadeFinal[x]>0){
						System.out.print("\n"+codigoProduto[x]+"\t|"+nomeProduto[x]+"\t|"+valor[x]+" ("+Math.ceil((valor[x]*0.09))+")"+"\t\t|"+quantidadeFinal[x]);
					}
				}
				System.out.print("\n-------------------------------------------------------------------------------------------------");
				System.out.print("\nOpção cartão com 10 % de acréscimo selecionada");
				System.out.printf("\nO valor total da compra foi: R$%.2f",totalPagamento);
				System.out.print("\nOBS: Imposto já incluso no valor do produto");
				System.out.print("\n-------------------------------------------------------------------------------------------------");
			}
			
			if(opPagamento==3){
				for(int x=0; x<10; x++){
					if(quantidadeFinal[x]>0){
						System.out.print("\n"+codigoProduto[x]+"\t|"+nomeProduto[x]+"\t|"+valor[x]+" ("+Math.ceil((valor[x]*0.09))+")"+"\t\t|"+quantidadeFinal[x]);
					}
				}
				System.out.print("\n-------------------------------------------------------------------------------------------------");
				System.out.print("\nOpção 2x no cartão com 15 % de acréscimo selecionada");
				System.out.printf("\nO valor das parcelas foi: 2x R$%.2f",totalPagamento);
				System.out.print("\nOBS: Imposto já incluso no valor do produto");	
				System.out.print("\n-------------------------------------------------------------------------------------------------");
			}
			
			System.out.print("\n\n┌───── •✧✧• ─────┐");
			System.out.print("\n *-*-ATÉ LOGO-*-* \n");
			System.out.print("└───── •✧✧• ─────┘\n");
			System.out.println();
	
			System.out.print("DESEJA FAZER UMA NOVA COMPRA [S/N]? ");
			opNovaCompra = leia.next().toUpperCase().charAt(0);
			
			if (opNovaCompra == 'S') {
				opPagamento = 0;
				quantidadeDig = 0;
				valorTotal = 0.0;
				totalPagamento = 0.00;
				codCarrinho = " ";
				op = 'S';
				for (int x=0; x<10; x++) {
					carrinho[x] = " ";
					quantidadeFinal[x] = 0;
					quantidadeDigAux[x] = 0;
				}
				limpa();
			}
	
			
		} while(opNovaCompra == 'S');
		
		limpa();
		cabecalho();
		
		if(carrinhoVazio) {
			System.out.println("\nQUE PENA, SEU CARRINHO FICOU VAZIO :(");
		}
		
		System.out.print("\n\n┌───── •✧✧• ─────┐");
		System.out.print("\n\n");
		System.out.print(" *-*-ATÉ LOGO-*-*");
		System.out.print("\n\n");
		System.out.print("└───── •✧✧• ─────┘\n");
				
				
	}
	

}
