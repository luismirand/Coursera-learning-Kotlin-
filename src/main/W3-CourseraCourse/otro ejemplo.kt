/*

data class Studenta(val fullName: String, var id: Int,var grade:Double)

val students = listOf<Studenta>(
    Studenta("John", 223,140.0),
    Studenta("Mark", 548,120.0),
    Studenta("Natali", 342,150.0),
    Studenta("Sara", 781,130.0)
)


fun main() {
//    step 4
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println( getStudentById(id))
    println("Please, Enter the student's name")
    val name= readln()
    println(searchInStudents(name)?:"the student is not found")
}
//step 2
    fun getStudentById(id:Int):Studenta{
    return  students.find { it.id==id }!!
}
//step 3
fun searchInStudents(name:String):Studenta?{
    return students.find { it.fullName.lowercase()==name.lowercase()}
}
*/
