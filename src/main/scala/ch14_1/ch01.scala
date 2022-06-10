package ch14_1
abstract class Amount
case class Dollar (value : Double) extends Amount // var -> val new 없이도 object 생성 가능 패턴 매치 제공
case class Currency(value : Double, unit:String ) extends Amount
case object Nothing extends Amount

object ch01 extends App{

//  import scala.collection.JavaConverters.propertiesAsScalaMap
//  for((k,v) <- System.getProperties()){
//    println(k + "->" + v)
//  }

//  for((k,"") <- System.getProperties())
//    println(k)
//
//  for((k,v) <- System.getProperties() if v == ""){
//    println(k)
//  }

  for(amt <- Array(Dollar(1000.0), Currency(1000.0 ,"EUR"), Nothing)){
    val result = amt match {
      case Dollar(v) => "!" + v
      case Currency(_, u) => " oh noes, I got " + u
      case Nothing => ""
    }
    println(amt + ": " + result)
  }

}
