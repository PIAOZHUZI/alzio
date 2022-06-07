package ch09_1

import scala.io.Source

object ch02 extends App{

//  val source1 = Source.fromURL("http://www.alzio.com","UTF-8")
//  println(source1.mkString.length+ " bytes")
//
  val source2 = Source.fromString("Hello, World!")
  println(source2.mkString.length() + " bytes")


  println("What is your name ? ")

  val source3 = Source.stdin
  println("Hello, "+ source3.getLines.next)

  
}
