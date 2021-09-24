/*
					ATIVIDADE 3
	Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.

*/

programa
{
	
	funcao inicio()
	{
		inteiro duracaoEvento, qtdHoras, qtdMin, qtdSeg 
		
		escreva("Informe a duração do evento: ")
		leia(duracaoEvento)

		qtdHoras = duracaoEvento/3600

		qtdMin = (duracaoEvento%3600)/60

		qtdSeg = (duracaoEvento%3600)%60

		escreva("O evento durou cerca de "+qtdHoras+" hora(s), "+qtdMin+" minuto(s) e "+qtdSeg+" segundo(s)")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */