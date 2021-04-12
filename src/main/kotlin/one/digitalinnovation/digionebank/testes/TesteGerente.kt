package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.*

fun main(){

    val maria = Gerente( "Maria do Carmo", "123456789" , 10000.0,  "senha123")
    ImprimeRelatorioFuncional.imprime(maria)
    TesteAutenticacao().autentica(maria)


}

