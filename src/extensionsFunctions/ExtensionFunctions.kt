package extensionsFunctions

fun main(){

    val values = arrayOf(
        "1000".toBigDecimal(),
        "2000".toBigDecimal(),
        "3000".toBigDecimal(),
        "4000".toBigDecimal(),
        "5000".toBigDecimal()
    )

    println("----- Sum -----")
    println(values.sum())

    println("----- Average -----")
    println(values.average())

}