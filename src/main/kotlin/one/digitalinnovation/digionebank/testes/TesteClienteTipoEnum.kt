package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main () {

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    /* Ou */

    val pf = ClienteTipo.PF
    println("$pf - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("$pj - ${pj.descricao}")
}