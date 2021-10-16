package entities;

public class Terceiro extends Funcionario {

	private double adicional;

	
	
	// CONSTRUTOR
	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	
	//ENCAPSULAMENTO
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	// MÉTODOS	
	@Override
	public double calculoSalario() {
		return (getValorHora() * getHorasTrabalhadas()) + this.adicional;
	}

}
