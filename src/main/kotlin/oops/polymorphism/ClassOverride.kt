package oops.polymorphism

// it is Shape Class
open class Shape(){
    open fun area():Double{
        return 0.0;
    }
}
//it is Circle Class
class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius;
    }
}
// it is Square Class
class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side*side;
    }
}

//function for calculating all type of Area function
fun CalculatingArea(Shapes:Array<Shape>){
    for(s:Shape in Shapes){
        println("AREA: ${s.area()}")
    }
}
fun main() {
    val area_circle:Shape=Circle(4.0);
    val area_square:Shape=Square(4.0);
//    println("Area of Circle: ${area_circle.area()}")
//    println("Area of Square: ${area_square.area()}")

    val shapes:Array<Shape> = arrayOf(area_square,area_circle);
    println("=========== function calling =================")
    CalculatingArea(shapes)
}