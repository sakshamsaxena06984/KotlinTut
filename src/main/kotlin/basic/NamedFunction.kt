package basic


fun main(args:Array<String>) {
    //calling function overriding concept
    var a= add1(11,2);
    println("integer type calling : "+a);
    var b= add1(1.1,2.1);
    println("double type calling : "+b);
    var w:Int;
    var n:Int;

    // named argument concept
    println("calling function by using named argument way : "+ add1(num1=2,num2=1));

    var fnn= ::add
    println("using function tag concept : "+fnn(2,3))

}


fun add1(num1:Int,num2:Int):Int{
    return (num1+num2);
}
fun add1(num1: Double,num2: Double):Double{
    return (num1+num2);
}