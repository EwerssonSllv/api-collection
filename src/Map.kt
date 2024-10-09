fun main(){
    val pair: Pair<String, Double> = Pair("Ewersson", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("Key: $k - Value: $v") }

    val map2 = mapOf(
        "Silva" to 2500.0,
        "Oliveira" to 3000.0
    )

    map2.forEach{ (k, v) -> println("Key: $k - Value: $v") }
}