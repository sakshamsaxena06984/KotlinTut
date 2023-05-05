package exception_handling

fun main() {
    var arr= arrayOf(1,2,3)
    try {
        var ele=5/0
        println("value of ele : $ele")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("array out of bound exception : $e")
        throw e;
    }
    catch (e: Exception){
        println("it is the common catch block")
        throw e
    }finally {
        println("it is -------------------- final block -------------------")
    }
}