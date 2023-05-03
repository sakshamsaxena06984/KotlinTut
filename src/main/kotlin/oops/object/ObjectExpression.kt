package oops.`object`

private class Person{
    object A{
        fun A_fun(){
            println("it is funtion of Object A")
        }
    }
    object B{
        fun B_fun(){
            println("it is function of Object B")
        }
    }
}

fun main() {
    //calling Object function with the class and object combination
    Person.A.A_fun()
    Person.B.B_fun()
}