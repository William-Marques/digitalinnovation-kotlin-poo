package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val joao = Analista("João Pedro", "1234567899", 2000.0)
    imprimeRelatorio(joao)
}
fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())