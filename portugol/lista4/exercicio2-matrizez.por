/*
			ATIVIDADE 2 (MATRIZES)
Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.

*/


programa
{
	
	funcao inicio()
	{
		const inteiro LINHA  = 3
		const inteiro COLUNA = 3
		inteiro matriz[LINHA][COLUNA]
		inteiro somaElementos = 0
		inteiro somaDiagonalPrincipal = 0

		
		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva("Informe o elemento [linha"+(i+1)+", coluna"+(j+1)+"]: ")
				leia(matriz[i][j])
				
				somaElementos = somaElementos + matriz[i][j]

				se (i == j) {
					somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[i][j]
				}
			}
		}
		escreva("-----------------------------\n")
		escreva("SOMA DOS ELEMENTOS: ", somaElementos)
		escreva("\nSOMA DA DIAGONAL PRINCIPAL: ", somaDiagonalPrincipal)
		escreva("\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 28; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */