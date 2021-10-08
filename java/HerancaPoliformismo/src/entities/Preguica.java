package entities;

public class Preguica extends Animal {

	private String especie;


	
	//CONSTRUTOR
	public Preguica(String nome, int idade, String especie) {
		super(nome, idade);
		this.especie = especie;
	}

	
	//ENCAPSULAMENTO
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	

	
	
	//MÉTODOS
	public void subirEmArvore() {
		System.out.println("Subindo na arvore...");
	}
	
	public void correrPreguica() {
		System.out.println("Correndo beeeemmm devagar...");
	}
	
	
	
	
	
}
