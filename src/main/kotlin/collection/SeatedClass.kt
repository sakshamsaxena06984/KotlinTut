package collection

sealed class Tile
class Red(val type:String,val points:Int):Tile()
class Blue(val points: Int):Tile()

fun main() {
    val tile=Red("Mushroom",536)
    val tile1=Blue(54)
    println("value of Red & Blue class --> ${tile.points}  && ${tile1.points}")

}