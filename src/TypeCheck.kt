fun main(){
    //Type Checking
    val name:Any = "john";
    if (name is String){
        println(name.length);
    }
}