


class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String
)

//fun main(){
//    //podemos usar named arguments
//    val pedroLopez =
//        Teacher(name = "Pedro", surname = "Lopez", birthday = "14/08/2003", status = "ACTIVE")
//    //o argumentos normales
//    val biology1 =
//        Subject("Biology 1", pedroLopez, true)
//    println(biology1.isObligatory)
//    println(biology1.teacher.birthday)
//    println(biology1.teacher.status)
//
//}

//ID PROPERTY

//The id property uniquely identifies a user.

//Let's say you have two users with the same name and surname, and one of them got a bad grade.
// If you associate this grade with the student's name and surname, it might be associated
// with the incorrect person. That's why you use student id instead. Because it's unique,
// you eliminate the risk of making a mistake.

class Student(
    val id:Int,
    val name: String,
    val surname:String,
)

class Grade(
    val points:Int,
    val studentId: Int,
    val topicId:Int
)

// implementando metodos a las clases
class Barista(
    val name: String,
){
    fun hacerCafe(type: String, size: Int = 4): cafe{
        println("AQUÍ NOMÁS CHAMBIANDO EN EL CAFÉ\n" +
                "Haciendo un $type de tamaño $size")
        return cafe(type, size)
    }

//se pueden llamar metodos dentro de otros metodos
    fun saludarYHacerCafe(type: String, size: Int){
        println("que onda papoi")
        hacerCafe(type, size)
    }
}

class cafe(
    type: String,
    size: Int
)

fun main() {
    val barista1: Barista = Barista("Pablo")
    //val cafe1:cafe = barista1.hacerCafe("chocolatada", 3)
    barista1.saludarYHacerCafe("latte", 2)



    //otras cosas de strings // cada una de los cambios es un nuevo string
    val text = "Este es un texto"
    val terre = "terreneitor"

    if (text.endsWith("texto")){
        println(text.replace("texto", terre))
    }
    //println(text.replace("un", "una"))

}


