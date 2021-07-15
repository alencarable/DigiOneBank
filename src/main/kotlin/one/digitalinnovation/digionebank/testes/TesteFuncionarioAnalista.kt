package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val joao = Analista("João Pedro", "398.091.113-21", 2500.0)

    /* - Vai ser substituido pela função
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
     */

    ImprimeRelatorioFuncionario.imprime(joao)
}