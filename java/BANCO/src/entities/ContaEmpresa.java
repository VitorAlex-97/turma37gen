package entities;

public class ContaEmpresa extends Conta {

	private boolean emprestimo;
	private double tetoEmprestimo = 10000.00;

	
	//CONSTRUTOR
	public ContaEmpresa(int numero, String cpf) {
		super(numero, cpf);
		
	}

	
	//ENCAPSULAMENTO
	public boolean isEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	
	public double getTetoEmprestimo() {
		return tetoEmprestimo;
	}


	public void setTetoEmprestimo(double tetoEmprestimo) {
		this.tetoEmprestimo = tetoEmprestimo;
	}


	
	//MÉTODOS
	public void pedirEmprestimo(double emprestimoEmpresa) {
		
			if (emprestimoEmpresa <= this.tetoEmprestimo) {
				this.saldo += emprestimoEmpresa;
				this.tetoEmprestimo -= emprestimoEmpresa;
			} 
		
	}
	
	
}
