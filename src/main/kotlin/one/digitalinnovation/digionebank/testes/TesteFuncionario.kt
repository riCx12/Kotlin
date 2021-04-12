package one.digitalinnovation.digionebank.testes
import  one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal
import java.math.BigDecimal.*

fun main(){
    val victor = Pessoa(nome = "Victor Rici", cpf ="123456789")
    println(victor.nome)
    println(victor.cpf)

    val joao = Funcionario( "Victor Rici", "123456789" , BigDecimal.valueOf( 2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}