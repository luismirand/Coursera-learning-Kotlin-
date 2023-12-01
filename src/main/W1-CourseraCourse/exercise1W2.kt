fun main() {
//    Task1
    println(123 + 456 * 789)
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    println(13530.0 / 1.23)
//    Task2
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86
    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val avergeScore = totalScore / 3
    println("The total Score is $totalScore")
    println("The average Score is $avergeScore")
//    Task3
    val boostMultiplier = 4
    val scoreBoost = boostMultiplier * totalScore
    val finalBoostedScore = totalScore + scoreBoost
    println(scoreBoost)
    println(finalBoostedScore)

}