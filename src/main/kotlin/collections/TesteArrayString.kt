package collections

fun main() {
    val names = Array(3){""}

    names[0] = "Maria"
    names[1] = "João"
    names[2] = "José"

    for (nome in names){
        println(nome)
    }

    println("nova sequência")

    names.sort()

    names.forEach { println(it) }

    val names2 = arrayOf ("Maria", "Zaza", "Pedro")

    names2.sort()

    println("nova sequência")

    names2.forEach { println(it) }
}