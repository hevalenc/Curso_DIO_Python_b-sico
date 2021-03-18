package collections

data class funcionario (
    val nome : String,
    val salario: Double,
    val tipoContrato: String
) {
    override fun toString(): String =
        """
            Nome:     $nome
            Salário:  $salario
        """.trimIndent()
}