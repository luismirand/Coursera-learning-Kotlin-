data class Doggyy( // con el data modifier
    val namee: String,
    val agee: Int)

fun main() {
    val dog1 = Doggyy("Coookie", 1)
    val dogy = Doggyy("Cookie", 1)
    val dog2 = Doggyy("Canelo", 2)
    val dog3 = Doggyy("Doc", 1)

    val (nombree, edad) = Doggyy("JUan", 3)
    println(nombree)
    println(dog1 == dogy) //false
    println(dog1 == dog1) //true
    println(dog1 == dog3) //false

    println(dog1) //Doggyy(name=Coookie, age=1) //referencia de este objeto
    println(dog1) //Doggyy(name=Coookie, age=1)
    println(dog2) //Doggyy(name=Canelo, age=2)

    val dog4 = Doggyy("Pedro", 5)
    val (name, age) = dog4
    println(name)
    println(age)

    val newDog4 = dog4.copy(agee = 3) //podemos modificar un val, especificando que cambiar
    println(dog4)
    println(newDog4)

    //////////////////////////////////////////////////////
    println()
    val pluto1 = Kitti("Pluto")
    println(pluto1)
    val pluto2 = Kitti("Pluto")
    println(pluto2)
    val rex = Kitti("Rex")
    println(rex)

    println(pluto1 === pluto2) //true //(me sale false)
    println(pluto1 == pluto1) //true
    println(pluto1 == rex)   //false

    //When you transform a data class into a string, you not only have this class name, but also values for each constructor property.
    println(pluto1)
    println("Dog: $pluto1")
    println()

    // Data classes can be destructured, which means reading values from this class and assigning them to variables.
    val deer = Deer("Platon", 7)
    val (namee, agee) = deer
    println(namee)
    println(agee)

    println()
    println(deer.copy())
    println(deer.copy(age1 = 10))
    println(deer.copy(name1 = "Neptune"))

    //You use data modifiers for classes that are used to represent a bundle of data. Such classes are quite common in programming.


    
}

data class Kitti(
    val name: String
)

data class Deer(
    val name1: String,
    val age1: Int
)

