package oops

//creating class of Car (name)
class Car(val name:String,var type:String,val kmrun:Int){
    fun driver(){
        println("driver function inside the car class");
    }
}
fun main() {
    //creating the object of Car class
    var mustang=Car("mustang","patrol",4500);
    println(mustang.name);  //using Dot operator
    mustang.driver();
}