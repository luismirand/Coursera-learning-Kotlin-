fun main() {
    println("CALCULADORA DE MÍNIMO COMÚN MULTIPLO")
    print("Dame un número: ")
    val n1 = readln().toInt()
    print("Dame otro número: ")
    val n2 = readln().toInt()


    /*if (n1 >= n2){
        var multis: Array<String>
        var res: Array<Int>
        var multis2: Array<String>
        var res2: Array<Int>

            for (i in 0..n1){
                //println("$n2 x $i = ${n2*i}")
                multis[i] = "$n2 x $i"
            }
            for (j in 1..(n2+1)){
                println("$n1 x $j = ${n1*j}")
            }
            for (i in multis){
                println(i)
            }

    }else{
        println("sorry")
    }*/
    if (n1 >= n2) {
        val multis = Array(n1 + 1) { "" }
        val res = Array(n1 + 1) { 0 }
        val multis2 = Array(n1 + 1) { "" }

        for (i in 0..n1) {
            multis[i] = "$n2 x $i = ${n2 * i}"
        }

        for (number in multis){
            println(number)
        }

        for (j in 1..(n2+1)) {
            println("$n1 x $j = ${n1 * j}")
        }


    } else {
        println("sorry")
    }
//en proceso, luego lo hago


}