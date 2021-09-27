/*
				EXERCÍCIO 1
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.

*/

programa
{
	const real VALORSALARIOBAIXO = 100.00
	funcao inicio()
	{
		real salario = 0.00, salarioSomatorio = 0.00, maiorSalario = 0.00
		real percentualSalarioBaixo = 0.00, mediaSalario = 0.00
		real contadorReal = 0.00, mediaFilhos = 0.00
		inteiro qtdFilhos = 0, qtdFilhosSomatorio = 0, qtdSalarioBaixo = 0, contador = 0
		
		

		
		para (contador = 1; contador<=5; contador++) {
			
			escreva("DADOS PESSOA ",contador,"\n")
			escreva("Salário: ")
			leia(salario)

			salarioSomatorio = salarioSomatorio + salario

			escreva("Quantos filhos? ")
			leia(qtdFilhos)
			limpa()

			qtdFilhosSomatorio = qtdFilhosSomatorio + qtdFilhos

			se (salario > maiorSalario) {
				maiorSalario = salario
			}

			se (salario <= VALORSALARIOBAIXO) {
				qtdSalarioBaixo++
			}
			
		}

		contador = contador - 1 
		mediaSalario = (salarioSomatorio/contador)
		
		percentualSalarioBaixo = (qtdSalarioBaixo/(contador/1.00))*100.00

		mediaFilhos = (qtdFilhosSomatorio / (contador/1.00))
		
		escreva("A média de salário da população é de R$: ",mediaSalario, "\n")
		escreva("A média do número de filhos da população é: ",mediaFilhos, "\n")
		escreva("O maior salário é de R$: ",maiorSalario, "\n")
		escreva("Percentual de pessoas recebendo até R$100,00 : ",percentualSalarioBaixo, "%\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */