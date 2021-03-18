package collections

fun main() {
    val joao = funcionario("João", 2000.00, "CLT")
    val pedro = funcionario("Pedro", 1500.00, "PJ")
    val maria = funcionario("Maria", 4000.00, "CLT")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println(".................")
    repositorio.findAll().forEach { println(it) }

    println(".................")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}