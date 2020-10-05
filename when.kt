fun main() {
  var grade=60
  var message=""
    
  when(grade){
      60 -> message="CC"
      70 -> message="CB"
      80 -> message="BB"
      90 -> message="BA"
      else -> message="AA"
  }
  
  println(message)
}