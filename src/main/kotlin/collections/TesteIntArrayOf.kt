package collections

fun main(){
    val values = intArrayOf(2,3,4,1,10,7) //Array de capacidade flexível

    values.forEach{
        println(it)
    }

    println("nova sequência")

    values.sort()

    values.forEach{
        println(it)
    }
}