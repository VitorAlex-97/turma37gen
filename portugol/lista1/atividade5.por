/*
					ATIVIDADE 5
	Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
*/

programa
{
	
	funcao inicio()
	{
		real primeiraNota, segundaNota, terceiraNota, mediaAlune
	
		escreva("Insira a 1º nota: ")
		leia(primeiraNota)

		escreva("Insira a 1º nota: ")
		leia(segundaNota)

		escreva("Insira a 1º nota: ")
		leia(terceiraNota)

		mediaAlune = (primeiraNota*2 + segundaNota*3 + terceiraNota*5)/10

		escreva("Sua média (ponderada) é: ", mediaAlune)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */