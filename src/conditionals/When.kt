package conditionals
fun main(){
    // when
    val rating =2
    val result = when (rating){
          5 -> "High"
        3,4 -> "Good"
        1,2 -> "Poor"
        else -> {
            println("poor rating");
            "zero"
        }
    }
    println("The rating is $rating")
}

