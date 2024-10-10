package mutableCollections

import Employee

fun main(){

    val peter = Employee("Peter", 5680.0, "W-2")
    val adam = Employee("Adam", 2500.0, "1099")
    val lois = Employee("Lois", 3750.0,"W-2")

    println("===== List =====")

    val employees1 = mutableListOf(peter, adam)
    employees1.forEach{ println(it) }

    println("----- Add -----")
    employees1.add(lois)
    employees1.forEach{ println(it) }

    println("----- Remove -----")
    employees1.remove(peter)
    employees1.forEach{ println(it) }

    println("===== Set =====")

    val employees2 = mutableSetOf(lois)
    employees2.forEach{ println(it) }

    println("----- Add -----")
    employees2.add(peter)
    employees2.add(adam)
    employees2.forEach{ println(it) }

    println("----- Remove -----")
    employees2.remove(lois)
    employees2.forEach{ println(it) }

}