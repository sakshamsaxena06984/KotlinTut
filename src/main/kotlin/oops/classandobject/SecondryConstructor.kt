package oops.classandobject

class Autocar(var namecar:String,var type:String,var wheel:Int,var powereng:Boolean){

    constructor(namecar: String,powereng:Boolean):
    this(namecar,"Ss",4,powereng)

    fun info(){
        println("all properties : $namecar - $type - $wheel - $powereng")
    }
}
fun main() {
    var obj1=Autocar("ksk",true);
    obj1.info()
}