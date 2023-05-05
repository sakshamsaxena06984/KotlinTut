package oops.classandobject

private class Person(var nameP:String,var age:Int){
    fun canVote():Boolean{
        return age>18;
    }
}
fun main() {
    //some inbuilt function
    var i: Int=5;
    println(i.plus(20))

    //creating object and checking canVote function
    var obj=Person("Saksham",24);
    println("${obj.nameP} can voted : ${obj.canVote()}")

}