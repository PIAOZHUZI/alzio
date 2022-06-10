package ch13_2

object ch01_2 extends{

  import scala.collection.JavaConverters.propertiesAsScalaMap
//  val props : scala.collection.mutable.Map[String, String] = System.getProperties()
//  println(props)
//  props("com.alzio.scala") = "impatient"
//  println(props)
//  System.getProperty("com.alzio.scala")
//  val scores = new scala.collection.mutable.HashMap[String,Int] with
//  scala.collection.mutable.SynchronizedMap[String,Int]
  val coll = (1 to 1000000).map(BigInt(_))
  coll.sum // par 는 사라짐
  coll.count(_%2 ==0)

  for(i <- (0 until(100))) print(i + " ")


}
