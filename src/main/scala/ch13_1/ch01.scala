package ch13_1

import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable._

object ch01 extends App{

//  Set(2,0,1) + 1

  for(i <- Set(1,2,3,4,5,6)) print(i + " ")

  val weekdays = scala.collection.mutable.LinkedHashSet("Mo", "Tu", "We", "Th", "Fr")

  collection.immutable.SortedSet(1,2,3,4,5,6)
  //RedBlackTree


  val digits = Set(1,7,2,9)

  digits contains(0) //false
  Set(1,2) subsetOf digits //true

  // |, &, &~

  val primes1 = Set(2,3,5,7)
  println(digits union primes1)
  println(digits & primes1)
  println(digits-- primes1)
//+:,:+
  println(Vector(1,2,3):+5)
  println(1+:Vector(1,2,3))
  val numbers = ArrayBuffer(1,2,3)
  println(numbers += 5 )
  //:+=
  var numbers2 = Set(1,2,3)
  numbers2 += 5
  var numberVector = Vector(1,2,3)
  numberVector :+=5

  println(Set(1,2,3) -2)

  println(numbers ++ Vector(1,2,7,9))
//  println(numbers -- Vector(1,2,7,9))
// :+, +:
  // +
  //-
  // ++, --
  // :: , ::: ,+= ++= --+ --=
  // ++ & --
  // ++:, +=: ,++=: (사용 자제 )



}
