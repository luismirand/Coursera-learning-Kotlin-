import java.lang.NumberFormatException

fun main(){
    ///////////////////////////////////////////////////////////////////////
    try {
        val numer = "ABC".toInt()
        println(numer)
        println("Dentro de Try")
    }catch (t: Throwable){ //SOLO FUNCIONA EL CATCH DEBIDO A QUE HUBO UN ERROR
        println("Caught")
        println("${t.message}") //dice el error en que linea
        println(t) //dice el tipo de error
        t.printStackTrace() //donde ha pasado
    }
    println("Listo")
    println()

///////////////////////////////////////////////////////////////////////
    try {   //SOLO FUNCIONA EL TRY YA QUE NO HUBO ERRORES
        val numer = "123".toInt()
        println(numer)
    }catch (t: Throwable){
        println("Caught")
    }
    println("Listo2")
    println()
///////////////////////////////////////////////////////////////////////
    try {
        val numer = "ABC".toInt()
        println(numer)
    }catch (t: NumberFormatException){ //Especificamos que tipo de error queremos atrapar
        println("Caught con numberformat")              // en este caso errores de tipo integer
    }
    println("Listo 3")
    println()
    ///////////////////////////////////////////////////////////////////////

    try {
        val numer = "ABC".toInt()
        println(numer)
    }catch (t: ArithmeticException){ // se pueden usar multiples catch
        println("Caught ArithmeticException")
    } catch (t: NumberFormatException){
        println("Caught NumberFormatException ")
    }
    println("Listo 4")
    println()

    // Throwable es un supertipo de todas las excepciones, asi que atrapa todos lo errores
    //hay una jerarquia de excepciones
    //t es una variable de referencia que guarda la excepcion


}