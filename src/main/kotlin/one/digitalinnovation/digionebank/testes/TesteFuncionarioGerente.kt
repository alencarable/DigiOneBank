package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val carvalho = Gerente("Aldo Carvalho", "934.191.003-72", 5800.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(carvalho)
    TesteAutenticacao().autentica(carvalho)

}

