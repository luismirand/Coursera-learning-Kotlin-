//Maps
//Map represents an unordered collection of key-value pairs. Keys are unique and each of them maps to exactly one value.
// The values can have duplicates. Maps are useful for storing logical connections between objects,
// for example, an employee's ID and their position.


fun main() {
    val capitals = mapOf("USA" to "Washingtong", "Poland" to "Warsaw", "Mexico" to "Mexico City" )
//    val capitals: Map<String, String> = mapOf( //it does not need to be the same type.
    //        Pair("USA", "Washington"),
    //        Pair("Poland", "Warsaw"),
    //        Pair("Ukraine", "Kyiv")
    //    )

    println(capitals)  //{USA=Washingtong, Poland=Warsaw, Mexico=Mexico City}

    //Consider a map with associations between letters and their positions in the English alphabet,
// as in the example below. Its type is Map<Char, Int>, because its keys are characters, and values are integers.
    val alphabet: Map<Char, Int> = mapOf('A' to 111, 'B' to 222, 'C' to 333)

    println(alphabet)

//Finding a value for a key
    //For instance, to find a value for the key A in the alphabet map, use alphabet['A'].
// The result is a nullable value type, so Int? in this case.
    //Why nullable? If the key you asked for is not in the map, then null will be returned.

    val number:Int? = alphabet['A'] //guardar el valor en una variable
    println(number) //111
    println(alphabet['B']) //222 //imprimir el valor
    println(alphabet['D']) //null
    println(alphabet['2']) //null //solo con keys no con values

    //Adding elements to a map
    //maps are read-only
    println()
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")

    println(map1)
    println(map2)

    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3

    println(map3)
    println(map4)

    //Beware that duplicated keys are not allowed, so when you add a new association, it removes the old one.
    val mapa1 = mapOf('A' to "Alexis", 'B' to "Barbara")
    val mapa2 = mapa1 + ('B' to "Beto")
    val mapa3 = mapa1 + ('C' to "Barbara")
    println()
    println(mapa1)
    println(mapa2)
    println(mapa3)
    println(mapa1)

    //You can also remove certain keys from a map using the minus sign.
    println()
    val mapa4 = mapa1 - 'A'
    println(mapa4)

    //Checking if a map contains a key
    println('A' in mapa1) //true
    println('Z' in mapa1) //false

    println('A' !in mapa1) //false
    println('Z' !in mapa1) //true

    //Checking map size
    println(mapa1.size)//2

    //Iterating over maps
    for (entry in mapa1){
        println("${entry.key} is for ${entry.value}" )
    }

    //You can also restructure an entry into two variables. Kotlin supports restructuring in a for-loop.
    println()
    for ((letter, name) in mapa1){
        println("$letter iss for $name")
    }

    //Mutable map
    //The result type is MutableMap. You can add new associations to it using the put method or box bracket and assignment.
// You can also remove an association by key using the remove method.
    println()

    val mapp: MutableMap<Char, String> = mutableMapOf('A' to "Adriana", 'B' to "Bob")
    mapp.put('C', "Carlos")
    mapp['D'] = "Daria"
    println(mapp)

    mapp.remove('B')
    println(mapp)

    val s = setOf("A", "B", "A")
    println(s)
    val m = mapOf('A' to "Alberto", 'A' to "Alan", "A" to "Alaben", "A" to "Aywey")
    println(m)

    val mapita = hashOf("NIgeria" to "Abuja")



}

interface Ii{
    val ass: Int
}