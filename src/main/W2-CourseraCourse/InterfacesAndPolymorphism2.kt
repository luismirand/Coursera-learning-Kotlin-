//up-casting
//Using an object of some type where its subtype is expected is called up-casting.
//The more abstract types are above the less abstract types. Since every Dog is an Animal,
// but not the other way around, you typically present Animal above Dog.
// Upcasting es tratar un objeto específico como si fuera más general.
// osea una clase tranformarla a una interfaz


//down-casting
//Such an operation would not be safe. Animal can be of type Dog, but it can also be of type Cat.
// While it is possible, it is called down-casting, and it is done by using the as keyword,
// and the type you want to cast to.
//Downcasting es tratar un objeto general como si fuera más específico, pero solo si estás seguro de que es cierto.
// hacer una interfaz una clase


interface Animals

class Fog(val name: String): Animals {
    fun retrieve(item: String){
        println("Retrieving $item")
    }
}

class Kat(val name: String): Animals{
    fun pet(){
        println("Mrrrrr")
    }
}

fun play(animal: Animals){
    val dog: Fog
        = animal as Fog //down-casting -> Do that ONLY when you know an object is of the type you are casting to
    dog.retrieve("stick")
}

//smart-casting
//using smart-casting, you can safely down-cast objects for some scope.

fun play2(animal: Animals){
    if (animal is Fog){
        animal.retrieve("paloo")
    }else{
        println("idk how to play with this animal")
    }
}

//Often smart-casting is used together with a when statement.

fun play3(animal: Animals){
    when(animal){
        is Fog -> animal.retrieve("palo1")
        is Kat -> animal.pet()
    }
}
fun main(){
    println("--------down-casting")
    play(Fog("Rex"))
    //play(Kat("Garfield"))  //Error

    val perro: Fog = Fog("pedro")
    perro.retrieve("palo")

    println("---------manera segura de checar")
    checkIsDog(Fog("Rex"))
    checkIsDog(Kat("Juan"))

    println("---------checar y accionar")
    play2(Fog("Cesar"))
    play2((Kat("blu")))

    println("---------usando when")
    play3(Fog("Cesar"))
    play3((Kat("blu")))

}

//There is also a safer variant. You can check if an object is of a particular type
// using the is keyword. So to check if Animal is Dog, you can use animal is Dog,
// which returns true if it is, and false otherwise.

fun checkIsDog(animal: Animals){
    if(animal is Fog){
        println("It is a dog")
    }else{
        println("It is not a dog")
    }
}