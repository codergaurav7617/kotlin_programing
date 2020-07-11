package collectors
fun main(){
   // map
    val classRank = mapOf(1 to "Sarah",2 to "john",3 to "Finn");
    println("1. Students: ${classRank.values}")
    println("2. Rank: ${classRank.keys}")
    println("3. Finn hs got the rank ${classRank.containsValue("Finn")}")
    println("4. There is 4th rank ${classRank.containsKey(4)}")
    println("5. The student at first rank is: ${classRank.get(1)}")
}