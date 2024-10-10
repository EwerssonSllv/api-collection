package collections

fun main(){
    val salaries = doubleArrayOf(5500.0, 2400.0, 3500.0)

    salaries.forEach { println(it) }

    println("----- Max, Min and Average -----")
    println("Higher salary: ${salaries.maxOrNull()}")
    println("Lower salary: ${salaries.minOrNull()}")
    println("Median salary: ${salaries.average()}")

    println("----- Filter -----")
    val salaryLessThan5000 = salaries.filter { it < 5000  }
    salaryLessThan5000.forEach{ println(it) }

    println("----- Count -----")
    println(salaries.count {it in 2000.0..3700.00 })

    println("----- Find -----")
    println(salaries.find { it == 3500.0 })

    println("----- Any -----")
    println(salaries.any { it == 3500.0})
    println(salaries.any { it == 500.0})

}