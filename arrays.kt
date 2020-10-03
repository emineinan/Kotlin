fun main() {
    val firstElement="Ali"
    val myArray=arrayOf(firstElement,"Ayse", "Zeynep")
    println(myArray[0])
    println(myArray.get(1))
    myArray[2]="Mustafa"
    println(myArray.get(2))
    myArray.set(0,"Elif")
    println(myArray.get(0))
    
    val myNumbers=doubleArrayOf(1.5,2.3,3.7)
    println(myNumbers.get(2))
    
    val complexArray=arrayOf("Ece",3,true,7.5,false)
    println(complexArray[0])  
}