package function
fun main(){
    val result : Int =(addNumbers(4,5));
    println(result)
    printUserName("john");
}

fun addNumbers(x:Int,y:Int):Int{
    return x+y;
}

fun printUserName(name : String){
    println(name);
}