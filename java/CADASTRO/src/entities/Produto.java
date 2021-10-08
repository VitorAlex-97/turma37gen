package entities;

public class Produto {

	public String codigo;
	public String nome;
	public double valor;
	public int estoque;
	
	
	public void tirarEstoque(int quantidade) {
		
		estoque -= quantidade;
		System.out.printf("Você retirou %d %s do estoque \n", quantidade, nome);
		
	}
	
	public void adicionarEstoque(int quantidade) {
		
		estoque += quantidade;
		System.out.printf("Você adicionou %d %s no estoque \n", quantidade, nome);
		
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", estoque=" + estoque + "]";
	}
	
	
	
	
}
