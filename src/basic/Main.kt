package basic

fun main(){
    /*
    val name ="joan";
    var name1 = "gaurav";
    name1 = "piyush";
    println(name);
    println(name1);
     */

    // null safety
    val name : String? = null;

    //safe call operator ?.
    println(name?.length);

    //Elvis operator
    println(name?.length ?: 0);

}