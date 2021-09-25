/*
				EXERCÍCIO 2
	Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.

*/

programa
{
	const inteiro HORASNORMAISDETRAB = 50
	const real VALORNORMALHORA = 10.00
	const real VALOREXCEDENTEHORA = 20.00
	
	funcao inicio()
	{
		cadeia C
		inteiro E=0, numeroHorasTrab=0
		real salarioTotal=0, salarioExcedente=0, salario
		
		escreva("Informe o Código do funcionário: ")
		leia(C)

		escreva("Informe o número de horas trabalhada: ")
		leia(numeroHorasTrab)
		escreva("-----------------------------------------\n")

		se ( numeroHorasTrab > HORASNORMAISDETRAB) {
			E = numeroHorasTrab - HORASNORMAISDETRAB
			salario = HORASNORMAISDETRAB * VALORNORMALHORA
			salarioExcedente = E * VALOREXCEDENTEHORA
			salarioTotal = salario + salarioExcedente
		} senao {
			salario = numeroHorasTrab * VALORNORMALHORA
			salarioTotal = salario
			salarioExcedente = 0
		}

		escreva("Salário total: R$", salarioTotal, "\nSendo R$", salarioExcedente," de excedente")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */