class Calculation {
   fun multiply(a:Int, b:Int) : Int {
       return a*b
   }
   fun multiply(a:Int, b:Int, c:Int) : Int {
       return a*b*c
   }
}
fun main() {
   //Static Polymorphism
   val calculation=Calculation() 
   println(calculation.multiply(2,5))
   println(calculation.multiply(2,5,3))
}
