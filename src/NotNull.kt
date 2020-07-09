/*
    1-types :
      a- Nullable
      b- NotNullable
    2 - Nullable
       ?. , !!.
       ?: (Elvis operator just like ternary operator for is else condition)
 */
fun main(){
    // not null assertion operator !!.
  printNameLength("john","Doe");
}

fun printNameLength(firstname:String?,lastName:String?){
    if (firstname != null){
        // not null assertion operator !!.
        println("Name ${firstname.length} ${lastName!!.length}")
    }
}