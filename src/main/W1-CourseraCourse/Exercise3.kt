import kotlin.math.max

fun main() {
    /*The first task is to display the following triangle
    built using star symbols:
            *****
             ****
              ***
               **
                *
    */
    val total = 7
    for (i in 1..total){
        val espacios = i - 1
        for (j in 1..espacios){
            print(" ")
        }
        val estrellas = total - i
        for (j in 1..estrellas){
            print("*")
        }
        println()
    }

    /* display the triangle shape below. You can use the steps in Task 1
    as a guide to solving this task.

                    *********

                     *******

                      *****

                       ***

                        *
        */

    val renglones = 10
    for (i in 1..renglones){
        val nEspacios = i -1
        for (j in 1..nEspacios){
            print(" ")
        }

        var maxEstrellas = (renglones * 2 + 1) - (i*2) //11 - i*2
        for (j in 1..maxEstrellas){
            print("*")
        }
        println()
    }
/* TASK 3
    *

   **

  ***

 ****

*****

 ****

  ***

   **

    *

 */
    println()
    val maxTamano = 14
    for (i in 1 until maxTamano){
        for (j in maxTamano-1 downTo i){
            print(" ")
        }
        var numrOfStars = i //solo para especificar
        for (j in 1..numrOfStars){
            print("*")
        }
        println()
    }
    for (i in 1..maxTamano){
        var cantidadEspacios = i-1
        for (j in 1..cantidadEspacios){
            print(" ")
        }
        var numberOfStars2 = maxTamano - i + 1
        for (j in numberOfStars2 downTo 1){
            print("*")
        }
        println()
    }

    //la opcion de coursera
        for (i in 1 until 5) {
            val numberOfSpaces = 5 - i
            for (j in 1..numberOfSpaces) {
                print(" ")
            }
            val numberOfStars = i
            for (j in 1..numberOfStars) {
                print("*")
            }
            println()
        }
        for (i in 1..5) {
            val numberOfSpaces = i - 1
            for (j in 1..numberOfSpaces) {
                print(" ")
            }
            val numberOfStars = 6 - i
            for (j in 1..numberOfStars) {
                print("*")
            }
            println()
        }
}