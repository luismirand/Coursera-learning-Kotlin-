fun main() {
    //    If your text contains multiple lines, it is also
    //    possible to define this in a String variable in Kotlin by delimiting the
    //    text with triple quotes.
    val myString = """ola como estan mis amigos del 
        ejirireofjjlhdfshjfladskjhga 
        kljdsflkjsdakljadlkfjafskl
    """.trimMargin()

    println(myString)

//    String template
    val age = 70
    val myString2 = "My age is $age" //My age is 70
//    Converting a Char to a String
    val myChar:Char = 'a'
    val myString3: String = myChar.toString()

//    Appending to a String
    var myString4 = "Hello"
    //myString4 is still Hello after this operation.
    val myLongString = myString4 + " guorld"
    println(myLongString)
    // myString4 Will be changed to Hello World after this operation.
    myString4 += " World"
    println(myString4)

    var s1 = "Hello"
    var s2 = s1
    println(s1)
    println(s2)
    s1 += " Mundo"
    println(s1)
    println(s2)

//    Checking the length of a String
    val myStriing = "Hell00 " //si añadimos espacios tambien los cuenta
    val myStringLength = myStriing.length
    println(myStriing)
    println(myStringLength)

//    Searching Strings
    val Stringg = "holap"
    val startsWith = Stringg.startsWith("ho")
    println(startsWith) //regresa true si empieza en ho
    val endsWith = Stringg.endsWith("lap")
    println(startsWith)//regresa true si termina en lap

//   Get the first character
    val myNewString = "hola mundo como estan"
    val firstChar = myNewString.first()
    println(firstChar) //prints the first character
    val lastChar = myNewString.last()
    println(lastChar) //prints the last character
    val equalsHello = myNewString.equals("Hello")
    println(equalsHello)//prints true if the string is equal to "Hello"

// Manipulating Strings
    //Convert the String to uppercase
    val myUpperString = myNewString.uppercase()
    println(myUpperString)
    //Convert the String to lowercase
    val myLowerString = myNewString.lowercase()
    println(myLowerString)
    val myCapitalizedString = myNewString.capitalize()
    println(myCapitalizedString)
    //Get all characters from the second character onwards
    val myCadena = "HOLA"
    val mySegundaCadena = myCadena.substring(1)
    println(mySegundaCadena) // prints "OLA" imprime desde el caracter dicho

    // The strings are immutable. It means that when you use a function that
    // manipulates the String, it actually returns a new String instance
    val s = "hola mundo"
    println(s[0])
}