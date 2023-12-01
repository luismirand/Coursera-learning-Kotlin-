/*Abstract classes

When you use the abstract keyword before a class definition, you make this class abstract. Abstract classes can be thought
of as a hybrid of an open class and an interface. There are two main consequences of making a class abstract:

---Abstract classes can have abstract methods or properties. Such elements are marked with an abstract modifier,
and they do not have a body. They are just definitions, similar to those in interfaces, that need to be overridden in subclasses.

---Abstract classes cannot be used to create objects. However, you can inherit subclasses from them.
This is a result of the first consequence - you cannot create objects with abstract methods or properties. Those need to be overridden.


You can use abstract classes as a replacement for interfaces, but this is considered a bad practice. Wherever possible,
the preference is to use interfaces. Each class can inherit from only one class but implement many interfaces.
Interfaces are considered to be an easier concept to learn compared to abstract classes. The key advantage of
abstract classes is that they can have non-open methods (on interfaces, all elements are open) and non-abstract properties.

Abstract classes are mainly used when you want to specify a set of generic operations for multiple classes.
Let's say that you write an application that draws various shapes in different ways. You might be drawing them on native Android components,
on websites, or on a terminal. Since you draw in different ways on each of those platforms, you need separate classes.
 */

//interfaz
interface I
{
    //val a: Int = 123 // ERROR! You cannot define non-abstract properties in Interfaces
}

abstract class ShapeDrawer {
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    internal abstract fun drawLine()
}
class AndroidShapeDrawer(): ShapeDrawer(){
    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for android platform")
    }
}
class DesktopShapeDrawer(): ShapeDrawer(){
    override fun drawLine() {
        println("Test code -Draw line for desktop platform")
    }
}

/*fun main(){
    val androidDrawer: ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer: ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawSquare()

}*/


/*  Interface
* All methods are open
* Methods and members are abstracted by default
* A class can implement one or more interface

    Abstract class
* Methods can be open or non open
* Methods and members can be abstract or non abstract
* A class can only be inherited from one class

*/


/*Cuando declaras un método o miembro como abstracto, estás indicando que todas las clases
que hereden de la clase abstracta deben proporcionar su propia implementación para ese método.
Esto permite crear una estructura jerárquica de clases donde las clases hijas deben completar
y personalizar la funcionalidad proporcionada por los métodos abstractos.*/


abstract class SomeAbstractClass {
    abstract fun abstractMethod()
    fun callAbstractTwice(){
        abstractMethod()// You can use abstract methods inside the class, because it is assumed
        abstractMethod()// they will be overridden in the child class.
    }

    class SomeRegularClass: SomeAbstractClass(){
        override fun abstractMethod() {
            println("Calling abstract method")
        }
    }
}

/*fun main(){
    val regular = SomeAbstractClass.SomeRegularClass()
    regular.abstractMethod()
    println()
    regular.callAbstractTwice()
}*/

//option 1

class AndroidShapeDrawerr {
    fun drawLn(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /**/
    }
    fun drawSquare(x: Int, y: Int, size: Int){
        /**/
    }
    fun drawRectangle(x:Int, y:Int, height: Int, width: Int){
        /**/
    }
}
class WebsiteShapeDrawer{
    fun drawLn(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /**/
    }
    fun drawSquare(x: Int, y: Int, size: Int){
        /**/
    }
    fun drawRectangle(x:Int, y:Int, height: Int, width: Int){
        /**/
    }
}

class TerminalShapeDrawer{
    fun drawLn(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /**/
    }
    fun drawSquare(x: Int, y: Int, size: Int){
        /**/
    }
    fun drawRectangle(x:Int, y:Int, height: Int, width: Int){
        /**/
    }
}

//option2
abstract class ShapeDrawerr{

    abstract fun drawLn(fromX: Int, fromY: Int, toX: Int, toY: Int)

    fun drawSquare(x: Int, y: Int, size: Int){
        drawLn(x, y, x + size, y)
        drawLn(x + size, y, x + size, y + size)
        drawLn(x, y, x, y + size)
        drawLn(x, y + size, x + size, y + size)
    }

    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        drawLn(x, y, x + width, y)
        drawLn(x + width, y, x + width, y + height)
        drawLn(x, y, x, y + height)
        drawLn(x, y + height, x + width, y + height)
    }
}

class AndroiddShapeDrawer: ShapeDrawerr(){
    override fun drawLn(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        TODO("Not yet implemented")
    }
}

class WebsiteeShapeDrawer: ShapeDrawer(){
    override fun drawLine() {
        TODO("Not yet implemented")
    }
}

class TerminallShapeDrawer: ShapeDrawer(){
    override fun drawLine() {
        TODO("Not yet implemented")
    }
}
// This is how abstract classes are used in practice
// - to share behavior for all its subclasses
// and allow subclasses to focus on their class-specific functionality.
/*fun main() {
    val wa: AndroiddShapeDrawer = AndroiddShapeDrawer()
}*/


open class Animaaaaal{
    fun eat(){}
}

class Perrooo:Animaaaaal(){
    fun play(){}
}

fun main() {
    val perrito:Animaaaaal = Perrooo()
    perrito.eat()

    val perro2: Perrooo = Perrooo()
    perro2.play()
    perro2.eat()



}


