package oops.classandobject


class Outer1{
    var i=4

    fun test1(){
        println("it is the Outer Class")
    }

    inner class Inner1(){
        fun test2(){
            println("it is the Inner Class")
        }
    }
}
fun main() {
    //way of creating the object of the Inner class
    var obj=Outer1().Inner1()
    obj.test2()
}