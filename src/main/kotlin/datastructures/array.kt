package datastructures

fun main() {

    //declaration way of array integer type
    var arr= arrayOf<Int>(1,2,3,4);
    //printing array
    for (i in arr){
        println("value of arr : "+i)
    }

    //printing array with values and index
    for ((i,e) in arr.withIndex()){
        println("index of arr $i element in array $e")
    }

    //getting the value in array
    println("value : "+arr[1]);
    //getting the index of array
    println("index : "+arr.get(3));
    //setting the value in array with particular possition
    arr.set(0,11);
    for (i in arr){
        print("$i ")
    }
    println()
    //getting the size of array
    println("size of the array : "+arr.size);
}