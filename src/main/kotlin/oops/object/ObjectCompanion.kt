package oops.`object`

private class Person1{
    companion object A{
        fun a_fun(){
            println("it is Person1 - object A")
        }
    }
    object B{
        fun b_fun(){
            println("it is Person2 - object B")
        }
    }
}

fun main() {
    Person1.a_fun()// now, calling object function without using object name
    Person1.B.b_fun()
}