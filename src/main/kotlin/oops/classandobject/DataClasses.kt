package oops.classandobject

//it is data class
data class Person1(val id:Int,val name:String){

}

fun main() {
    var p1=Person1(1,"jhon")
    var p2=Person1(1,"jhon")
    var p3=p1.copy(id=1)
    println("p1 class properties ${p1.id} & ${p1.name}")
    val(id,name)=p3
    println("name ---> $id")
}