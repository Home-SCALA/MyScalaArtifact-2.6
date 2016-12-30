package myscalamvn

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldRight("")((a:String,b:String) =>{println("a: " + a + " b: " + b); a+b } )
  
  def main(args : Array[String]) {
    
    println("concat arguments = " + foo(Array("Zara", "Nuha", "Ayan")))
  }

}
