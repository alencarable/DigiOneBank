package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import java.math.BigDecimal

fun main() {

    val carvalho = Gerente("Aldo Carvalho", "934.191.003-72", 5800.0)
    ImprimeRelatorioFuncionario.imprime(carvalho)
}

