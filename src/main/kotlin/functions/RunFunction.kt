package functions
data class emp3(var id:Int,var n:String)
fun main() {
    var obj=emp3(1,"mcmsnj")
    println("-- ${obj.id}    ||  ${obj.n}")

    //now, will use the run function
    obj.run {
        id=66
        n="snjs"
    }
    println("-- ${obj.id}    ||  ${obj.n}")

}