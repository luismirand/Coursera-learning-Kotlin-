/*
open class Mammal{
    fun feedChildren(){}
}

open class Dogg(val breed: String): Mammal(){ //lo hacemos subclase de mammal
    fun fetchStick(){} //creamos sus propios metodos
}

class Labrador(val name: String):
    Dogg("Labrador Retriever")//necesitamos darle valor a las variables del padre

fun feedd(mammal: Mammal){
    mammal.feedChildren()
}

fun main() {
    val perro1 = Labrador("Rex")
    perro1.feedChildren() //el objeto dog puede usar los metodos de mammal
    perro1.fetchStick() //y sus propios metodos
    feedd(perro1) // y puede usarse en el lugar como si fuera un mammal

    val lab = Labrador("Juan")
    println(lab.name)
    println(lab.breed)
}*/

//opcion 1 para usar el mismo parametro (name) en una subclase

/*open class Doog(open val name: String)

class Labrador(override val name: String): Doog(name)

fun main(){
    val lab = Labrador("Coco")
    println(lab.name)
}*/

//opcion 2 para usar el mismo parametro (name) en una subclase
//es lo mismo y mas facil que el de arriba
// no es necesario el override ni nada

open class Doggy(val name: String)

class Labradorr(name: String): Doggy(name)

fun main() {
    val lab = Labradorr("Coco")
    println(lab.name)
}

