
//Examples when to use enum classes

enum class WeekDay{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum class Difficulty{
    EASY,
    MEDIUM,
    HIGH
}


//Enum class can also have a constructor.
// It looks just like a constructor in regular classes,
// but when it is defined, each value needs to call it.
// This mechanism is used to assign values to each enum value.
enum class PizzaSize(
    val sizeInCm:Int
){
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30)
}

fun printSize(pizzaSize: PizzaSize){
    println("$pizzaSize pizza is ${pizzaSize.sizeInCm}cm")
}

fun main(){
    printSize(PizzaSize.MEDIUM)
    printSize(PizzaSize.EXTRALARGE)
    println(PizzaSize.MEDIUM.sizeInCm)

}
