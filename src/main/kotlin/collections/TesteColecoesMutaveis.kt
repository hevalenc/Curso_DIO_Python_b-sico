package collections

fun main() {
    val joao = funcionario("João", 2000.00, "CLT")
    val pedro = funcionario("Pedro", 1500.00, "PJ")
    val maria = funcionario("Maria", 4000.00, "CLT")

    val funcionarios = mutableListOf(joao, maria)

    funcionarios.forEach{ println(it) }

    println("..........................")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("..........................")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    val funcionariosSet = mutableSetOf(joao)

    println("..........................")
    funcionariosSet.forEach{ println(it) }

    println("..........................")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{ println(it) }
}