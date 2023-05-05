package lambdas

fun main() {

    // it is single line lambda function
    var lam={x:Int,y:Int->x+y}
    println("calling way lambda function : ${lam(1,50)}")

    var multilineLam={
        println("Hello World in LAMBDA")
        var a=5+5
        "hello world"
        2
    }
    println("calling multilineLam function: ${multilineLam()}")

    var ansss:(Int)->Int={it+it}
    println(ansss(5))
}