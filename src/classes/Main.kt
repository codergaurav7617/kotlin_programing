package classes
class Student{
    val school:String="Gn National Public School"
    var age:Int=5
    val isTeenager: Boolean
        get() = age>12
    var name:String?=null
        get() = field?:"unknown"
        set(value){
            if (value!=null){
                field=value
            }
        }
}

fun main(){
    // structure of minimal valid classes in kotlin
    val student:Student=Student();
    println("Student is a teenager ${student.isTeenager}")
    student.age=13
    println("Student is a teenager ${student.isTeenager}")
    println("Student name is ${student.name}")
    student.name="john"
    println("Student name is ${student.name}")
}