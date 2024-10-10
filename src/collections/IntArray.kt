package collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 13
    values[2] = 7
    values[3] = 3
    values[4] = 9

    println("----------")
    values.forEach {
        println(it)
    }

    println("----- Sorted -----")
    values.sort()
    values.forEach { println(it) }

}