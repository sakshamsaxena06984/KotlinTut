package basic

fun main(){

    var animal:String="dog"
    when(animal){
        "dog"-> println("animal is dog")
        "elephent"->println("animal is elephent")
        "cat"->println("animal is cat")
        else -> println("unknown animal")
    }

    var result= when(animal){
        "dog"-> "animal is dog"
        "elephent"-> "animal is elephent"
        "cat"-> "animal is cat"
        else -> "unknown animal"
    }
    println("answer of the when statement : $result")

    /**
     * NOTE : when is a replacement of switch statement in KOTLIN
     */
    //when with range
    var num =4
    val numAns=when(num){
        1->"number is one"
        2->"number is two"
        in 3..10 ->" number is lies b/w 3 to 10 including "
        else ->"num is out of range"
    }

    println(numAns)



}