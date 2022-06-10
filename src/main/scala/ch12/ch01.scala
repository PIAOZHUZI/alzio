package ch12

import scala.math.ceil


object ch01 extends App {


  val num = 3.14
  val fun = ceil _

  println(fun(num))

  Array(3.14,1.42,2.0).map(fun)

  (x:Double) => 3*x
  val triple = (x: Double) => 3 * x
  //def triple (x: Double) = 3 * x

  Array(3.14,1.42,2.0).map((x :Double) => 3 * x)
  Array(3.14,1.42,2.0).map{
    (x: Double) => 3 * x
  }


}


