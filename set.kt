fun main() {
  val mySet=setOf<Int>(1,2,2,3,4,5,5)
  println(mySet.size)
  
  mySet.forEach{
      println(it)   
  }
  
  val nameSet=HashSet<String>()
  nameSet.add("Ali")
  nameSet.add("Ali")
  nameSet.add("Ali")
  nameSet.add("Demir")
  
   nameSet.forEach{
      println(it)   
  }
}