// If you want to call a method, you need to have an object.
// You can then call this method on an object.

//forma clasica editando la variable

/*class Dog(val name: String) {
    var hunger = 62
    fun feed() {
        println("Feeding $name")
        hunger = 0
    }
}

fun main() {
    val dog = Dog("Rex")
    dog.feed() // Feeding Rex
}*/

//agregando parametros al metodo

/*class Dog(val name: String) {
    var hunger = 62
}

fun feed(dog: Dog) {
    println("Feeding ${dog.name}")
    dog.hunger = 0
}

fun main() {
    val dog = Dog("Rex")
    feed(dog) // Feeding Rex
}*/


//usando this
/*class Dog(val name: String){
    var hunger = 62

    fun feed(){
        val currentDog: Dog = this
        println("Feeding ${currentDog.name}")
        currentDog.hunger = 0
    }
}

fun main(){
    val miperro: Dog = Dog("Docky")
    miperro.feed()

}*/

//class Dog(val name: String){
//    var hunger = 62
//
//    fun feed(){
//        println("Feeding ${this.name}")
//        this.hunger = 0
//    }
//}
//
//fun main(){
//    val miperro: Dog = Dog("Docky")
//    miperro.feed()
//
//}

//One example might be when you have a method parameter and class property with the same name.
// Like in the below class, there is a property name and a method changeName with a parameter name.
// So, if you use name inside the class, you will have a value of the parameter.
// To access the property, use this.name.

class User(var name: String){
    fun changeName(name: String){
        println("Changed name from ${this.name} to $name")
        this.name = name
    }
}

fun main(){
    val user: User = User("Pedro")
    user.changeName("Juan")
    println(user.name)


    val text = "Some Text"
    println(text.replace("Text", "New Text"))
    println("A B A D".replace("A", "G"))
}


