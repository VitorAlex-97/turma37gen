/*
			EXERCÍCIO 1 (ENQUANTO...)
Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.

*/


programa
{
	
	funcao inicio()
	{
		real numeroDigitado = 0.00, mediaNumeros = 0.00, somaNumeros = 0.00
		inteiro contador = 0

		enquanto (numeroDigitado >= 0) {
			escreva(contador+1,"º Número: ")
			leia(numeroDigitado)

			se (numeroDigitado >= 0) {
				somaNumeros = somaNumeros + numeroDigitado
			}
			
			contador++
		}
		escreva("-----------------------\n")

		contador = contador - 1
		mediaNumeros = (somaNumeros / contador)

		escreva("O somatório dos números digitados é: ", somaNumeros,"\n")
		escreva("A média é: ", mediaNumeros,"\n")
		escreva("\nFORAM LIDOS ", contador + 1," NÚMEROS, SENDO O ÚLTIMO NEGATIVO (INVÁLIDO)!\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 936; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */