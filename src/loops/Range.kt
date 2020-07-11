package loops
fun main(){

    // use of range in for loops
    println("line 1:")
    for (i in 1..5){
        print(i);
    }
    println("\nline 2:")
    if (4 !in 5..10){
        print("Not there");
    }
    println("\nline 3:")
    for (i in 1 until 5){
        print(i);
    }
    println("\nline 4:")
    for (i in 1..5 step 2){
        print(i);
    }
    println("\nline 5:")
    for (i in 5 downTo 1){
        print(i);
    }

}