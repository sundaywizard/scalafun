package hour01;

import scala.Array;
import scala.collection.immutable.List;

// no methods of "object" have "this" pointer
object Hello {
  
  // params are final
  def main(args: Array[String]): Unit = {
    
    // args = null;
    
    System.out.println("Hello, Scala");
    
    val sum: Int = sumOverListOfInts(13 :: 14 :: 15 :: Nil);
    System.out.println(sum);
  }
  
  def sumOverListOfInts(ns: List[Int]): Int = {
    var acc: Int = 0;
    for (n: Int <- ns) {
      acc = acc + n;
    }
    return acc;
  }

}