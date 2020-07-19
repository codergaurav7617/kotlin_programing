package classes
class Student3 private constructor(val name:String="Mark"){
    constructor(firstName:String,secondName:String):this("$firstName $secondName")
}

// just remove the private and see the commented code u will the understand the visibility modifier when we want to restrict the primary constructor

fun main(){
    //val student:Student3= Student3("john")
    val student1:Student3= Student3("john","Doe")
    //println("Name of student is: ${student.name}")
    println("Name of student1 is: ${student1.name}")
}