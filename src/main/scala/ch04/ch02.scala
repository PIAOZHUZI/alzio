package ch04

object ch02 {

  import java.awt.font.TextAttribute._
  import scala.collection.JavaConverters.{mapAsJavaMap, mapAsScalaMap, propertiesAsScalaMap}
  import scala.jdk.CollectionConverters._

  def main(args: Array[String]): Unit = {
//    해당 회차는 스칼라 버전의 상향으로 지원 중단되었습니다.

//    val scores : collection.mutable.Map[String,Int] =
//      new java.util.TreeMap[String,Int]().asScala.map()
//    scores += ("Alice" -> 10, "Bob"-> 3, "Cindv" -> 8)
//
//    val props: scala.collection.Map[String,String]= System.getProperties()
//
//    println(scores)
//    println(props)
//
//    val attrs = Map(FAMILY -> "serif", SIZE -> 12)
//    val font = new java.awt.Font(attrs)

//    (1,3.14,"Fred") //Tuple3[Int,Double,java.lang.String]
//    val t = (1,3.14,"Fred") // 0아니고 1부터 시작.
//    val seconds = t._2//3.14
//
//    val(first, seconds, third) = t
//    println((first, seconds, third) )
//    //1,3.14,Fred
//    val (first,seconds,_) = t
//    println((first,seconds))
//    //1,3.14


    println("New York".partition(_.isUpper)) // ("NY","ew ork")
    //조건 만족 , 불만족한 조건으로 나뉘어서 나옴






  }
}
