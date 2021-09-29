programa
{
	
	funcao inicio()
	{

		cadeia nome
		real notas[4], somaNotas=0.0, media=0.0

		escreva("Digite o nome: ")
		leia(nome)

		para (inteiro i=0; i<4; i++) {
			escreva("Digite a nota", i+1, " : ")
			leia(notas[i])
			somaNotas = somaNotas + notas[i]
		}
		media = somaNotas/4
		pula()
		escreva("------ BOLETIN -------")
		pula()

		para (inteiro i=0; i<4; i++) {
			escreva("Nota",i+1, ": ", notas[i])
			pula()
		}
		escreveLinha()

		pula()
		escreva("Média das notas: ", media)
		escreva("\nSoma das 4 notas: ", somaNotas)
		pula()
		pula()
		se (media<7) {
			escreva("INFELIZMENTE, VOCÊ FOI REPROVADO!")
		} senao {
			escreva("PARABÉENS!! VOCÊ FOI APROVADO!")
		}
		
	}

	funcao pula (){
		 escreva("\n")
	}

	funcao escreveLinha() {
		escreva("----------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 689; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */