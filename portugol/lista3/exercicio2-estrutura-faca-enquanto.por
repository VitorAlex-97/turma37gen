/*
					EXERCÍCIO 2 (FAÇA...ENQUNATO)
2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.

*/


programa
{
	
	funcao inicio()
	{	
		inteiro numeroDigitado = 0, somatorio = 0
		inteiro guardaNumeroDigitado = 0

		escreva("Digite um número inteiro (1, 2, 3...): ")
		leia(numeroDigitado)
		guardaNumeroDigitado = numeroDigitado
		
		faca {
			somatorio = somatorio + numeroDigitado
			numeroDigitado = numeroDigitado - 1
		} enquanto(numeroDigitado > 0)

		escreva("\nA SOMA DOS NÚMEROS DE 1 ATÉ ",guardaNumeroDigitado," é: ", somatorio)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */