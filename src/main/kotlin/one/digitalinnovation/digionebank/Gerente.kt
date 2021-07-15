package one.digitalinnovation.digionebank

class Gerente(nome: String,
              cpf: String,
              salario: Double,
              var senha: String,)
    : Funcionario(nome, cpf, salario), Logavel {

    override fun calculoAuxilio(): Double = (salario * 0.4)

    override fun login(): Boolean = "senha123" == senha

}