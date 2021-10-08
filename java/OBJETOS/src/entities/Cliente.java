package entities;

public class Cliente {

	public String nomeCompleto;
	public String cpf;
	public String telefone;
	public int idade;
	
	
	
	public void showClientData(String nome, String cpf, String telefone, int idade) {
		System.out.println("Nome do cliente: "+nome);
		System.out.println("Seu cpf: "+cpf);
		System.out.println("Telefone: "+telefone);
		System.out.println("Sua idade: "+idade);
	}
	
}


