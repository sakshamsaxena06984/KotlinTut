package basic

fun main(){
    var a:Int=5
    var b:Int=6
    if(a>b){
        println("$a is greator than $b")
    }else if(a<b){
        println("$b is greator than $b")
    }
    else{
        println("$a and $b is equal")
    }

    //---------- assignment of else if leader result

    var result=  if(a>b){
        "$a is greator than $b"
    }else if(a<b){
         "$b is greator than $b"
    }
    else{
          "$a and $b is equal"
    }

    println(result)

    /**
     * NOTE : in kotlin ternary operator is aviavle in if-else-if
     */
    var ans= if (5%2==0) "5 is even number" else "5 is not even number"
    println(ans)
}