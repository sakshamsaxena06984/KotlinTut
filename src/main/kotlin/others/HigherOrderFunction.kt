package others

/**
 * higher-order-function: function that can accept function as an argument and can return function
 */

fun sum1(a:Double,b:Double):Double{return a+b}
fun calculator(a:Double,b:Double,gn:(Double,Double)->Double):Double{
    var ans= gn(a,b);
    return ans;
}
fun main() {
    //now, calling higher order function
    println("sum of two number by calling higher order function : ${calculator(2.1,3.4,::sum)}")
}