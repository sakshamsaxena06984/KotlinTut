package oops.classandobject

class Outer{
    var i:Int=0;

    class Inner{
        fun test(){
            println("It is the Inner Class")
        }
    }

    fun test1(){
        println("it is the Outer Class")
    }

}

fun main() {
    var obj1=Outer()
    println(obj1.test1())


    // now, creating the inner class object
    var obj2=Outer.Inner()
    obj2.test()
}