package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Analista
import  one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncional
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal
import java.math.BigDecimal.*

fun main(){

    val joao = Analista( "Victor Rici", "123456789" , 2000.0)
    ImprimeRelatorioFuncional.imprime(joao)


    }
    fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())

