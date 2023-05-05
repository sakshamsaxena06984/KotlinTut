package collection

/**
 * in kotlin, we have two type of map
 * 1-> Mutable
 * 2-> Immutable
 */

fun main() {
    //mutable
    var stu= mutableMapOf<Int,String>()
    stu.put(1,"Jhon")
    stu.put(2,"skd")
    println(stu.get(2))
    for ((key,value ) in stu){
        println("$key and $value")
    }

    stu[1]="sn"

    // immutable
    var stu1= mapOf<Int,String>(1 to "hello",2 to "world")
    println(stu1)
}