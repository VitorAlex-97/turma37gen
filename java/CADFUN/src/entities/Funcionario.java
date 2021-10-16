package entities;

public class Funcionario {

	private String matricula;
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	
	
	//CONSTRUTOR
	public Funcionario(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	//ENCAPSULAMENTO
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	//MÉTODOS
	public double calculoSalario() {
		
		return this.valorHora * this.horasTrabalhadas;
	}
	
	
	
	
	
	
}
