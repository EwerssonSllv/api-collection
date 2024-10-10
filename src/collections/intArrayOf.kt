package collections

fun main(){

    val values = intArrayOf(3, 6, 13, 9, 2, 7, 1 )

    values.forEach { println(it) }

    println("----- Sorted -----")
    values.sort()
    values.forEach { println(it) }

}