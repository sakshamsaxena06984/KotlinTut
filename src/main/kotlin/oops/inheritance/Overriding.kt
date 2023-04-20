package oops.inheritance

open class Moble(){
    open var name:String=""
    var num:Int=5
    open fun fun1(){
        println("it is parent function!")
    }

}
class OnePlus:Moble(){
    override var name: String="OnePlus"
    override fun fun1() {
        println("it is the child class function!")
    }

}
fun main() {
   var obj=OnePlus()
    println("name variable value via child class object : ${obj.name}")
    obj.fun1()
}