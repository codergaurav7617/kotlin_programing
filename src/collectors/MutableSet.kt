package collectors
fun main(){
    var names = mutableSetOf("john","mark","finn")
    names.add("mark")
    println(names)
    names.remove("john")
    println(names)
}