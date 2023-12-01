//List is the most basic type of collection. It represents an ordered list of elements.
// The same elements can be repeated multiple times. You might use a list to represent products in a
// shopping cart or delivery method options. The order of elements is preserved, so if you define a list of
// delivery methods in some configuration, those elements should be displayed in the same order on the payment window.

fun main() {
    //you can specify the type of the elements of the list

    var letras: List<String> = listOf("A", "B", "C")
    println(letras)

    val nums: List<Int> = listOf(1,2,3)
    println(nums)

    //adding elements to lists
    println(letras + "D")
    println(letras)
    letras += "D" // se crea otra lista de fondo
    println(letras)
    //letras -= "A" //se elimina "A"
    //println(letras)

    println(letras + listOf("E"))
    println(listOf(1) + letras) //no afecta a la lista

    //Getting the size of a list
    println(letras.size) //4

    //To check if a list is empty, you can compare its size to 0, or you can use the isEmpty method.
    println(letras.size == 0) //false
    println(letras.isEmpty()) //false

    val emptyList: List<String> = listOf()
    println(emptyList.size == 0) //true
    println(emptyList.isEmpty()) //true

    //Getting elements at certain positions
//You can think of a list like it is a shelf of an infinite size, where you place the next elements
// at the next positions. It is important to note that the position of the first element is 0.

    println(letras[0])//A
    println(letras[1])//B
    println(letras[2])//C


    //Checking if a list contains an element
    println(letras.contains("A")) //true
    println(letras.contains("Z")) //false

    println("A" in letras) //true
    println("Z" in letras) //false

    //You can also check the opposite to determine if the collection
    // does not contain the element using the !in operator.
    println("A" !in letras) //false
    println("Z" !in letras) //true


    //Iterating over lists
    for(letra in letras){
        println(letra)
    }

    //Using mutable lists
//    List is a type representing read-only lists. If you want to create a mutable list, use mutableListOf,
//    and the result type is MutableList. With mutable lists, you can use methods like add or remove to add or remove a certain element.

    val letrasMutable: MutableList<String> = mutableListOf("A", "B")
    letrasMutable.add("C")
    println(letrasMutable)

    letrasMutable.remove("B")
    println(letrasMutable)

    letrasMutable[1] = "Z" //solo puede modificar campos ya creados
    println(letrasMutable)

    //las mutableList pueden hacer lo mismo que las List pero las List no pueden hacer to do lo de las mutableList
}
