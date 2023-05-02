package oops.polymorphism

interface Dragging1{
    fun dragging1()
}
abstract class Shape2():Dragging1{
    abstract fun area2():Double
}

class Circle2(var r:Double):Shape2(){
    override fun area2():Double=Math.PI*r*r
    override fun dragging1()= println("it is circle class!!!!!!!!!")
}
class Player2():Dragging1{
    override fun dragging1() {
        println("it is the player class")
    }
}

fun main() {
    var cir1=Circle2(4.1)
    var pla1=Player2()
    if(cir1 is Circle2){
        println("cir1 is the Circle class object !!!!!!!!!!!!!")
    }
    //=====================
    val ar:Array<Dragging1> = arrayOf(cir1,pla1)
    for(obj in ar){
        if(obj is Circle2){
            println(obj.area2())
        }
        else{
            (obj as Player2).dragging1()
        }
    }
}