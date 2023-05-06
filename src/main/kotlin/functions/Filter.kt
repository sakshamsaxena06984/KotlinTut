package functions

fun nOdd(num:Int):Boolean{
    return num%2==0
}
private data class user1(var id:Int,var name:String)
fun main() {
    var arr= arrayOf(1,2,3,4,5)
    var ans=arr.filter(::nOdd)
    println(ans)

    var ans1=arr.filter({a:Int->a%2!=0})
    println(ans1)

    //creating the object of user1 class
    var user1List= listOf<user1>(
        user1(1,"jsn"),
        user1(2,"smdks"),
        user1(3,"skd"),
        user1(4,"sdjs")
    )
    var user1filter=user1List.filter({it.id%2==0})
    println(user1filter)
}