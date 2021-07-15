package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario(joao: Analista) {

    companion object {
        fun imprime(funcionario: Funcionario) = println(funcionario.toString())
    }
}