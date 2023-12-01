fun main() {
    /*while(true){
        println("Will be printed FOREVER")
    }*/

    var toBePrinted = true
    while (toBePrinted){
        println("Will be printed once")
        toBePrinted = false
    }

    var printedTimes = 0
    while (printedTimes <= 2){
        println("Line $printedTimes")
        printedTimes += 1
    }
    var num = 0
    while ( num <100){
        print("$num ")
        num += 7
    }
    println()
    var num2 = 1
    while (num2 <= 100) {
        print("$num2 ")
        num2 *= 2 // or num2 += num2
    }
    println()
    var i = 1
    while (i * i<= 100){
        print("${i * i} ")
        i++
    }
    println()



}
