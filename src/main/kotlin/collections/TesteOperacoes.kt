package collections

fun main() {
    val salarios = doubleArrayOf(1000.00, 2250.00, 4080.00)

    for (salario in salarios){
        println(salario)
    }
    println("..........................")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média dos salários: ${salarios.average()}")
    println("..........................")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.00 }

    salarioMaiorQue2500.forEach { println(it) }

    println("..........................")
    println(salarios.count{ it in 2000.00 .. 5000.00 }) // contar os elemetos dentro de um 'range (..)'

    println("..........................")
    println(salarios.find { it == 2250.00 }) // encontrar um valor em um array
    println(salarios.find { it == 500.00 })

    println("..........................")
    println(salarios.any { it == 1000.00 }) // retorno booleano
    println(salarios.any { it == 500.00 })
}