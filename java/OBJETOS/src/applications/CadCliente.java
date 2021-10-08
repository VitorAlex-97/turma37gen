package applications;

import java.util.Locale;

import entities.Cliente;

public class CadCliente {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nomeCompleto = "Vitor Alex Sales da Costa";
		cliente1.cpf = "54621871322";
		cliente1.telefone = "8192146424";
		cliente1.idade = 24;
		
		
		cliente1.showClientData(cliente1.nomeCompleto, cliente1.cpf, cliente1.telefone, cliente1.idade);
		

	}

}
