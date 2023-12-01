//Set

//Sets are quite similar to lists; that’s why similar methods are used to operate on them.
// However, sets do not treat the order as seriously as lists. Some kinds of sets might not respect it.
// That is why you cannot get elements by index. Instead, sets require their elements to be unique.
fun main() {
    val nombres = setOf("Pedro", "Juan", "Aura")
    println(nombres)

    val letters: Set<Char> = setOf('A', 'B', 'C')
    println(letters)

    //Adding elements to sets
    println(letters + 'D' + 'E')
    println(letters + setOf('d', 'e'))
    println(setOf('Z') + letters) //ninguno de estos modifica el set
    println(letters)

    //Establishing the size of a set
    println(letters.size) //3

    //check if its empty
    println(letters.size == 0)//false
    println(letters.isEmpty())//false

    val emptySet: Set<Int> = setOf()
    println(emptySet.size == 0)//true
    println(emptySet.isEmpty())//true

    //Elements in sets are unique
//Elements that are already in a set are not added; their addition is just ignored.

    val setDeLetras = setOf('A', 'B','C')
    println(setDeLetras + 'B') //ignora un repetido
    println(setDeLetras + setOf('B', 'D')) //solo agrega 'D' al ser el unico nuevo

    val listaDeLetras = listOf('A', 'B','C')
    println(listaDeLetras + 'B') //agrega B
    println(listaDeLetras + setOf('B', 'D')) //agrega los dos

    //en cualquiera de estos casos nunca se modifica el set o lista


    //Also, if you duplicate arguments in the setOf function, the second argument will be ignored.
    val otroSet = setOf('A', 'B', 'A')
    println(otroSet)

    //Two elements are duplicated if they are equal, so if == between them returns true.
// Since regular classes are considered unique, they are never considered to be duplicates.

    class User(val name: String)

    val classSet = setOf(User("A"), User("A"))
    println(classSet + setOf(User("A"))) //imprime 3 diferentes objetos
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    data class Usuario(val name: String)

    val dataClassSet = setOf(Usuario("A"), Usuario("A"))
    println(dataClassSet + setOf(Usuario("A"))) //solo imprime uno ya que data classes pueden considerarse iguales al tener mismos paraemtros


    //Checking if a set contains an element
    val letters2 = setOf('A', 'B', 'C')

    println(letters2.contains('A'))//true
    println(letters2.contains('Z'))//false

    println('A' in letters2) //true
    println('Z' in letters2) //false

    println('A' !in letters2) //false
    println('Z' !in letters2) //true

    //Iterating over sets
    for (let in letters2){
        println(let)
    }

    //Using mutable sets
//et is a type representing read-only sets. If you want to create a mutable set, use mutableSetOf, and the result type is MutableSet.
// With mutable sets, you can use methods like add or remove to add or remove a certain element.

    val mutableSet = mutableSetOf('A', 'B')
    mutableSet.add('C')
    println(mutableSet)

    mutableSet.remove('B')
    println(mutableSet)





}

