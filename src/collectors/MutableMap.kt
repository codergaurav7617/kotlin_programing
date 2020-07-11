package collectors
fun main(){
   // Mutable map (where can insert delete in these kind of map)
    val classRank = mutableMapOf(1 to "Sarah",2 to "john",3 to "Finn");
    classRank.put(4 , "Sarah")
    classRank.remove(2)
    println(classRank)
}