package basic
// declaration of function
fun add(num1:Int,num2:Int):Int{
    return (num1+num2)
}
///***************************  will check, return type of Unit
fun evenodd(num1:Int): String {
    var ans=if(num1%2==0) "even number" else "odd number"
    return ans

}
//inline function
fun stringconcate(a:String,b:String):String =a+b

fun stringconcate1(a:String,b:String) =a+b
fun main(){
    var resultSum=add(1,5)
    println(resultSum)

    println(stringconcate("first","second"))
    println(stringconcate1("first","second"))



}
