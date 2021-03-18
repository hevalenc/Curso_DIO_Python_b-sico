package collections

fun main() {
    val joao = funcionario("João", 2000.00, "CLT")
    val pedro = funcionario("Pedro", 1500.00, "PJ")
    val maria = funcionario("Maria", 4000.00, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }
    println("..........................")
    println(funcionarios.find {it.nome == "Maria"})

    println("..........................")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("..........................")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }
}
