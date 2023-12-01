import java.lang.NumberFormatException

//A sealed modifier used in front of a class behaves just like abstract, but it also introduces some limitations.

sealed class Result
class Success(val data: String): Result()
class Failure(val exception: Throwable): Result()

//Officially subclasses of a sealed class need to be defined in the same package.
// What is more important is that a sealed modifier is information to the developer who reads the code -
// it informs them that this class has a limited number of subclasses known in advance during compilation.



sealed class Role
class CeoRole(val name: String): Role()
class ManagerRole(val name: String): Role()
class WorkerRole(val name: String): Role()


fun constructLabel(role: Role): String{
    return when(role){
        is CeoRole -> "The Boss"
        is ManagerRole -> "Manager ${role.name}"
        is WorkerRole -> role.name
    }
}

fun main(){
    val label = ManagerRole("Fedrik")
    println(constructLabel(label))
    val pedrito = pedro(null)
    pedrito.ola()

}

class pedro(a: String?){
    fun ola(){

    }
}




//Since it covers all the possible subtypes of Role in a when expression,
// you do not need to specify an else block. It is possible thanks to the sealed modifier.