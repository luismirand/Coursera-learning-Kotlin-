fun main() {

    /*Reto #6 - Edad permitida
Pide al usuario que ingrese su edad y mostrarás un mensaje correspondiente si esta coincide con las siguientes condiciones:
Más de 30 años: Nunca es tarde para aprender ¿Qué curso tomaremos?
Entre 29 y 18 años: Es un momento excelente para impulsar tu carrera.
Menos de 18 años: ¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte.*/

    /*println("cual es tu edad?")
    val edad = readLine()!!.toInt()

    when{
        edad > 30 -> println("Con $edad Nunca es tarde para aprender ¿Qué curso tomaremos?")
        edad in 18..29 -> println("Con $edad Es un momento excelente para impulsar tu carrera. ")
        edad <18 -> println("Con $edad ¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte")
    }*/


    /*Reto #5 - ¿Cómo está el clima?
Crea un programa que pregunte al usuario si está lloviendo, en caso de responder “sí” pregunta si está
haciendo mucho viento y si responde “sí” nuevamente muestra un mensaje indicando que hace mucho viento para
salir con una sombrilla. En caso contrario, anima al usuario a que lleve una sombrilla.
Para el caso de responder “no” en la primer pregunta, entonces solo desea un bonito día.
Considera que las respuestas pueden pasarse a minúsculas para evitar posibles errores.*/

    /*println("Esta lloviendo?")
    var isRaining = readLine()!!.toString()
    isRaining = isRaining.lowercase()

    if(isRaining == "si"){
        println("Esta haciendo mucho viento?")
        var isWindy = readln()!!.toString()
        isWindy = isWindy.lowercase()
        if (isWindy == "si"){
            println("hace mucho viento para salir con una sombrilla")
        } else{
            println("Llevate una sombrilla pa")
        }
    }else{
        println("Ah bueno te me cuidas")
    }*/

    /*Reto #1 - Número mayor y menor
Escribe un programa que pida al usuario 2 números, mostrando como salida cuál es el número mayor y la diferencia
 de uno respecto al otro. En caso de que los números sean iguales, mostrarlo también en pantalla.*/

    /*println("DAME UN NUMERO")
    val num1 = readln().toInt()
    println("DAME OTRO NUMERO")
    val num2 = readLine()!!.toInt()

    val numMayor = if (num1 > num2)
        "El numero mayor es: $num1"
    else if (num1 == num2)
        "Los numeros son iguales $num1 y $num2"
    else
        "El numero mayor es: $num2"
    println(numMayor)
    val dif = Math.abs(num1 - num2)
    println("La diferencia entre los numeros es: $dif")*/


    /*Reto #2 - En el rango, por favor.
Pide al usuario que indique 2 números: uno que servirá como límite y otro para comparar.
Si el segundo número es menor al primero, mostrarás un mensaje diciendo “El número ‘x’ se encuentra en el rango, gracias”
y en caso contrario dirá “El número ‘x’ excede el límite permitido”.*/

    

}