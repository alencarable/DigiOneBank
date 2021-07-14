package one.digitalinnovation.digionebank

class Pessoa {

    var nome:String = "Pedro"
    var cpf:String = "657.939.021-78"

    private set /*Deixando somente o get possível, não dará para alterar fora da classe*/
}

fun main() {

    val pedro = Pessoa()
    println(pedro.nome)
    println(pedro.cpf)

}