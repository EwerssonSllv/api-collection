package collections

import Employee

fun main(){

    val peter = Employee("Peter", 5680.0, "W-2")
    val adam = Employee("Adam", 2500.0, "1099")
    val lois = Employee("Lois", 3750.0, "W-2")

    val employees = listOf(peter, adam, lois)
    employees.forEach{ println(it) }

    println("----- Find -----")
    println(employees.find { it.name == "Peter" })

    println("----- sortedBy -----")
    employees
        .sortedBy { it.salary }
        .forEach { println( it ) }

    println("----- groupBy -----")
    employees
        .groupBy { it.contractType }
        .forEach { println(it) }


}