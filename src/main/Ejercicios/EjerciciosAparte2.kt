fun main() {
    ejercicio1()
    //ejercicio2()
}

fun ejercicio1 (){
    /*Escriba un programa que pida dos números enteros y
    escriba qué números son pares y cuáles impares desde el primero hasta el segundo.*/
    println("Dame un numero")
    val num1 = readln().toInt()
    println("Dame otro numero")
    val num2 = readln().toInt()

    if(num2 >= num1){
        for (i in num1..num2){
            if (i%2 == 0){
                println("El numero $i es par")
            }else{
                println("El numero $i es impar")
            }
        }
    }else{
        println("Porfavor dame un numero mayor o igual que $num1")
    }
}

fun ejercicio2(){
    /*Escriba un programa que pida un número entero mayor que cero y que escriba sus divisores.*/

    do{
        print("Dame un numero: ")
        var num1 = readln().toInt()

        if (num1 > 0){
            println("Los divisores de $num1 son: ")
            for (i in 1..num1){
                if (num1%i == 0){
                    println("$i ")
                }
            }

        }else{
            println("El $num1 no es valido. Porfavor dame un numero mayor que 0")
        }
        println("Quieres intentarlo otra vez? si/no ")
        var continuar = readln().toString()
        continuar =  continuar.lowercase()
    }while(continuar == "si")
}

fun ejercicio3(){
    //un programa que encuentre el minimo comun multiplo de n cantidad de numeros
    //hacer otro que enceuntre el minimo comun divisor de n cantidad de numeros
}
