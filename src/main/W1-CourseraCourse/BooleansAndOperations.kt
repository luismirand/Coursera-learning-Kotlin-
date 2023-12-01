import kotlin.jvm.internal.PropertyReference0Impl

fun main() {
    /* Booleans
    A Boolean has two possible values, true and false,
    and can be used to tell users whether something is true or not.  */

    var cookiePolicyAccepted: Boolean = true
    // In Kotlin, you can use either the == operator or the equals()
    // when comparing strings.
    println(" == ")
    println("S" == "S") // true
    println("S" == "A") // false
    println(10 == 10) // true
    println(10 == 20) // false

// You can also check if two values are not equal to each other.
// For that, use an exclamation mark and an equal sign. You will notice that the results are exactly the opposite
// of what you had when you used the double equal sign
    println(" != ")
    println("S" != "S") // false
    println("S" != "A") //true
    println(10 != 10) //false
    println(10 != 20) //true

    println(" > ")
    println(10 > 10) // false
    println(20 > 10) // true
    println(10 > 20) // false

    println(" < ")
    println(10 < 10) // false
    println(20 < 10) // false
    println(10 < 20) // true

    print(" >= ")
    println(10 >= 10) // true
    println(20 >= 10) // true
    println(10 >= 20) // false

    println(" <= ")
    println(10 <= 10) // true
    println(20 <= 10) // false
    println(10 <= 20) // true

//    Logical Operations: Boolean
    //The 'and' operator (&&)
    println("Can play games? ")
    val finishedHomework = false
    val cleanedRoom = true
    val canPlayGames = finishedHomework && cleanedRoom
    println(canPlayGames)

    println("Tabla de verdad")
    println(true && true)  // true
    println(true && false)  // false
    println(false && true)  // false
    println(false && false)  // false
    println("Did I passed the exam?")
    val examResult = 50
    val passedExamen = examResult >= 60 && examResult <= 100
    println(passedExamen)

    //The OR operator "||"
    val carCleaned = true
    val grassCut = false
    val canGoToCinema = carCleaned || grassCut
    println("Can Steven go to the Cinema? $canGoToCinema")

    // The operator or represents an alternative. It returns true if any of its sides returns true.
    println(true || true)  // true
    println(true || false)  // true
    println(false || true)  // true
    println(false || false)  // false

    // The 'not' operator (!)
    //      it turns true into false and false into true.
    println(" ! NOT")
    println(!true)
    println(!false)

    val isAmazing = true
    println(!isAmazing) //false
    val isBoring = false
    println(!isBoring) // true

    //A good analogy for the logical operator not is a minus before a number.
    // It turns a negative number into a positive, and a positive into a negative.
    val positive = 1
    println(-positive) //-1
    val negative = -1
    println(-negative) //1

    //In programming, you can use negation multiple times.
    println(!true) // false
    println(!!true) // true
    println(!!!true) // false
    println(!!!!true) // true
    println(!!!!!true) // false

    val failedExam = true
    val roomCleaned = true
    val canPlayVideoGames = !failedExam && roomCleaned
    println("can Steven play? $canPlayVideoGames ") //false

    println(!true && false) //false
    println(!(true && false)) //true // primero se hace lo de adentro y luego cambia
    // ways to read
    // ! in front of a value as not and in front of a bracket as it is not true that.


    //BUENA INFO AL FINAL DE "Logical operations: Boleans sobre como leer las expresiones

}