/*
		ATIVIDADE 7
Um sistema de equações lineares
*/

programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{

		real a, b, c, d, E, f
		real x, y
	
		escreva("Sendo o sistema de equações da segunte forma: \n")
		escreva(" *Equacão 1: aX + bY = c \n")
		escreva(" *Equacão 2: dX + eY = f \n")
		escreva("---------------------------\n")

		escreva("valor de a: ")
		leia(a)

		escreva("valor de b: ")
		leia(b)

		escreva("valor de c: ")
		leia(c)

		escreva("valor de d: ")
		leia(d)

		escreva("valor de e: ")
		leia(E)

		escreva("valor de f: ")
		leia(f)

		x = (c*E - b*f)/(a*E - b*d)
		x = math.arredondar(x, 2)
		
		y = (a*f - c*d)/(a*E - b*d)
		y = math.arredondar(y, 2)

		escreva("---------------------------\n")
		escreva("Solução: X = ", x, " e Y = ", y)
		
		
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 52; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */