
class Player(
    val name: String,
    val surName: String
){
    var totalScore = 0
    var personalBestScore = 0

    fun fullName(): String{
        return "$name $surName"
    }
}

class Scores(){
    fun checkBest(current: Int, best: Int): Int{
        if (current > best){
            return current
        }
        return best
    }
}


fun main(){
    println("//////Juego de ver quien le pone mas grande el numero////// \n")
    println("nombre del J1: ")
    val nombreP1 = readln().toString()
    println("apellido del J1:")
    val apellidoP1 = readln().toString()

    val P1: Player = Player(nombreP1, apellidoP1)

    println("\nnombre del J2: ")
    val nombreP2 = readln().toString()
    println("apellido del J2:")
    val apellidoP2 = readln().toString()

    val P2: Player = Player(nombreP2, apellidoP2)

//    val P1: Player = Player("Nicola", "Tesla")
//    val P2: Player = Player("Thomas", "Edison")
//    println(P1.fullName())
//    println(P2.fullName())

    do{
        P1.totalScore = 0
        P2.totalScore = 0
    println("\n----Jugando ahora mismo----\n" +
            "${P1.fullName()} y ${P2.fullName()} \n")
    var continuePlaying: String

    val scoring = Scores()
    var lvlScoreP1 = 0
    var lvlScoreP2 = 0

    println("Cuantas veces quieren jugar? ")
    val veces = readln().toInt()

    for (i in 1..veces){
        println("\nNIVEL $i")
        println("\nPuntaje del J1: ")
        lvlScoreP1 = readln().toInt()

        println("\nPuntaje del J2:")
        lvlScoreP2 = readln().toInt()

        P1.totalScore += lvlScoreP1
        P1.personalBestScore = scoring.checkBest(current = lvlScoreP1, best = P1.personalBestScore)

        P2.totalScore += lvlScoreP2
        P2.personalBestScore = scoring.checkBest(current = lvlScoreP2, best = P2.personalBestScore)
    }
    println("\nJUEGO FINALIZADO\n")

    when{
        P1.totalScore > P2.totalScore -> {
            println("El ganador es ${P1.fullName()} con un Score de ${P1.totalScore}")
            println("Su record personal es ${P1.personalBestScore}")
        }
        P2.totalScore > P1.totalScore -> {
            println("El ganador es ${P2.fullName()} con un Score de ${P2.totalScore}")
            println("Su record personal es ${P2.personalBestScore}")
        }
        P1.totalScore == P2.totalScore -> {
            println("Hubo un empate entre ${P1.fullName()} y ${P2.fullName()} con un Score de ${P1.totalScore}")
        }
    }
        println("\nQuieren volver a jugar? si/no")
        continuePlaying = readln().toString().lowercase()
    } while (continuePlaying == "si")

}