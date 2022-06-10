package ch12

import scala.math.{ceil, sqrt}

object ch02 extends App {

  def valueAtOneQuarter(f: (Double)=> Double) = f(0.25)

  println(valueAtOneQuarter(ceil _)) //
  println(valueAtOneQuarter(sqrt _)) //0.5 * 0.5

}
