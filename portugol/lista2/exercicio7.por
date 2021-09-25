/*
			EXERCÍCIO 7
Receber valores de base e altura de um triângulo e verificar 
se são valores válidos (positivos maiores que zero). 
Em caso afirmativo, calcular a área do triângulo.

*/
programa
{
	
	funcao inicio()
	{
		real baseTriangulo=0.0, alturaTriangulo=0.0, areaTriangulo =0.0
		
		escreva("INFORMAÇÕES SOBRE O TRIÂNGULO (em metros)\n")
		escreva("Base: ")
		leia(baseTriangulo)

		escreva("Altura: ")
		leia(alturaTriangulo)
		escreva("-----------------------------------------\n")

		se ((baseTriangulo < 0) ou (alturaTriangulo < 0)) {
			escreva("OPERAÇÃO INVÁLIDA: Você informou número(s) negativo(s).")
		} senao {
			areaTriangulo = (baseTriangulo*alturaTriangulo)/2
			escreva("A área do triângulo vale: ", areaTriangulo,"m")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 187; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */