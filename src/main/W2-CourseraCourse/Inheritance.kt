//CLASS INHERITANCE
// define a class that extend from another class and introduces some modifications to the beahavior
// The class must be open (there must be an open modifier)

open class Drone{
    open val look = "Black and White"

    open fun setOff(){
        move(0.0, 10.0, 0.0)
    }
    open fun move(front:Double, up: Double, rotate: Double){
        println("Moving $front, $up, $rotate")
    }
}

class SuperheroDrone(): Drone(){
    override val look: String = "Superhero look"

    override fun setOff(){
        move(0.0, 15.0, 0.0)
    }

    override fun move(front: Double, up: Double, rotate: Double) {
        println("Superhero is moving")
        super.move(front, up, rotate) //llamamos a la funcion original del padre
    }
}


fun main() {
    //clase hijo
    val drone1: Drone = SuperheroDrone()
    println(drone1.look)
    drone1.move(0.0, 0.0, 0.1)
    drone1.setOff()
    println()
    //clase padre
    val drone2: Drone = Drone()
    println(drone2.look)
    drone2.move(0.0, 0.0, 0.1)
    drone2.setOff()


}