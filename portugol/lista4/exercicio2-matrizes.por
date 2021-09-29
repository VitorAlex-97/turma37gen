/*
				ATIVIDADE 1 (MATRIZES)
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:

a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;

b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
*/


programa
{	const inteiro LINHA = 4
	const inteiro COLUNA = 6
	inteiro N1[LINHA][COLUNA], N2[LINHA][COLUNA]
	inteiro M1[LINHA][COLUNA], M2[LINHA][COLUNA]
	
	funcao inicio()
	{

		//PREENCHENDO A MATRIZ N1
		escreva("LENDO MATRIZ N1\n")
		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva("Digite o elemento [linha"+(i+1)+", coluna"+(j+1)+"]: ")
				leia(N1[i][j])
			}
		}
		limpa()

		//PREENCHENDO A MATRIZ N2
		escreva("LENDO MATRIZ N2\n")
		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva("Digite o elemento [linha"+(i+1)+", coluna"+(j+1)+"]: ")
				leia(N2[i][j])
			}
		}
		limpa()

		//SOMANDO AS MATRIZES N1 E N2, E ARMAZENDO EM M1
		escreva("IMPRIMINDO M1 (soma) \n")
		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				M1[i][j] = N1[i][j] + N2[i][j]
				escreva(N1[i][j], " + ", N2[i][j], " = ", M1[i][j], "\n")
			}
		}

		escreva("------------------------------\n")
		
		escreva("IMPRIMINDO M2 (subtração) \n")
		//SUBTRAINDO N2 DE N1, E ARMAZENDO EM M2
		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				M2[i][j] = N1[i][j] - N2[i][j]
				escreva(N1[i][j], " - ", N2[i][j], " = ", M2[i][j], "\n")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */