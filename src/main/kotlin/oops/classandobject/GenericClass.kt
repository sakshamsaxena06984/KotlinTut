package oops.classandobject

class Container<T>(var da:T){
    fun setValue(va:T){this.da=va}
    fun getValue():T{return this.da}
}
fun main() {
    // creating the object of Generic Class (Int) type
    var iContainer=Container<Int>(4)
    println("==== ${iContainer.getValue()}")

    // creating the object of Generic Class (String) type
    var iContainer1=Container<String>("skdnj")
    println("==== ${iContainer1.getValue()}")

}