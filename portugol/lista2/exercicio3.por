/*
		EXERCÍCIO 3
Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

*/

programa
{
	
	funcao inicio()
	{
		real numero1, numero2, numero3, numero4
		
		escreva("Digite o 1º número: ")
		leia(numero1)

		escreva("Digite o 2º número: ")
		leia(numero2)

		escreva("Digite o 3º número: ")
		leia(numero3)

		escreva("Digite o 4º número: ")
		leia(numero4)
		escreva("-----------------------------------------\n")

		//quadrados dos números informados
		numero1 = numero1*numero1
		numero2 = numero2*numero2
		numero3 = numero3*numero3
		numero4 = numero4*numero4
		//--------------------------------

		se (numero3 >= 1000){
			escreva("Quadrado do 3º número: ", numero3)
		} senao {
			escreva("Os quadrados dos números digitados são, respectivamente: ")
			escreva("\n  Quadrado do 1º número: ", numero1)
			escreva("\n  Quadrado do 2º número: ", numero2)
			escreva("\n  Quadrado do 3º número: ", numero3)
			escreva("\n  Quadrado do 4º número: ", numero4)
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 873; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */