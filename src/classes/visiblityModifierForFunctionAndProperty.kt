package classes
// outside function
private fun outsideFunction(){
    println("Thi is outside function: -> ")
}

// outside property
var outsideProperty:String="outside"

class Teacher{
    private var onLeave=false
    protected var parkingSlot=1
    internal val school="Gn National"
    //default public
    var name="john"
    //default public
    fun isAvailable() = !onLeave
}
fun main(){
    println(outsideFunction())
    val teacher=Teacher();
   // println("Teacher is on leave: ${teacher.onLeave}")
   // println("Teacher has parking slot: ${teacher.parkingSlot}")
    println("The School is: ${teacher.school}")
    println("Teacher's name is: ${teacher.name}")
    println("Teacher is Available: ${teacher.isAvailable()}")
}