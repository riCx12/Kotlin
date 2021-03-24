package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Victor"
    var cpf: String = "123.123.123-12"
    private set
    constructor()

    fun pessoaInfo() = "$nome + $cpf"

    inner class Endereco{
        var rua: String = "Rua teste"

    }
}

fun main(){
    val victor = Pessoa()

    println(victor.pessoaInfo())
    println(victor.Endereco().rua)


}