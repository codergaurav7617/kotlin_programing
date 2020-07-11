package loops
fun main(){
    //For loop
    var names = arrayOf("john","jack","frank");

    // first way.
    println("First way.")
    for (name in names){
        println(name);
    }

    // Second way.
    println("Second way.")
    for (indices in names.indices){
        println(names[indices]);
    }
}