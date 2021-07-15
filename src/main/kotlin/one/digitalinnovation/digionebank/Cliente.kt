package one.digitalinnovation.digionebank

class Cliente(nome: String,
              cpf: String,
              val clienteTipo: ClienteTipo,
              val senha: String,
): Pessoa(nome, cpf) {

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo: $clienteTipo
    """.trimIndent()
}