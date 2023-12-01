
fun getsPoints(basePoints:Int, boostS:Int): Int {
    return basePoints * boostS
}

fun main(){
    var score=0
    println(score)
    score += getsPoints(10,1)
    println(score)
    score += getsPoints(20,2)
    println(score)
    score += getsPoints(-10,1)
    println(score)
    score += getsPoints(5,3)
    println(score)
    score += getsPoints(-15,2)
    println(score)
}