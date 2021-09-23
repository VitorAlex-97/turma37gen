/*
				ATIVIDADE 1
Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.


*/

programa {
	
	funcao inicio() {
	
		inteiro diaIdade, mesIdade, anoIdade, transformDia
			
		escreva("Informe sua idade da forma pedida abaixo: ")
				
		escreva("\nDias: ")
		leia(diaIdade)		

		escreva("\nMeses: ")
		leia(mesIdade)

		escreva("\nAnos: ")
		leia(anoIdade)

		transformDia = diaIdade + mesIdade*30 + anoIdade*365

		escreva("\nVocê tem, atualmente, ", transformDia, " dias de vida.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 133; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */