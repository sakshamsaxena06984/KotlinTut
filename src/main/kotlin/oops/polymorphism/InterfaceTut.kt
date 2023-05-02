package oops.polymorphism

interface Draggable{
    fun dagFun()
}

class SubDrag():Draggable{
    override fun dagFun() {
       println("It is the first child class of Draggable Interface!!")
    }

}
fun main() {
    println("It is main class!")
    var a:SubDrag=SubDrag();
    a.dagFun()
}