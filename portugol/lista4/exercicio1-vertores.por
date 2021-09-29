/*
				ATIVIDADE 1 (VETORES)
Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

*/

programa
{
	
	funcao inicio()
	{
		real notas[5]
		real maiorNota = 0.00

		 para (inteiro i=0; i<5; i++) {
		 	notas[i] = 0.0
		 	escreva("Atividade ",i+1, " : ")
		 	leia(notas[i])

		 	se (notas[i] >= maiorNota) {
		 		maiorNota = notas[i]
		 	}
		 }

		 escreva("\nA maior pontuação foi ", maiorNota)
		  
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */