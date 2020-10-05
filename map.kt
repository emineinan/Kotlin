fun main() {
  val mySet=setOf<Int>(1,2,2,3,4,5,5)
  val caloriMap=hashMapOf<String, Int>()
  caloriMap.put("Apple",100)
  caloriMap.put("Banana", 70)
  caloriMap.put("Egg",150)
  println(caloriMap.get("Apple"))
  println(caloriMap.get("Banana"))
  println(caloriMap.get("Egg"))

  val myMap=HashMap<String, String>()
  myMap.put("Key","Value")
  println(myMap.get("Key"))

  val newMap=hashMapOf<Int, Int>(1 to 10, 2 to 20)
  println(newMap.get(1))
  println(newMap.get(2))
}