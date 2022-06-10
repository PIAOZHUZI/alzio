package ch11

import scala.language.postfixOps
import scala.math.Numeric.BigDecimalIsFractional.sign
import scala.math._

object ch01 extends App {


  val a = scala.math.sqrt _
  println(a(2))

  val`val` = 42
  println(`val`)


  1 to 10
  1.to(10)
  1 -> 10
  1 .->(10)

//  class Fraction(n:Int , d: Int){
//    private val num : Int = if( d==0 ) 1 else n * sign(d) / gcd(n,d)
//    private val den : Int = if( d==0 ) 0 else d * sign(d) / gcd(n,d)
//
//    def sgn(a:Int)
//    def gcd(a:Int, b:Int)
//  }

//  1 toString
//  1.toString()

  val b =42
  b.unary_-
  println(b)

  var c:Any =3
  c ->= 4 //c = c->4
  //<= , >=, != 할당 연산자가 아님 비교연산자임
  //=(== , ===, =/= 할당 연산자 아님
  // a
  val d = scala.collection.mutable.Set(1,2,3)
  d += 4

  1 + 2 * 3
  // * / % , +-, :, <>, != ,& , ^ , | ,
  // + ->
//  1 to 10 toString()
//  (1 to 10)toString()

  17 - 2 - 9
  (17-2) - 9


  //예외
  //콜론 (:)
  //할당, ::
  1 :: 2 :: Nil
  1 :: (2 :: Nil)


}
