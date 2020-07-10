package function
fun main(){
    // Default argument
     printUserName1("john");
    printUserName1("john","frost");
}
fun printUserName1(firstName:String,lastName:String = "Doe"){
     println("The name is: $firstName $lastName");
}