// Smart-Casting
//smart-casting is a Kotlin capability that can change the type of variable for a scope,
// but only if Kotlin knows that the variable is of that type in the scope.

fun consume(a: Any){
    if (a is String){
        println(a.length)  // the type of a is String
    }
    if (a is Int){
        println(a *10) // the type of a is Int
    }
}

fun consume2(b: String?){
    if (b != null){
        println(b.length)
    }else{
        println("Cannot handle null")
    }
}
fun consume3(c: String?){
    if (c == null || c.length == 0) { return }// after || c is smart-casted to String
        println(c.length) // the type of c is String
}

var d: String?= null

fun main() {
    consume("ABC")
    consume(10)

    consume2(null)
    consume2("Hola")

    consume3(null)
    consume3("Holaa")
    consume3("")

    d = "sam"
    if (d != null){
        //println(d.length) //Smart cast to 'String' is impossible, because 'd' is a mutable property that could have been changed by this time
    }

}