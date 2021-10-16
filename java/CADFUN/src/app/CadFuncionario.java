package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class CadFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double salarioFuncionario1;
		double salarioTerceiro;
		
		
		Funcionario funcionario1 = new Funcionario("20999", "Vitor");	
		Terceiro funTerceiro = new Terceiro("10888", "Lucas", 30.00);
		
		funcionario1.setValorHora(20.35);
		funcionario1.setHorasTrabalhadas(180);
		salarioFuncionario1 = Math.ceil(funcionario1.calculoSalario());
		
		funTerceiro.setAdicional(350.00);
		funTerceiro.setHorasTrabalhadas(150);
		funTerceiro.setValorHora(31.30);
		salarioTerceiro = Math.ceil(funTerceiro.calculoSalario());
		
		System.out.println("Salário do Funcionário: R$"+ salarioFuncionario1);
		System.out.println("Salário do Funcionário Terceiro: R$"+ salarioTerceiro);
		
		
		
	}

}
