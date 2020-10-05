fun main() {
  val numbers=arrayOf(10,20,30,40,50) 
  for(num in numbers){
      println(num)
  }
  
  for(index in numbers.indices){
      println(index)
  }
  
  for(i in 0..5){
      println(i)
  }
  
  numbers.forEach{
     println(it) 
  }
      
}