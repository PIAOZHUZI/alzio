package ch14

object ch01_3 extends App{

  for(obj <- Array(42, "42", BigInt(42), BigInt, 42.0)){
    var result = obj match {
      case x: Int => x
      case s: String => Integer.parseInt(s)
      case _: BigInt => Int.MaxValue
      case BigInt => -1
      case _ => 0
    }
    println(result)
  }

  for(obj <- Array(Map("Fred"->42),Map(42->"Fred"),Array(42),Array("Fred"))){
    val result = obj match{
      case m : Map[String,Int] => "It's a Map[String,Int]"
      case m : Map[_,_] => "It's a map"
      case a: Array[Int] => "It's an Array[Int]"
      case a : Array[_] => "It's an array of something other than Int"
    }
    println(result)
  }
}
