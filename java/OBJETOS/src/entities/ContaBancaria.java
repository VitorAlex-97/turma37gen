package entities;

public class ContaBancaria {
	
	//ATRIBUTOS
	private String titular;
	private String cpf;
	private int numeroConta;
	private int agencia;
	private double saldo;
	
	//CONSTRUTOR
	public ContaBancaria (String titular, int numeroConta, int agencia, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	//MÉTODOS
	public void depositar(double valor) {
		saldo += valor;
		
		System.out.printf("\nVOCÊ DEPOISITOU R$%.2f \n", valor);
		System.out.printf("SEU SALDO AGORA É DE R$%.2f", saldo);
	}
	
	public void sacar(double valor) {
		saldo -= valor; 
		
		System.out.printf("\nVOCÊ SACOU R$%.2f \n", valor);
		System.out.printf("SEU SALDO AGORA É DE R$%.2f", saldo);
	}

	
	//ENCAPSULAMENTO		
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
