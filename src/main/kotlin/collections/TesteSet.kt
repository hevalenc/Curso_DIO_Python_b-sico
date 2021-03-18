package collections

fun main() {
    val joao = funcionario("João", 2000.00, "CLT")
    val pedro = funcionario("Pedro", 1500.00, "PJ")
    val maria = funcionario("Maria", 4000.00, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2) // unir elementos entre grupos

    resultUnion.forEach{ println(it) }
    println("...................")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2) // remover elementos de um grupo usando o outro

    resultSubtract.forEach { println(it) }
    println("...................")

    val resultIntersect = funcionarios3.intersect(funcionarios2) // verificar o que há de igual entre grupos
    resultIntersect.forEach { println(it) }
}