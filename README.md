# Kotlin API Collections - Study Guide

This repository provides an overview of Kotlin collections, mutable collections, and extension functions. It covers the main types and operations that are essential for working efficiently with collections in Kotlin.

## Contents

- Collections
- Mutable Collections
- Extension Functions
- Common Operations

## Collections

Kotlin offers immutable collections by default, meaning that once initialized, their content cannot be changed. Examples include `List`, `Set`, and `Map`.

```kotlin
val list = listOf("Apple", "Banana", "Orange")
val set = setOf(1, 2, 3)
val map = mapOf("key1" to "value1", "key2" to "value2")
```


## Mutable Collections 

Mutable collections allow modification after initialization. This includes mutable versions of List, Set, and Map.

```kotlin
val mutableList = mutableListOf("Dog", "Cat")
mutableList.add("Horse")

val mutableSet = mutableSetOf(4, 5, 6)
mutableSet.add(7)

val mutableMap = mutableMapOf("keyA" to "valueA")
mutableMap["keyB"] = "valueB"
```

## Extensions Functions

Extension functions in Kotlin allow us to add new functionality to existing types. They are especially useful when working with collections.

```kotlin
// Filtering a list
val numbers = listOf(1, 2, 3, 4, 5)
val evenNumbers = numbers.filter { it % 2 == 0 }  // [2, 4]

// Mapping values
val doubled = numbers.map { it * 2 }  // [2, 4, 6, 8, 10]

// Sorting
val sorted = numbers.sortedDescending()  // [5, 4, 3, 2, 1]
```

## Common Operations

Kotlin collections support a wide range of operations such as adding, removing, filtering, mapping, and sorting elements.

- add: Adds an element to a collection
- remove: Removes an element
- filter: Returns a collection of elements that match a condition
- map: Transforms each element in a collection
- sorted: Sorts a collection in ascending or descending order
