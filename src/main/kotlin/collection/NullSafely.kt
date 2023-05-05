package collection

fun main() {
    var namemo:String?=null  //here, we are using ?= operator for null safely
    println("value of NULL assign variable : $namemo")

    //using any existing function over the null assign variable => ?.
    println(namemo?.toString())
    println(namemo?.toUpperCase())

    //let -> keywords
    namemo.let {
        println("Line1 for null safely variable")
        println("Line2 for null safely variable")
        println("Line3 for null safely variable")

    }

    // Elvis operator
    val ans=namemo?:"it is null "
    println("value of ans : $ans")

    val ans1=namemo!!.toUpperCase()
    println("value of ans1 : $ans1")
}