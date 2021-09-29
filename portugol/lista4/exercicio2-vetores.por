/*
				ATIVIDADE 2 (VETORES)
Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.

*/

programa
{
	inclua biblioteca Matematica --> math

	funcao pula() {
		escreva("\n")
	}
	
	funcao inicio()
	{	
		const real QTDLANCAMENTOS = 10.00
		inteiro lancamentoDado[10]
		inteiro maiorLancamento=0, frequenciaMaiorLancamento=0
		inteiro somadorLancamentos = 0
		real mediaLancamentos = 0.00

		para (inteiro i=0; i<QTDLANCAMENTOS; i++){
			escreva(i+1,"º LANÇAMENTO: ")
			leia(lancamentoDado[i])

			se (lancamentoDado[i] > maiorLancamento) {
				frequenciaMaiorLancamento = 0
			}
			se (lancamentoDado[i] >= maiorLancamento) {
				frequenciaMaiorLancamento++
				maiorLancamento = lancamentoDado[i]
			}

			somadorLancamentos = somadorLancamentos + lancamentoDado[i]
		}
		mediaLancamentos = math.arredondar((somadorLancamentos/QTDLANCAMENTOS), 2)
		escreva("-------------------------------")
		pula()
		escreva("A SOMA DOS ", QTDLANCAMENTOS, " LANÇAMENTOS: ", somadorLancamentos)
		pula()
		escreva("A MÉDIA DOS LANÇAMENTOS: ", mediaLancamentos)
		pula()
		escreva("MAIOR LANÇAMENTO: ", maiorLancamento)
		pula()
		escreva("FREQUÊNCIA DO MAIOR LANÇAMENTO: ", frequenciaMaiorLancamento)
		pula()
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */