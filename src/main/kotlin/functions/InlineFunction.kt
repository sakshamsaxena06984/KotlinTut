package functions

fun calculatingTime(fn:()->Unit){
    var start=System.currentTimeMillis();
    fn()
    var end=System.currentTimeMillis();
    var ans=end-start
    println("total time interval : $ans ms")
}

//Inline function for calculating time interval of any function execution
fun calculatingTime1(fn:()->Unit){
    var start=System.currentTimeMillis()
    fn()
    var end=System.currentTimeMillis()
    println("total time interval (inline function)  :  ${end-start} ms")
}
fun looping(n:Long){
    for(i in 1..n){

    }
}
fun main() {
    calculatingTime { looping(1000000) }
    calculatingTime1 { looping(1000000) }

}