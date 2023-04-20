package oops.classandobject

class pl(){
    lateinit var namek:String;
    init {
        println("in this class, we are using lateinit functionality!!")
    }
    fun pro(){
        namek="lateinit variable";
        println("properties ::::::::::::  $namek")

    }
}
fun main() {
    var ob=pl();
    ob.pro()

}