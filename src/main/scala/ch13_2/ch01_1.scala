package ch13_2

import scala.io.Source
import scala.math.pow

object ch01_1 extends App{

  def numsFrom(n: BigInt):Stream[BigInt] = n #:: numsFrom(n+1)
  val tenOrMore = numsFrom(10)

  println(tenOrMore)

  println(tenOrMore.tail.tail)

  val squares = numsFrom(1).map( x => x * x)
  println(squares)
  println(squares.take(5).force)


  val words = Source.fromFile("...").getLines.toStream
  words
  words(5)

//  val powers = (0 until 1000).view.map(pow(10, _))
//  println(powers(100))//pow(10,100)
//  println(powers(100))//pow(10,100)

  var powers = ( 0 until 1000).view.map(n=>
    {
      println(n)
      pow(10,n)
    }
   )

  powers(100)
  powers(100)

//  println((0 to 1000).map(pow(10, _)).map(1/ _))
//  println((0 to 1000).view.map(pow(10, _)).map(1 / _).force))


}
