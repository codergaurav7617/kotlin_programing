fun main(){
    //Type Casting
    val name:Any = "john";
    val name1:String = name as String;
    println(name1);

    val x:Int =7;
   // var z:Long = x as Long; // error will come can't type cast the variable

    // if u want to avoid exception
    var z:Long? = x as? Long;
    println(z);

}