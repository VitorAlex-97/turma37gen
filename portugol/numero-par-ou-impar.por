programa
{

    funcao inicio()
    {
        inteiro numberUser

        escreva("Digite um número não negativo: ")
        leia(numberUser)

        se (numberUser == 0) {
            escreva("O ", numberUser," é um número nulo")
        }
        senao se (numberUser < 0) {
            escreva("O número ", numberUser," está incorreto. Pois é um nº negativo")
        }
        senao se (numberUser%2 == 0) {
            escreva("O ", numberUser," é um número par")
        }
        senao se (numberUser%2 == 1) {
            escreva("O ", numberUser," é um número ímpar") 
        }       

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */