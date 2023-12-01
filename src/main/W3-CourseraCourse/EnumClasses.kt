
fun payWithCash(amount: Double): Boolean{
    return true
}

fun payWithCard(amount: Double): Boolean{
    return true
}

fun payWithCheck(amount: Double): Boolean{
    return true
}

fun pay(amount: Double, method: PaymentMethod): Boolean {
    return when(method){
        PaymentMethod.CASH -> payWithCash(amount)
        PaymentMethod.CHECK -> payWithCheck(amount)
        PaymentMethod.CARD -> payWithCard(amount)
    }
}

enum class PaymentMethod{
    CASH,
    CARD,
    CHECK
}

fun main(){
    val success = pay(200.0, PaymentMethod.CARD)
    println("Success: $success" )  //Success: true

    println(PaymentMethod.CARD) //CARD

    println(PaymentMethod.CASH.ordinal) //0
    println(PaymentMethod.CARD.ordinal) //1
    println(PaymentMethod.CHECK.ordinal) //2


    for(method in PaymentMethod.values()){
        println("At ${method.ordinal} there is $method")
    }

    val string1 = "CASH"
    val method = PaymentMethod.valueOf(string1)
    println(method)
    val string2: String = method.name
    println(string2)
}