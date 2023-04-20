package oops.inheritance

open class Moble1(var nameM:String){
    open var name:String=nameM
    var num:Int=5
    open fun fun1(){
        println("it is parent function! $name")
    }

}
class OnePlus1(nameMtype:String):Moble1(nameMtype){
    override var name: String="OnePlus"
    override fun fun1() {
        println("it is the child class function! $name")
    }
    //now, will override the toString methode of ANY class
    override fun toString(): String {
        return "overrided toString methode of super class Any"
    }

}
fun main() {
    var obj=OnePlus1("helloMoto")
    println("name variable value via child class object : ${obj.name}")
    obj.fun1()
    println(obj.toString())

    var obj1=Moble1("kkkk")
    obj1.fun1()

}