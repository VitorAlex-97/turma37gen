/*
			EXERCÍCIO 8
Construa um sistema para ler uma variável numérica N e 
imprimi-la somente se a mesma for maior que 100, 
caso contrário imprimi-la com o valor zero.

*/

programa
{
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um número: ")
		leia(numero)

		se (numero > 100) {
			escreva("Você digitou ", numero, ", seu número é maior que 100!")
		} senao {
			numero = 0
			escreva("Seu número é menor ou igual 100, então agora ele vale ", numero)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */