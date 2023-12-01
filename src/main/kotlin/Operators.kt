fun main() {
    var x = 5  // no es necesario declararlo como double cuando uno ya es
    val y = 3
    println("x = $x and y = $y")

    //operators

    println("x + y = ${x + y}") // placeholder = we only put expressions
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

//  Augmented assignments

    result += 2 // result = result + 2
    println("result = $result")

    result -= 2 // result = result - 2
    println("result = $result")

    result *= 2 // result = result * 2
    println("result = $result")

    result /= 2 // result = result / 2
    println("result = $result")

    result %= 2 // result = result % 2
    println("result = $result")


    //operator precedence
    //algunos operadores se califican primero como en las mates de verdad
    // es necesario poner parentesis
    println("3 + 3 * 4 = ${(3 + 3) * 4}")


    x = 0
    println("x = ${x++}") //primero imprime el valor original y luego agrega +1
    println("x = ${++x}") //primero agrega +1 y luego imprime

    println("x = ${x--}") // aqui hcae lo mismo pero en resta
    println("x = ${--x}")

    val isActive = true
//    Checking if it's true BOOLEANS
    if (isActive == true) {
        println("User is Active")
    } else {
        println("User is not Active")
    }

//     Using booleans simplfied
    val isActive2 = true
    if (isActive2) {
        println("The user is active")
    } else {
        println("The user is not active")
    }
//     podemos preguntar si es falso
    val isActive3 = true
    if (!isActive3) {
        println("The user is active")
    } else {
        println("The user is not active")
    }
//    Checking if its greater than or equal
    val myNumb = 150
    if (myNumb >= 150) {
        println("Greater or equal than 150")
    } else if (myNumb > 90) {
        println("Grater than 90")
    } else {
        println("All the conditions failed")
    }
    //    Checking if its less or equal than
    val myNumb2 = 150
    if (myNumb2 <= 150) {
        println("Less or equal than 150")
    } else if (myNumb2 < 150) {
        println("Less than 150")
    } else {
        println("All the conditions failed")
    }

    //    Checking if its different
    val myNumb3 = 151
    if (myNumb3 != 150) {
        println("Its not equal 150")
    } else if (myNumb3 == 150) {
        println("Equals 150")
    } else {
        println("All the conditions failed")
    }

//    Combining multiple expressions
    //logical AND (solo si todas las condiciones son verdad)
    val isPlaying = true
    val score = 100
    if (isPlaying && score == 100) {
        println("Next level opened")
    } else {
        println("Still the same level")
    }

    //logical OR (cuando al menos de las condiceiones es cierta)
    val num1 = -5
    val num2 = -2

    //podemos colocarlo en una variable para guardar el resultado
    val text = if (num1 > 0 || num2 > 0) {
        println("The condition is true")
        "This is text1"
    } else {
        println("The condition is false")
        "This is text2"
    }
    println(text) //imprimir el resultado

    //podemos quitar los curly braces
    val text2 = if (num1 > 0 || num2 > 0)
        "This is text1"
    else
        "This is text2"

    //tambien podemos ponerlo en una sola linea
    val text3 = if (num1 > 0 || num2 > 0) "This is text1" else "This is text2"

    //y no es necesario guardarlo en una variable
    if (num1 > 0 || num2 > 0) "This is text1" else "This is text2"

    //podemos tambien usar enteros(int) como resultado
    if (num1 < 0 || num2 < 0) "This is text1" else println(5)

    //no usar esta forma recortada sin curlybraces cuando tenemos muchas lineas de codigo en
    //el codigo de adentro y tambien en el else

    /* if (num1 > 0 || num2 > 0)
         println("This is text111")
         println("This is text222")*/
    // este es un error porq puede correr parrtes del codigo que no querramos
}