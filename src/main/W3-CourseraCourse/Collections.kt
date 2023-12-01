fun main(){
    var shoppingList = listOf(
        "Tomatoes", "Servilletas", "Papas"
    )

    println(shoppingList) //[Tomatoes, Servilletas, Papas]
    println("The list is $shoppingList")

    //you can iterate over list elements
    for (element in shoppingList){
        println(element)
    }

    //size property is used to know how many elements are in a list
    println(shoppingList.size)//3

    //a list is read-only
    //but you can always create a new list

    val newSoppingList = shoppingList - "Servilletas" + "Leche"
    println(newSoppingList) //[Tomatoes, Papas, Leche]


    ///////////////////////////////////////////////////////////////////////////////////////
    shoppingList += "Cereal" //crea una nueva lista de fondo
    println(shoppingList)

    var listaa = listOf("A", "B")
    var nuevaListaa = listaa + "C"
    listaa += "C"

    println(listaa)
    println(nuevaListaa)

    //mutable list can change internally even if its val
    val mutableList = mutableListOf("X", "Y")
    mutableList.add("Z")
    println(mutableList)



}