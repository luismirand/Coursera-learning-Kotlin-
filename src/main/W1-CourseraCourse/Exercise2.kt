fun main() {
    val weekday = "Friday"

    println()
    var hours = when (weekday) {
        "Monday" -> "8:00 - 12:00"
        "Tuesday" -> "8:00 - 18:00"
        "Wednesday" -> "8:00 - 18:00"
        "Thursday" -> "8:00 - 18:00"
        "Friday" -> "8:00 - 21:00"
        "Saturday" -> "9:00 - 16:00"
        "Sunday" -> "8:00 - 16:00"
        else -> "Weekday no valid"
    }
    println("On $weekday, the opening hours are: $hours")

    val hour= 20
   /* val isOpen: Boolean = when(weekday){
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday" -> hour >= 8 && hour <= 18
        "Wednesday" -> hour >= 8 && hour <= 18
        "Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }*/

    /*
    val isOpen = when (weekday) {
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday", "Wednesday", "Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }*/
    // cualquiera de las tres maneras funciona
     val isOpen: Boolean = when(weekday){
        "Monday" -> hour in 8..12
        "Tuesday" -> hour in 8..18
        "Wednesday" ->  hour in 8..18
        "Thursday" ->  hour in 8..18
        "Friday" ->  hour in 8..21
        "Saturday" ->  hour in 9..16
        "Sunday" ->  hour in 8..16
        else -> false
    }

    if(isOpen){
        println("Little Lemon is Open")
    } else{
        println("Little Lemon is closed Now")
    }


}