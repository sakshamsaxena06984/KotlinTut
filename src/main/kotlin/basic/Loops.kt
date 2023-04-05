package basic

fun main(){
    //while loop

    var num=5
    while(num>0){
        println("value of number is $num")
        num--
    }

    //do-while
    num=5
    do {
        println("in do-while ,value of number is $num")
        num--
    }while (num>0)

    // for loop
    for(i in 1..5){
        println("in first loop, value of $i")
    }

    for (i in 1..5 step 2){
        println("in second loop, value of $i")
    }

    for(i in 1 until 4){
        println("in third loop, value of $i")
    }

    for(i in 10 downTo 5){
        println("in fourth loop, value of $i")
    }
}