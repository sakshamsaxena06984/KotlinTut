package others

fun add(vararg values:Int){
    var sum=0
    for(i: Int in values) sum+=i

    println("sum of values $sum")
}
fun main() {
    //calling function via using vararg keyword
    add(11,2,4,5,6,7)
}