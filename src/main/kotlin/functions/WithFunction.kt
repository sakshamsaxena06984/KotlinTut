package functions

data class emp2(var id:Int,var n:String)
fun main() {
    var ob=emp2(5,"ksnjs")
    println("${ob.id} ----   ${ob.n}")

    // using wait function for assigning the values in attributes
    with(ob) {
        id=66
        n="kmk"
    }
    println("${ob.id} ----   ${ob.n}")

}