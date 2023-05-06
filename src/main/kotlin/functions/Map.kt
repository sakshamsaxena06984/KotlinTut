package functions

data class u2(var id:Int,var n:String,var t:String)
data class u1(var id:Int,var n:String)
fun main() {
    var arr= arrayOf(1,2,3,4,5)
    var square_arr=arr.map { it*it }
    println(square_arr)
    var u1_obj= listOf<u1>(
        u1(1,"a"),
        u1(2,"b"),
        u1(3,"c")
    )

    var u2=u1_obj.map { u2(it.id,it.n,"skd") }
    println(u2)




}