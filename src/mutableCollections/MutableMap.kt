package mutableCollections

import Employee

fun main() {

    val peter = Employee("Peter", 5680.0, "W-2")
    val adam = Employee("Adam", 2500.0, "1099")
    val lois = Employee("Lois", 3750.0,"W-2")

    val repository = Repository<Employee>()

    repository.create(peter.name, peter)
    repository.create(adam.name, adam)
    repository.create(lois.name, lois)

    println(repository.findById(peter.name))

    println("----- Find All -----")
    repository.findAll().forEach{ (k, v) -> println("Key: $k - Value: $v")}

    println("----- Remove -----")
    repository.remove(peter.name)
    repository.findAll().forEach{ (k, v) -> println("Key: $k - Value: $v")}

}