# Kotlin API Collections - Study Guide

This repository contains examples and explanations of various Kotlin collections, including `Array`, `DoubleArray`, `IntArray`, `List`, `Map`, `Set`, and common operations on them.

## Contents

- [Arrays](#arrays)
  - [String Array](#string-array)
  - [Int Array](#int-array)
  - [Double Array](#double-array)
- [List](#list)
- [Map](#map)
- [Set](#set)
- [Operations](#operations)

---

### Arrays

#### String Array

An array that holds string values.

```kotlin

fun main() {
    // String Array
    val stringArray = arrayOf("Kotlin", "Java", "Python")
    println("String Array: " + stringArray.joinToString())  // Output: Kotlin, Java, Python

    // Int Array
    val intArray = intArrayOf(1, 2, 3, 4)
    println("Int Array: " + intArray.joinToString())  // Output: 1, 2, 3, 4

    // Double Array
    val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)
    println("Double Array: " + doubleArray.joinToString())  // Output: 1.1, 2.2, 3.3

    // List
    val list = listOf("Kotlin", "Java", "C++")
    println("List: " + list)  // Output: [Kotlin, Java, C++]

    // Map
    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println("Map: " + map)  // Output: {1=One, 2=Two, 3=Three}

    // Set
    val set = setOf(1, 2, 3, 3)
    println("Set: " + set)  // Output: [1, 2, 3]

    // Operations - Filter even numbers
    val numbers = listOf(1, 2, 3, 4, 5)
    val evens = numbers.filter { it % 2 == 0 }
    println("Filtered (evens): " + evens)  // Output: [2, 4]

    // Operations - Double each number
    val doubled = numbers.map { it * 2 }
    println("Doubled: " + doubled)  // Output: [2, 4, 6, 8, 10]
}
