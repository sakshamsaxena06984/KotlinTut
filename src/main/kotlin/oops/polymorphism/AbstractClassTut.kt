package oops.polymorphism

import java.util.Objects

//it is interface of Dragable
interface Dragable{
    fun dragg()
}
//abstract class Shape:
abstract class Shape1: Dragable {
     abstract fun area1():Double
}

class Circle1(var radius:Double):Shape1(){
    override fun area1(): Double {
       return Math.PI*radius*radius;
    }

    override fun dragg() {
        println("area of circle ${area1()}")
    }

}

class Square1(val side:Double):Shape1(){
    override fun area1(): Double {
        return side*side;
    }

    override fun dragg() {
        println("area of square ${area1()}")
    }

}
class Triangle(val base:Double,val height:Double):Shape1(){
    override fun area1(): Double {
       return ((1/2)*base*height)
    }

    override fun dragg() {
      println("area of triangle ${area1()}")
    }

}

//player class
class Player(var ans:String):Shape1(){
    override fun area1(): Double {
        TODO("Not yet implemented")
    }

    override fun dragg() {
        println("printing for the PLAYER class!!!!!!!!!!!!")
    }

}

//make it generic function
fun dragObject(objects:Array<Dragable>){
    for (obj in objects){
        obj.dragg()
    }
}
fun main() {


  dragObject(arrayOf(Circle1(4.0),Square1(4.0),Triangle(1.2,3.2),Player("Hello World!")))








}