package ch13

import java.awt.Color
import scala.collection.SortedSet

object ch01 extends App{

  val coll = Array(1,7,2,9)
  val iter = coll.iterator
  while(iter.hasNext){
    println(iter.next())
  }

  Iterator(0xFF, 0xFF00, 0xFF0000).foreach(println _)

  Set(Color.RED, Color.GREEN, Color.BLUE).foreach( println _)

  Map(Color.RED -> 0xff0000, Color.GREEN -> 0xff00 , Color.BLUE -> 0xFF).foreach(println _)

  SortedSet("Hello" , "World").foreach(println _)


}
