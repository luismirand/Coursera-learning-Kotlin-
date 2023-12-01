

interface InstrumentoMusical{
    fun tocar() //es el unico que modificamos individualmente debido a que c/u es diferente
    fun afinar()
}

abstract class InstrumentoAfinable(val marca: String, val modelo: String): InstrumentoMusical{

    open fun reemplazarCuerdas() { // lo hacemos open para que cualquier clase pueda modificarlp
        println("Remplazando cuerdas de ${this.javaClass.simpleName.toLowerCase()}...")
    }

    override fun afinar(){ // no es necesario hacerlo open, porq es obligatorio que todas las clases lo tengas
        println("Afinando ${this.javaClass.simpleName.toLowerCase()}...")
    }
    /*val afinar: () -> String ={
        "Afinando el ${this.javaClass.simpleName.toLowerCase()}..."
    }*/ //es una manera de hacer mas complicado, pero solo funciona para la guitarra

}

class Guitarra(marca:String, modelo: String): InstrumentoAfinable(marca, modelo){

    /*override fun afinar(): String {
        println(afinar.invoke().replace("el", "la"))
        return afinar.invoke().replace("el", "la")

    }*/ // lo mismo de arriba
    override fun reemplazarCuerdas() {
        println("cambiandole el cuerdas a la ${this.marca} ${this.modelo}")
    }

    override fun tocar() {
        println("suena un solo mamalon de los AM")
    }


}

class Violin(marca:String, modelo: String): InstrumentoAfinable(marca, modelo) {

    override fun tocar() {
        println("suena la de aca violin")
    }

    override fun afinar() {
        println("pepe")
    }


}


class Piano(marca:String, modelo: String): InstrumentoAfinable(marca, modelo){

    override fun tocar() {
        println("suena la Fur Elise")
    }


}

fun main() {
    val g1 = Guitarra("Fender", "Strato")
    val p1 = Piano("Kawasaki", "F1")
    val v1 = Violin("Rus", "Van2")

    g1.afinar()
    g1.tocar()
    g1.reemplazarCuerdas()
    println()
    p1.afinar()
    p1.tocar()
    p1.reemplazarCuerdas()
    println()
    v1.afinar()
    v1.tocar()
    v1.reemplazarCuerdas()

}

