package entities;

import java.util.HashMap;
import java.util.Scanner;

public class Produto {

	private String nome;
	private double preco;
	private int estoque;
	
	
	//CONSTRUTOR
	public Produto(String nome, double preco) {
		this.preco = preco;
		this.nome = nome;
	}
	
	
	
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	//MÉTODOS
	

	
	
	
}
