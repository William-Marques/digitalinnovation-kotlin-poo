package one.digitalinnovation.digionebank

class Banco(
    val nome: String,
    val numero: Int
){
    fun info() = "$nome - $numero"
}