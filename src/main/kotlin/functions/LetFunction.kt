package functions

data class emp1(var id:Int,var na:String)

fun main() {
    var ob=emp1(55,"snd")
    println("normal way of printing object : ${ob.id}  -- ${ob.na}")


    ///now, will use let function for printing the object
    ob.let {
        println("${it.id} id value via let function")
        println("${it.na} na value via let function")
    }
}