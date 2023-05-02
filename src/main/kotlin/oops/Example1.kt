package oops

open class Phone(val type:String){
    init {
        println("parameter in parent class $type")
    }
    open var name_parent:String="parent_phone"
    open fun display()= println("parent_class_display_function")
}
class Oneplus(typeparm:String):Phone(typeparm){
    init {
        println("parameter in child class $typeparm")
    }
    override var name_parent: String="child_phone"
    override fun display() = println("child_class_display_function")
}
fun main() {
    //it is parent class
    var Obj_parent=Phone("Anaconda")
    println("calling parent class ${Obj_parent.name_parent}")
    Obj_parent.display()

    //it is child class
    var Obj_child=Oneplus("Anaconda_Child")
    println("calling child class ${Obj_child.name_parent}")
    Obj_child.display()




}