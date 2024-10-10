package collections

fun main(){
    val salaries = DoubleArray(3)

    salaries[0] = 2700.0
    salaries[1] = 1350.0
    salaries[2] = 1230.0

    salaries.forEach { println(it) }

    println("----- Sorted -----")
    salaries.sort()
    salaries.forEach { println(it) }


    println("----- Index for increase -----")
    salaries.forEachIndexed { index, salary ->
        salaries[index] = salary * 2
    }
    salaries.forEach { println(it) }

    // doubleArrayOf

    println("----------")
    val salaries2 = doubleArrayOf(4600.0, 3750.0, 2850.0)
    salaries2.forEach { println(it) }

    println("----- Sorted -----")
    salaries2.sort()
    salaries2.forEach { println(it) }

    println("----- Index for increase -----")
    salaries2.forEachIndexed { index, salary ->
        salaries2[index] = salary * 2
    }
    salaries2.forEach { println(it) }

}