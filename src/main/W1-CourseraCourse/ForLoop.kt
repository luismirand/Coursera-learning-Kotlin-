import kotlin.math.max

fun main() {
    //    For loop
    //To call code for each number from a to b,
    // including b, use the range a..b

    val a = 0
    val b = 5
    for(i in a..b){
        print("$i ") // 0 1 2 3 4 5
    }

    // To call code for each number from a to b,
    // excluding b, use a range a until b
    println()
    for (i in a until b){
        print("$i ") // 0 1 2 3 4
    }

    // To call code for each number from a to b,
    // where a is bigger than b
    println()
    val c = 5
    val d = 0
    for (i in c downTo d){
        print("$i ") //5 4 3 2 1 0
    }

    //To call code for each number from a to b,
    // with a step c, use a..b step c
    //the step is the space between each value iteration
    println()
    val a1 = 0
    val b1 = 10
    val c1 = 3
    for (i in a1..b1 step c1){
        print("$i ") //0 3 6 9
    }

    //To call code for each number from a to b, excluding b,
    // with a step c, use a until b step c
    println()
    val a2 = 0
    val b2 = 9
    val c2 = 3
    for (i in a2 until b2 step c2){
        print("$i ") //0 3 6
    }

    //To call code for each number from a to b, where a is bigger
    // than b, with a step -c, use a downTo b step c
    println()
    val a3 = 10
    val b3 = 1
    val c3 = 3
    for (i in a3 downTo b3 step c3){
        print("$i ") //10 7 4 1
    }
    println()
    for (num in 5 downTo 1){
        println("$num lemonades are left")
        println("Glupglup")
    }
    println("That's it")
    println("Now I have to go")

//    Nested loops (for)

    /*// square made up of stars
    for (i in 1..5){
        for (j in 1..5){
            print("*")
        }
        println()
    }

    //triangle made up of stars
    println()
    for (i in 1..5){
        for (j in 1..i){
            print("*")
        }
        println()
    }
    println()
    val height = 10
    for (i in 1..height){
        for (j in 1.. i){
            print("*")
        }
        println()
    }

    // with downTo function
    println()
    for (i in 1..5){
        var numberOfStars = 6- i
        for (i in numberOfStars downTo  1){
            print("*")
        }
        println()
    }
    // otra manera de hacerlo
    for (i in 1..5) {
        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println()
    val height1 = 10
    for (numberOfStarrs in 1..height1){
        for (j in height1 downTo numberOfStarrs){
            print("*")
        }
        println()
    }

    // hacer una piramide de lado
    println()
    val maxWidth = 10
    for (i in 1 until maxWidth){
        for (j in 1 .. i){
            print("*")
        }
        println()
    }
    for (i in 1 ..  maxWidth){
        for (j in maxWidth downTo  i){
            print("*")
        }
        println()
    }

    // otra forma de hacerla con saltos de 2
    println()
    val width = 5
    for (i in 1 until width step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    // triangulo al reves
    println()
    for (i in 1..5){
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces){
            print(" ")
        }
        val numberOfStars = i
        for (j in 1.. numberOfStars){
            print("*")
        }
        println()
    }

    //hacer una piramide
    println()
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }*/
    // los hechos por mi a memoria
    //cuadrado
    val lenght = 5
    for (i in 1..lenght){
        for (j in 1..lenght){
            print("*")
        }
        println()
    }
    //medio traingulo para abajo
    val largo = 5
    for (i in 1..largo){
        for (j in 1..i){
            print("*")
        }
        println()
    }
    //de grande para pequeño
    for (i in 1..5){
        var numberOfStars = 6- i
        for (i in numberOfStars downTo  1){
            print("*")
        }
        println()
    }

    //medio triangulo para arriba
    println()
    var espacios: Int
    for (i in 1..5){
        espacios = 5 - i
        for (j in 1.. espacios){
            print(" ")
        }
        for (j in 1..i){
            print("*")
        }
        println()
    }

// piramide de lado con saltos

    val width = 5
    for (i in 1 until width step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    //falta terminarlo solo

    //piramide normal
    println()
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

}