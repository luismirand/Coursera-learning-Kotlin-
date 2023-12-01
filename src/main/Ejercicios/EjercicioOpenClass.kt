
//Ejercicio de Herencia Simple: Vehículos
//Crea una jerarquía de clases que represente diferentes tipos de vehículos, como automóviles y bicicletas.
// Define propiedades y métodos relacionados con cada tipo de vehículo.

open class Vehiculo(val marca: String, val modelo: String, val anio: Int){

    var encendido: Boolean = false

    open fun arrancar(){}

    override fun toString(): String{
        // forma de personalizar la representación de cadena de tus objetos para que sea más legible y útil cuando se utiliza en contextos de impresión y cadenas.
        return "${this.marca} ${this.modelo} ${this.anio}"
    }

}

class Auto(marca: String, modelo: String, anio: Int, val nDoors: Int, val typeFuel: String):Vehiculo(marca, modelo, anio){

    override fun arrancar() {
        println("Encendiendo ${toString()}...")
        encendido = true
    }

    override fun toString(): String {
        return super.toString() +" $nDoors puertas a $typeFuel"
    }

    fun isRunnnin(){
        val estado = if (encendido) "encendido" else "apagado"
        println("El ${toString()} está $estado")
    }
}

class Bicicleta(marca: String, modelo: String, anio: Int, val numSpeeds: Int): Vehiculo(marca, modelo, anio){
    /*override fun arrancar() {
        println("La ${toString()} está en moviemiento")
    }*/

    override fun toString(): String {
        return super.toString() + " con $numSpeeds velocidades"
    }
}


fun main() {
    val auto1 = Auto("Toyota", "Prius", 2013, 4, "Gas")
    auto1.arrancar()
    auto1.isRunnnin()
    println()
    val bici1 = Bicicleta("Toshiba", "Speed", 2017, 4)
    bici1.arrancar()
    println(bici1.toString())

    println("Detalles del auto: $auto1") // con el metodo toString solo necesitamos el nombre del objeto
    println("Detalles de la bicicleta: $bici1")


}