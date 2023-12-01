fun main() {

    val finishedHW = true
    if (finishedHW) {
        println("Can go to the cinema")
    }else {
        println("Cannot go to the cinema")
    }

    val i = 1
    if (i < 3){
        println("Smaller")
    }else {
        println("Bigger")
    }

    /*
    An if-else statement can be used as an expression. In other words, to return a value that can be stored in a variable.
    The returned value is the value returned by the body block that was chosen. In the code below, the predicate returns true,
    so the first body is chosen, so 10.0 is returned. */

    val haveSomeExtraMoney = true
    val tip: Double =
        if (haveSomeExtraMoney) {
            10.0
        } else {
            0.0
        }
    println(tip) //10.0

    //tambien puede escribirse en una sola linea y funciona igual
    // However, if you have only one expression in your body, you can skip braces.
    // solo hacerlo cuando las opciones son menos de una linea
    val top = if(haveSomeExtraMoney) 10.5 else 1.0
    println(top)

    //tambien puede adjuntarse con print y el valor que asignes
    val tip2 =
        if (haveSomeExtraMoney){
            println("Here you go") //Here you go
            10.0
        }else{
            println("Sorry, I'm broke")
            0.0
        }
    println(tip2) //10.0

//    If-else-if
    println("Is it going to rain? IF-THEN-IF")
    val probability = 70
    if (probability <= 40){
        println("Unlikely")
    }else if (probability <= 80){
        println("Likely")
    }else if (probability < 100){
        println("Yes")
    }else{
        println("What?")
    }

//    Instead of if-then-if it's better to use when statement
    println("Is it going to rain? WHEN")
    val probability2 = 39
    when{
        probability2 < 40 ->{
            println("Unlikely")
        }
        probability2 <= 80 -> {
            println("Likely")
        }
        probability2 < 100 -> {
            println("Yes")
        }
        else -> {
            println("What?")
        }
    }

//Just like in an if statement, braces are needed only for bodies
// with more than one statement. If there is only one statement
// in a body, you can leave out the braces.

    println("Is it going to rain? WHEN(without braces)")
    val probability3 =90
    when {
        probability3 < 40 -> println("Unlikely")
        probability3 <= 80 -> println("Likely")
        probability3 < 100 -> println("Yes")
        else -> println("What?")
    }

//    Using when as an expression
    println("Is it going to rain? WHEN (expression)")
    val probability4 = 101
    val text = when {
        probability4 < 40 -> "Unlikely"
        probability4 <= 80 -> "Likely"
        probability4 < 100 -> "Yes"
        else -> "What?"
    }
    println(text)

//    When with a value
    //If you add a value in brackets after the when keyword,
    // then in each branch, Kotlin compares this value to other values.

    val numb = 4
    when(numb){
        1 -> {
            println("Missed hit ")
        }
        2,3,4,5 -> {
            println("Hit with a value $numb")
        }
        6 -> {
            println("Critical Hit")
        }
    }

    // as an expression
    // remember that we have to add an else block
    val number = 7
    val hit = when (number){
        1 -> "Missed hit "
        2,3,4,5 -> "Hit with value $number"
        6 -> "Critical Hit"
        else -> "Unsupported Value"
    }
    println(hit)

//    Using ranges in when statements
    val num1 = 1
    val hit2 = when (num1){
        1 -> "Missed hit"
        in 2..5 -> "Hit with a value $num1"
        6 -> "Critical Hit"
        else -> "Unsupported Value"
    }
    println(hit2)

//    Type Check
    println("Checar que tipo es")
    var value: Any = "ABC"
    println(value is String) //true
    println(value is Int) //false
    println(value is Boolean) // false
    println(value is Any) // true

    value = 123
    println()
    println(value is String) // false
    println(value is Int) // true
    println(value is Boolean) // false
    println(value is Any) // true

// Type-check can also be used as a branch in a when statement with a value.
// This is a popular pattern in Kotlin to decide what action should be performed based on a variable type.
    val something: Any = "ABC"
    when (something) {
        is String -> println("is a String")
        is Int -> println("is an Int")
        is Boolean -> println("is a Boolean")
        is Double -> println("is Double)")
    }


}