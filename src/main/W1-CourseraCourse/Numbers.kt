fun main() {

    val a = 10 // the type of a is Int
    val b = 2147483647L // the type of b is Long
    val c = 10.0 // the type of c is Double
    val d = 10F // the type of d is Float

    val smallDebt = -0.72
    println(smallDebt) // -0.72
    val million = 1_000_000 //underscore to improve readability
    println(million) // 1000000

    //ways to transform a type of number into another using functions
/*
    You can transform one number type into another using transformation functions.
    They start with the prefix to and then the type you want.
*/
    val i: Int = 10
    val l: Long = i.toLong()
    println(i)
    println(l)

    val d1: Double = i.toDouble()
    val d2: Double = l.toDouble()

    println(d1)
    println(d2)


//    Reminders return what would be left if you divide
//    an integer by another integer
    println(10%3)
    println(11%3)
    println(10%5)

//    The sign of the result is always the same as the sign of the left side
    println(-1%3)
    println(1%-3)
    println(-1%-3)

//    If we use different types in an operation
    val num1 = 1 + 2L // the type is Long
    val num2 = 1 + 2.0 //the type is Double
    val num3 = 1.0F + 2 // the type is Float
    val num4 = 1.0F + 2.0 // the type is Double

//    The result of the division between two integers is an integer
//    The decimal part will be lost, to prevent this we have to
//    transform at least one of the values to either Double or Float
//    before we make an operation
    val n1 = 5
    val n2 = 2
    println(n1/n2) // result 2
    println(n1.toDouble() / n2) // result 2.5

//    Operational precedence / jerarquia de las operaciones se respeta
    println(1 + 2 * 3) // result is 7
    println((1 + 2) * 3) //result is 9

//    Augmented assignments
    var a1 = 10
    println(a1) //10
    a1 *= 3
    println(a1) //30
    a1 -= 12
    println(a1) //18
    a1 /= 3
    println(a1) //6
    a1 %= 4
    println(a1) //2

//    Prefix and postfix operation
    println(a1 + 1) // no se afecta la variable
    println(a1++) //afecta a la variable pero no lo muestra
    println(++a1) //afecta a la variable y muestra sus cambios y el cambio de la linea de arriba

    /* A postfix operation, which means that if you use that operation in an arithmetic equation,
    the postfix operation is executed after the equation is evaluated.*/

    var numb = 5
    val eq = 6 + numb++ // the result will be 11 and then a will be = 6
    val newEq = 6+numb // the result will be = 12


    /*A prefix operation works differently. If you use the prefix operation in an arithmetic equation,
    the prefix operation is executed before the equation is evaluated. */

    var numb2 = 5
    val eq2 = 6 + ++ numb2// the result a will be 6 and then eq will be = 12
    val newEq2 = 6+numb2 // the result will be =12

    // The same follows if you use postfix and prefix operations in subtraction (a-- and --a) .
    //  a++ is an alternative to a = a + 1,  a-- is an alternative to a = a - 1

    // si necesito que se añada (1) a la variable antes de hacer una operacion uso ++num1
    // ni no es importante que se añada (1) a la variable al momento uso num1++

}