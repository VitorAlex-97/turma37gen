programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{

		real x1, x2, y1, y2, distancia, auX, auY
		
		escreva("Insira x1: ")
		leia(x1)

		escreva("Insira y1: ")
		leia(y1)

		escreva("Insira x2: ")
		leia(x2)

		escreva("Insira y2: ")
		leia(y2)

		auX = math.potencia((x2-x1), 2)
		auY = math.potencia((y2-y1), 2)

		distancia = math.raiz((auX + auY), 2)

		distancia = math.arredondar(distancia, 2)

		escreva("A distância entre o ponto P1("+x1+","+y1+") e P2("+x2+","+y2+") é: "+distancia)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */