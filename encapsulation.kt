class Person(name: String, age: Int){
    var name: String ? = name
    private set 
    get

    var age: Int ? = age
    set 
    get
}
fun main() {
    val person = Person("Ali",20)
    println(person.name)
    person.name = "Ayse" //cannot assign to 'name': the setter is private in 'Person'
    println(person.name) 

    println(person.age)
    person.age = 25 
    println(person.age) 
}