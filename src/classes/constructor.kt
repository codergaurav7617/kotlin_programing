package classes

class Student1 constructor(firstName: String="Mark"){    // this is primary constructor.
    val firstName: String
    var lastName:String?=null

    init{     // we can have multiple init method
        println("Init block is called -> ")
        this.firstName=firstName
    }

    constructor(firstName: String,lastName:String) : this(firstName){   // Secondary constructor
        println("Secondary constructor is called -> ")
        this.lastName=lastName
    }
}

fun main(){
    //val student:Student1=Student1("John")
    val student:Student1= Student1("john","Doe")
    println("Name of student is: ${student.firstName} ${student.lastName}")
}