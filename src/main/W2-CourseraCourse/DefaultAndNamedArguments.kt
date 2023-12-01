//DEFAULT ARGUMENTS

//fun openBrowser(url: String, incognitoMode: Boolean){
//    println("Opening $url" + if(incognitoMode) " in incognito mode" else "")
//}
//
//fun main() {
//    openBrowser("facebook.com", true)
//    openBrowser("google.com", false)
//}

//para aplicar un default argument, le das un valor a la variable

fun openBrowser(url: String, incognitoMode: Boolean = false){
    println("Opening $url" + if(incognitoMode) " in incognito mode" else "")
}

fun main() {
    println("Default Arguments con IF\n")

    openBrowser("facebook.com", true)
    openBrowser("google.com") //ahora no es necesario especificarle nada
    println()
    println("Default Arguments\n")

    cheer()
    cheer("eit")
    cheer("que onda", "raza")
    println()
    println("Named Arguments\n")
    cheer2()
    cheer2(how = "hi")
    cheer2(who = "mundoo")
    cheer2(how = "qola", who = "mundote")
    cheer2(who = "pa mi", how = "de mi")
}

//se pueden especificar los dos argumentos default

fun cheer(how: String = "Hello,", who: String = "World"){
    println("$how $who")
}


// NAMED ARGUMENTS

fun cheer2(how:String = "Hello0,", who: String ="World"){
    println("$how $who")
}


//The primary reason for using named arguments is to improve readability –
//you explicitly state what the meaning of an argument is when it might not
//be obvious to the person reading your code. The other reason to use it is when
//you want to specify arguments for parameters at further positions without specifying
//arguments for the earlier position. For example, when you call cheer(who = "Learner"),
//you specify who without specifying how.
