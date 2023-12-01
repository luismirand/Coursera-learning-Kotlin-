fun main(){
    var userName: String
    userName = "luis"
    userName = 2.toString() // para convertir un integer a String
    userName = "pedro"
    println("hola $userName")

    val age: Int
    age = 19
    println("el nombre del usuario es $userName y su edad es $age")


    // podremos cambiar el tipo independientemente de con cual la inicualizamos
    // solo usando Any
    
    var x: Any = "ABC"
    println(x) // ABD
    x = 123
    println(x) // 123
    x = true
    println(x) // true

    /* Cuando no especificamos Any en el tipo no podremos cambiar el tipo en
    la existencia de la variable

    var y= "ABC"
    println(y) // ABD
    y = 123
    println(y) // 123
    y = true
    println(y) // true
    */



}