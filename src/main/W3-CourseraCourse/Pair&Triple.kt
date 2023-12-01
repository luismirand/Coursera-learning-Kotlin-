fun main() {

    //In some cases, you need to represent a pair of values.
    // For that, a class you can use is the Pair class.
    // This is a data class with two constructor properties,
    // you do not need to define it, as it is distributed with Kotlin.

    val pair = Pair(1, "holaaa")
    println(pair.first)
    println(pair.second)
    val(number, letter) = pair // destructuring it into variables
    println(number)
    println(letter)
    println()
    //another way to create a pair
    val otroPair = "qonda" to 2
    println(otroPair.first)
    println(otroPair.second)
    val(letra, numero) = otroPair
    println(letra)
    println(numero)
    //Another such class is called Triple,
// and it is used to keep three values on properties first, second and third.
    println()
    val triple = Triple(1F, "ABC", true)
    println(triple.first)
    println(triple.second)
    println(triple.third)
    val(numFloat, palabra, booleano) = triple
            // the type of numFloat is Double
            // the type of palabra is Char
            // the type of booleano is Boolean
    println(numFloat)
    println(palabra)
    println(booleano)


}
