package oops.classandobject

//in the below call nameper & age are not the property of the class [namep and agep are property]
class per(nameper:String,age:Int){
    init {
        println("it is first initializer block of class per")
    }
    var namep=nameper; // here, not using primary constructor
    var agep=age;

    fun printV(){
        println("$namep and $agep")
    }

    init {
        println("it is the second initializer block of class per")
    }

}
fun main() {
    var obj1=per("saksham",68);
    obj1.printV()

}