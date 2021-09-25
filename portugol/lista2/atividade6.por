/*
					EXERCÍCIO 6
Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

*/

programa
{
	
	funcao inicio()
	{
		inteiro idadeUsuario
		
		escreva("Informe a idade: ")
		leia(idadeUsuario)
		escreva("-----------------------------------------\n")

		se (idadeUsuario < 5) {
			escreva("Não há, no momento, categoria para esta idade.") 
		} senao se (idadeUsuario >= 5 e idadeUsuario <= 7) {
			escreva("Idade compatível com a categoria Infantil A")
		} senao se (idadeUsuario >= 8 e idadeUsuario <= 11) {
			escreva("Idade compatível com a categoria Infantil B")
		} senao se (idadeUsuario >= 12 e idadeUsuario <= 13) {
			escreva("Idade compatível com a categoria Juvenil A")
		} senao se (idadeUsuario >= 14 e idadeUsuario <= 17) {
			escreva("Idade compatível com a categoria Juvenil B")
		} senao {
			escreva("Idade compatível com a categoria Adulto")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */