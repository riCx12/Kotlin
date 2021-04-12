package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.TesteAutenticacao

fun main() {
    val jose = Cliente(
            nome = "Jose da Silva",
            cpf = "12345363",
            clienteTipo = ClienteTipo.PF,
            senha = "123456"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}
