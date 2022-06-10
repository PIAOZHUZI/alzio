package ch13_2

import scala.language.postfixOps

object ch01 extends App{

  val prices = List(5.0, 20.0, 9.95)
  val quantities = List(10,2,1)

  println(prices zip quantities)

  println((prices zip quantities) map { p=> p._1 * p._2})

  println(((prices zip quantities) map { p=> p._1 * p._2}) sum)

  println(List(5.0 , 20.0 , 9.95) zip List(10,2))

  println(List(5.0 , 20.0 , 9.95) zipAll (List(10,2),0.0,1))

  println("Scala".zipWithIndex)

  println("Scala".zipWithIndex.max)
  println("Scala".zipWithIndex.max._2)

  val iter  = ( 1 to 10 ).sliding(3)
//  println(iter.length)
//  println(iter.hasNext)

//  while(iter.hasNext){
//    println(iter.next())
//  }
//  for(elem <- iter){
//    println(elem)
//  }
  iter.toArray
  iter.toIterable
  
}
