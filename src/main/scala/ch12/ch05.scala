package ch12

object ch05 extends App{

  def mul(x:Int, y:Int) = x*y
  def mulOneAtTime(x:Int) = (y:Int) => x*y

  println(mulOneAtTime(6)(7))

  def mulOneAtTime2(x:Int)(y:Int) = x*y

  val a = Array("Hello", "World")
  val b = Array("hello", "world")

  a.corresponds(b)(_.equalsIgnoreCase(_))
  // def corresponds[B](that : Seq[B])(p:(A,B)=>Boolean):Boolean


}
