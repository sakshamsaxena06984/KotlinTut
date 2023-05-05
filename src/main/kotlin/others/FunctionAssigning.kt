package others

fun sum(a:Double,b:Double):Double{return a+b}
fun main() {
    var fn:(a:Double,b:Double)-> Double=::sum
    println("calling function with help of assigned variable : ${fn(3.1,5.1)}")

}