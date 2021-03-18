package collections

fun main(){
    val values = IntArray( 5 ) //deve-se declarar o tamanho do array, digitar somente o número do tamanho
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for(valor in values){
        println(valor) //comando para imprimir os dados na tela
    }
    println("próxima sequência")
//a expressão abaixo invoca uma expressão lambda 'for', o 'it' será a referência para iteração
    values.forEach{
        println(it)
    }
    println("próxima sequência")
//outra maneira de usar a expressão lambda forEach, declarando uma variável para iteração, o 'it' será descartado
    values.forEach{ valor ->
        println(valor)
    }
    println("próxima sequência")
//iteração sobre os índices
    for (index in values.indices){
        println(values[index])
    }
    println("próxima sequência")

    values.sort() //ordenação em ordem crescente
    for(valor in values){
        println(valor)
    }
}