
//private para que solo pueda ser usada dentro de su scope ( en este caso la clase)
// el scope maximo de private es un solo archivo, fuera de el ya no puede ser accesado

class BankAccount(){
    private var balance = 0.0
    fun deposit(amount: Double){
        balance += amount
    }
    fun withdraw(amount: Double){
        if (balance < amount){
            println("Not enough money")
        }else{
            balance -= amount
        }
    }
    fun checkBalance(){
        println("Your total balance is $balance")
    }
}

/*fun main(){
    val cuenta:BankAccount = BankAccount()
    cuenta.deposit(500.0)
    //cuenta.balance += 5000.0 // no se puede usar este, solo dentro de la clase
    cuenta.checkBalance()
    cuenta.withdraw(4000.0)
    cuenta.checkBalance()
}*/

//protected is only used inside classes that are open or abstract

open class Ship{
    protected var milesPassed = 0.0 // no es private porque si no, no podria ser usada en una clase hijo

    fun printMilesPassed() {
        println(milesPassed)
    }
}

class ElectricShip: Ship(){
    fun swimUsingEngine(distance: Double){
        milesPassed += distance
    }
}

/*fun main(){
    val ship = ElectricShip()
    ship.swimUsingEngine(10.0)
    ship.printMilesPassed()
    // ship.milesPassed //no puede ser accesado
}*/

//internal, modifies an element to be visible throughout the same module
// normalmente usado en librerias, por lo que no es usado normalmente en proyectos propios, si no mas bien en codigo de alguien mas
internal fun add(a: Int, b: Int): Int{
    return a + b
}

// puede ser accesado en el mismo archivo
private var propiedad = 1

fun si(){
    propiedad += 2
}

internal var propiedadd = 4





