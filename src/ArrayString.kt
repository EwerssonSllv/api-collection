fun main(){

    // Array

    val names = Array(3){""}
    names[0] = "Peter"
    names[1] = "Noah"
    names[2] = "Harvey"

    names.forEach { println(it) }

    println("----- Sorted -----")
    names.sort()
    names.forEach { println(it) }

    // arrayOf

    println("----------")
    val names2 = arrayOf("Karen", "Lois", "Adam")
    names2.forEach { println(it) }

    println("----- Sorted -----")
    names2.sort()
    names2.forEach { println(it) }

}