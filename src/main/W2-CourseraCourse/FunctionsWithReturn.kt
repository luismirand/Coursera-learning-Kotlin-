fun main() {
    println("Areas")
    val area: Double = triangleArea(3.0, 2.0)
    println(area)
    println(triangleArea(5.0, 7.0))
    println("Mas grande de: ")
    println(biggerOf(8, 4))


}

//Functions can also return a value. For that, a function should declare the return type,
// using a colon and type after the parameters parenthesis.
// Inside a body, such a function should also use return to return the value.
fun triangleArea(width: Double, height: Double): Double{
    return (width * height) / (2)
}

fun biggerOf(num1: Int, num2: Int): Int {
    return when {
        num1 > num2 ->  num1
        num2 > num1 ->  num2
        else -> num1
    }
}
//otra forma de implementarlo
fun biggerOf2(num1:Int, num2:Int):Int{
    if (num1>num2){
        return num1
    }
    //no necesitamos else porq si llega a este punto no se correra lo anterior
    return num2
}


//Single expression functions
//ejemplo de las mismas funciones pero reducidas
fun triangleAreaSingle(width: Double, height: Double): Double{
    return width * height /2
}
fun biggerOfSingle(a: Int, b:Int):Int{
    return if(a>b) a else b
}

//inclusive mas simple en una sola linea
    // en este caso no es necesario usar "return"
fun triangleAreaSimplier(width: Double, height: Double): Double = width * height /2

fun biggerOfSimplier(num1: Int, num2: Int): Int = if (num1>num2) num1 else num2

//notacion de como funcionan

//fun {function name}({parameters}): {result type} = {expression body}

//fun {function name} ({parameters}):{result type}{
//    return {expression body}
//}




