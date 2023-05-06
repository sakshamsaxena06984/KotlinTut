package functions

fun String.formattedString():String{
    return "==================\n$this\n=================="
}
fun main() {
    println("Hello World".formattedString())
}