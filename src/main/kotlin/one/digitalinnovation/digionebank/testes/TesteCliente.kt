package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    val ricardo = Cliente("Ricardo Fábrega", "488.987.004-26", ClienteTipo.PF, "838senha")

    println(ricardo)

    TesteAutenticacao().autentica(ricardo)
}
