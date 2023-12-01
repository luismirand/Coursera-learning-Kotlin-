
//
fun factorial(num:Int): Int{
    var accumulator = 1
    for (i in 1..num){
        accumulator *= i
    }
    return accumulator
}

fun main() {
    val number = 5
    println("The factorial result of $number is ${factorial(number)}")
    println("the factorial result of $number is ${factorial2(number)}")

}

//segunda revision del factorial (otra manera de hacerlo recursivo)
fun factorial2(num:Int):Int{
    if (num <= 1){
        return 1
    }
    return factorial2(num-1)*num
}

/*
//ASI ES COMO FUNCIONA LA FUNCION DE factorial2 (con el ejemplo de 3)

factorial(3) ->
(factorial(2) * 3) ->
((factorial(1) * 2) * 3) ->
((1 * 2) * 3) ->
(2 * 3) ->
6

*/

//Notice that it is very important that our function starts with a condition so that after a limited number,
//recursive calls will not be fulfilled. Such a condition (or its result) is known as the base case.
//Without it, recursive calls will happen until the program is stopped by too many recursive calls.