open class Person {
    open fun sayHello(){
        println("Hello Everyone")
    }
}
class Student: Person() {
    fun sayHelloToFriends(){
        super.sayHello()
    } 
    override fun sayHello(){
        println("Hello Students")
    }  
}
fun main() {
   //Dynamic Polymorphism
   val person=Person()
   person.sayHello()
   
   val student=Student()
   student.sayHello()
   student.sayHelloToFriends()
   
}
