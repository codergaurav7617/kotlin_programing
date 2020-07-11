package array
fun main(){
    // String template
    val flatNumber : Int =23;
    val address : String = "Tower 2 flat no. " + flatNumber;
    println(address);

    val flatNumber1 : Int =23;
    var address1 : String = "Tower 2 flat no. $flatNumber";
    println(address1);

    val name : String = "john Doe";
    println("name is ${name.length} character long");
}