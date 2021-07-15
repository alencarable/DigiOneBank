package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.Logavel

class TesteAutenticacao() {

    fun autentica(logavel: Cliente) = println(logavel.login(senha))

}