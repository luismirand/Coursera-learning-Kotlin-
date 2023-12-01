//    Variable Scope
//Inside functions we can declare variables(local variables), they can only be used
//inside their scope (function's curly braces).
//These variables can only be used at the function in which they are defined

fun f1() {
    val a = "Text 1"
    println(a)
    //aqui se puede usar 'a' pero no 'b'
}

fun f2() {
    val b = "Text 2"
    println(b)
    //aqui se puede usar 'b' pero no 'a'
}
/*fun main(){
    f2()
    //aqui no se puede usar ni 'a' ni 'b'
}  */

//Scope limitations are very important for building independence between functions.
//Local variables should stay local, and other functions should not take an interest in them.

// To make a variable that can be used by multiple functions, define it at the same level as those functions.
// In the code below, a variable is defined outside all functions.
// Such variables are known as 'top-level variables'.

var name = ""
fun setName() {
    name = "Mike"
}

fun printName() {
    println(name)
}

/*fun main() {
    setName()
    printName()
}*/


// Local functions

fun b(){
    println("B")
    //here I cannot use function a
}

fun main(){
    //here I cannot use function a
    fun a(){
        println("A")
    }
    a() // Here I can use function a
    b() // Can be run created before main
    c() // Can be run created after main
    a() // Here I can use function a
}

fun c(){
    println("C")
    // here I cannot use function a
}

//buscar retos para hacer programas que tengan
// for y el uso de variables (por separado)