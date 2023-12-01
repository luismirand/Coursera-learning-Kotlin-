//The String + ? (question mark) is a special type that indicates that the value can either be null or String
// The same with the others types

var nombre: String? = null
var nombre2: String? = "Pedro"


//Also with class types
class Userr(val name: String)
var user: Userr? = null

//Functions.
//You have to make its parameters nullable, then null will be accepted.
fun processUser(user: Userr?){}

fun main(){
    processUser(null)

    val result = processUser(null)

    //val user1 = Userr(null)
    //podria ser null si en los parametros de la clase fuera String?

    var message: String? = "Hello World"
    message = null //Assign null to the variable
    //var length = message.length // Will cause a Null Pointer Exception

    ///////////////////////////////////////////////////////////////////////////
    var message2: String? = "Hello World"

    message2 = null // Assign null to the variable

    if (message2 != null) {

        var length = message2.length // Will not cause an error because you have checked that the value is not null
        println(length)

    } else {
        println(null)
    }


    //Another way to avoid the error is to use a safe call.
    var message3: String? = "Hello"
    println(message3?.length) //Will print 5
    message3 = null
    println(message3?.length) //Will print null

    // With functions
    var message4: String? = "Hello"
    println(message4?.uppercase()) //HELLO
    message4 = null
    //println(message4?.uppercase()) //null

}

//Result type
fun nombreUser(user: Userr?): Userr?{
    return user//puedo devoler null tambien
}

//You need to explicitly say that a particular type is knowable, so it accepts null value,
// and you can do that by adding a question mark after the type to make it gullible.




//The risk of using nullable types is that if you try to access a property or function on a variable
// that is currently assigned a null value, it will cause an NPE (null pointer exception)

//Using nulls introduces risks of errors, but you will encounter scenarios where they are required.
//Using the appropriate checks will help avoid errors and ensure that your code will run without issue.

