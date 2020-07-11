package conditionals
fun main(){
 // if else condition
    var discount = 0
    val price = 80
    if (price > 50){
        discount=10;
    }else{
        discount=3;
    }
    println(discount);

    discount = if (price > 50) 10 else 3
    println(discount);
}