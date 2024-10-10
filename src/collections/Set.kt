package collections

import Employee

fun main(){
    val peter = Employee("Peter", 5680.0, "W-2")
    val adam = Employee("Adam", 2500.0, "1099")
    val lois = Employee("Lois", 3750.0, "W-2")

    val employees1 = setOf(peter, adam)
    val employees2 = setOf(lois)
    val employees3 = setOf(peter, lois, adam)

    println("----- setOf Union -----")

    val resultUnion = employees1.union(employees2)
    resultUnion.forEach{ println(it) }

    println("----- setOf Subtract -----")

    println("----- Before -----")
    employees3.forEach { println(it) }

    println("----- After -----")
    val resultSub = employees3.subtract(employees2)
    resultSub.forEach { println(it) }

    println("----- setOf Intersect -----")

    val resultInter = employees3.intersect(employees2)
    resultInter.forEach { println(it) }

}