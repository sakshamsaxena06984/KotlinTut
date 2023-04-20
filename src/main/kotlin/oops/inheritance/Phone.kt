package oops.inheritance

open class Phone(){
   var parent_class:String="it is parent class";
    fun parentF(){
        println("it is parent class FUNCTION! : $parent_class")
    }
}
class smart_phone:Phone(){
    var child_class:String="it is child class"
    fun childF(){
        println("it is child class FUNCTION! : $child_class")
    }

}
fun main() {
    var obj_child=smart_phone()
    obj_child.parentF()  // calling of parent class function
    obj_child.childF()   // calling of child class function
}