programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real A, B, C, R, S, D
	
		escreva("Digite o valor de A: ")
		leia(A)
		
		escreva("Digite o valor de B: ")
		leia(B)
		
		escreva("Digite o valor de C: ")
		leia(C)

		R = math.potencia((A+B), 2.0)
		S = math.potencia((B+C), 2.0)
		D = (R+S)/2

		escreva("Valor das operções são: "+"R = "+R+" S = "+S+" e D = "+D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */