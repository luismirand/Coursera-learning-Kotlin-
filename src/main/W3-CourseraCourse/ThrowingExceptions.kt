/*class MyError: Throwable("Some message")

fun someFunction(){
    throw myError()
    println("Will not be printed")
}


fun main(){
    try {
        someFunction()
        println("Will not be printed")
    }catch (e: Throwable){
        println("Caught $e")
    }
}*/


/*class MyError: Throwable("Some message")

fun someFunction() {
    throw MyError()
    println("Will not be printed")
}

fun main() {
    someFunction()
    println("Will not be printed")
}*/

//Message is a parameter from Throwable,
// that is often specified when you throw an exception.


//there is the finally block that is invoked even if an exception occurs.
fun someFunction(){
    throw Throwable("Some error")
    println("Will not be printed")
}

/*fun main(){
    try {
        someFunction()
        println("Will not be printed")
    }finally {
        println("Finally block was called")
    }
    println("Will not be printed")
}*/


//The finally block is also invoked when the try block finishes without an exception.

fun otherFunction(){
    println("Will be printed")
}
/*
fun main() {
    try {
        otherFunction()
        println("Will be printed")
    } finally {
        println("Finally block was called")
    }
    println("Will be printed")
}*/

//finally block is used to do operations that should always be done,
// no matter if an exception occurred or not. It typically involves closing connections or cleaning-up resources.

fun findClusters(number: Int){
    if (number < 1) throw IllegalArgumentException("The number of clusters cannot be smaller than 1")
}

    var userName = ""
fun printUserName(){
    if (userName == "") throw IllegalStateException("User name must not be empty")
}

fun main(){
    findClusters(0)
    printUserName()

}
