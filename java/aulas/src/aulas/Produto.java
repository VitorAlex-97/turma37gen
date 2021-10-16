package aulas;

public class Produto {

	private String codigo;
	private String nome;
	private double valor;
	private int estoque = 10;
	
	
	//CONSTRUTOR
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}


	//ENCAPSULAMENTO
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	
	
	//MÉTODOS
	public void retirarPeca(int quantidade){
		this.estoque -= quantidade;
	}
	

	
	
	
}
