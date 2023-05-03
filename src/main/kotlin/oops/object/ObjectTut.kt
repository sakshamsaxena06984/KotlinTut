package oops.`object`

object B{
    var p:Int=4
    fun test(){
        println("it is the function of Object B!")
    }
}
//creating interface
interface f{
   abstract fun clone()
}
fun main() {
    println(B.p)
    B.test()
    //anonymous object
    var t=object {
        var k:Int=4
        fun k_test(){
            println("it is Anonymous Object!")
        }
    }

    println("Anonymous Object :: ${t.k} ")
    t.k_test()

    // interface, who implementing the interface
    var interface_object=object: f {
        override fun clone(){
            println("object interface calling !")
        }

    }

}