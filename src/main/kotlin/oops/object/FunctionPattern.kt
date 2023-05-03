package oops.`object`

import java.lang.management.ManagementFactory

class Pizza private constructor(val type:String,val topping:String){
    companion object factor{
        fun create(pizzafactory:String):Pizza{
            return when(pizzafactory){
                "tomato" -> Pizza("tomato","paneer, onion")
                "pappy_paneer" -> Pizza("onion","paneer, musroom,tomato")
                else -> Pizza("combinaton","xyz.................")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type='$type', topping='$topping')"
    }


}

fun main() {
    var p=Pizza.factor.create("tomato")
    println(p.toString())

    var Pizza1=Pizza.create("ksdk")
    println(Pizza1.toString())

    var Pizza2=Pizza.create("kmds")
    println(Pizza2.toString())

}


