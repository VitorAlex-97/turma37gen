package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class TesteFormat {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);	
		List<Produto> produto = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();
		
		String nomeProduto[] = {"Camiseta Unissex Duff:Os Simpsons", "Camiseta Unissex The Game Master",
				"Camiseta Unissex Superman", "Camiseta Unissex Fortnite","Camiseta Unissex Sonserina: HARRY POTTER",
				"Chaveiro Funko Pocket POP R2-D2:STAR WARS ","Chaveiro Funko Pocket POP Home de ferro:VINGADORES",
				"Caneca Trono de ferro: GAME OF THRONES","Almofada Geek Mulher maravilha:DC COMICS", 
				"Almofada Geek Escudo Hylian: THE LEGEND OF ZELDA"};
		
		for (Produto nome : produto) {
			System.out.println((nome.getCodigo() +" - \t "+ nome.getNome() + "........R$ "+nome.getValor() + " ........ESTOQUE: "+nome.getEstoque()));
			System.out.println();
		}

	}

}
