package collection

/**
 * in kotlin, we have two type of List
 * 1-> Mutable : can be modified
 * 2-> Immutable : can not be modified
 */

fun main() {

    // it is Immutable List
    var nums= listOf<Int>(2,3,4)
    println(nums.indexOf(2))
    println(nums.contains(3))
    println(nums.contains(10))

  // it is Mutable List
    var nums1= mutableListOf<Int>(1,23,3,4)
    println(nums1.indexOf(3))
    nums1[3]=111
    println(nums1.indexOf(3))


}

