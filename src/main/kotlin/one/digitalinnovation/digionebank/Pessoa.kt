package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Victor"
    var cpf: String = "123.123.123-12"

    inner class Endereco{
        var rua: String = "Rua teste"

    }
}

fun main(){
    val victor = Pessoa()

    println(victor.nome)
    println(victor.cpf)
    println(victor.Endereco().rua)


}