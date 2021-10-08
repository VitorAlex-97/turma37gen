package entities;

public class Aviao {
	// atributos
	private String codigo;
	private int qtdePassageiro;
	private double comprimento;
	private String companhia;
	private double velocidade;
	private boolean status; //EM.USO / GARAGEM
	/////////////////////////////////////////
	
	
	
	//CONSTRUTOR
	public Aviao (String codigo,int qtdePassageiro, String companhia){
		
		this.codigo=codigo;
		this.qtdePassageiro=qtdePassageiro;
		this.companhia=companhia;
	}
	//////////////////////////////////////////
	
	
	//MÉTODOS
	public void decolar () {
		System.out.printf("\nSEGUREM-SE, VAMOS DECOLAR!!");
	}
	public void aterrissar() {
		System.out.println("\nPREPAREM-SE PARA O POUSO!!");
	}
	public void prepararParaUsar() {
		System.out.println("\nPreparando para uso...");
	}
	public void disponivel() {
		System.out.println("\nAVIÃO DISPONÍVEL PARA USO!!");
	}
	///////////////////////////////////////////
	
	
    //ENCAPSULAMENTO
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQtdePassageiro() {
		return qtdePassageiro;
	}

	public void setQtdePassageiro(int qtdePassageiro) {
		this.qtdePassageiro = qtdePassageiro;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	///////////////////////////////////////////
	
	

}