package collection

enum class Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THUSDAY,
    FRIDAY,
    SATURDAY
}

enum class Day1(var instance:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURESDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    //function inside the methode
    fun printLevelName(){
        println("instance : $this")
    }
}

fun main() {
    var a=Day.FRIDAY
    println("enum instance -> $a ")

    val d=Day1.SUNDAY
    println(d.printLevelName())
    println(d.instance)
    for(i in Day1.values()){
        println("--------> ||  $i")
    }
}