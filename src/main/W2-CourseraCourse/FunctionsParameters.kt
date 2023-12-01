fun main() {
    val valor =5
    println("Ascending Triangle")
    ascendingTriangle(valor)

    println("Descending Triangle")
    descendingTriangle(valor)

    println("Isosceles Triangle")
    isoscelesTriangle(valor)
    println()
}

fun printStars(num: Int){
    for(i in 1..num){
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int){
    for (stars in 1..height){
        printStars(stars)
    }
}

fun descendingTriangle(height: Int){
    for (stars in height downTo 1){
        printStars(stars)
    }
}

fun isoscelesTriangle(width: Int){
    ascendingTriangle(width-1)
    //println() //para ver a diferencia
    descendingTriangle(width)
}