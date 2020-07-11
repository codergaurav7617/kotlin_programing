package collectors
fun main(){
    val names = mutableListOf("john","Mark","Finn")
    names.add("Sarah")
    println(names)
    names.removeAt(1)
    names.remove("Mark")
    println(names)
    names.set(0,"Michale")
    names[1]="james"
    println(names)
    names.clear()
    println(names)
}