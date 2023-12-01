//       Animal
//        /   \
//      Dog   Cat             polymorphism = many forms

interface Animal{
    val breed: String //no es necesario especificar el valor, es el trabajo de las clases
    fun pet()
}

class algo(var alguito: String){
    fun snake_case(){
        println(this.alguito)
    }
}

class Cat(
    val name: String,
    override val breed: String //informa que esta propiedad tambien esta en una interfaz
): Animal{
    override fun pet() {
        println("Miau")
    }
}

class Dog(
    val name: String,
    override val breed: String
): Animal{
    override fun pet() {
        println("Woff")
    }
}

class Monkey(
    override val breed: String
): Animal{
    override fun pet() {
        println("kukukaka banana")
    }
    fun haha(){
        print("haha coke")
    }
}

class Emu: Animal{
    override val breed: String = "Emu"

    override fun pet() {

    }
}

fun pet(animal: Animal){
    println("Pettin ${animal.breed}")
    animal.pet()
}

fun main(){
    val variable: algo = algo("Ouuyea")
    pet(Cat("Jack", "Naranja"))
    pet(Dog("pedro", "labrador"))
    pet(Emu())

    variable.snake_case()

    var monke = Monkey("Gorilla")
    monke.haha()
    monke.pet()
    val dog: Dog = Dog("canelo", "alvarez")
    val animal: Animal = dog

    val i: Int = 120




//    var cat1: Cat = Cat("juancho", "negro")
//    cat1.pet() // lo mismo pero directamente declarando el objeto
//    pet(123) //no acepta nada mas
//    pet("Abc") // no acepta Strings

}