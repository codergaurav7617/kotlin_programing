package collectors

fun main(){
    // List
    val names = listOf("john","Mark","Sarah","Finn");
    println("1. The size of list is : ${names.size}")
    println("2. Second item in the list is ${names.get(1)}")
    println("3. Second item in the using the index operator is : ${names[1]}")
    println("4. Finn is at the index ${names.indexOf("Finn")} in the list")
}