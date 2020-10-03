fun main() {
   val nameList=arrayListOf("Ayse","Ali")
   println(nameList[0])
   println(nameList.get(1))
   nameList.add("Fatma")
   nameList.add("Ece")
   println(nameList.get(2))
   println(nameList.get(3))
   
   val numberList=arrayListOf<Int>()
   numberList.add(10)
   numberList.add(20)
   println(numberList[0])
   println(numberList[1])
   
   val complexList=arrayListOf<Any>()
   complexList.add("Kerem")
   complexList.add(30)
   complexList.add(5.5)
   println(complexList[0])
   println(complexList[1])
   println(complexList[2])
   
   val doubleArrayList=ArrayList<Double>()
   doubleArrayList.add(1.3)
   doubleArrayList.add(6.8)
   println(doubleArrayList[0])
   println(doubleArrayList[1]) 
}