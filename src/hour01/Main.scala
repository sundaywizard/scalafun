package hour01

object Main extends App {
  
  println("Idiomatic Scala, almost")
  
  val sum = sumOverListOfInts(13 :: 14 :: 15 :: Nil)
  println(sum)

  def sumOverListOfInts(ns: List[Int]): Int = {
    var acc = 0
    for (n <- ns) {
      acc = acc + n
    }
    acc
  }
}