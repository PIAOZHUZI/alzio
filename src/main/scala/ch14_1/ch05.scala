package ch14_1

sealed abstract class TrafficLightColor
case object Red extends TrafficLightColor
case object Yellow extends TrafficLightColor
case object Green extends TrafficLightColor

//Some("Fred") -> Option[String]
//None

object ch05 extends App{

  for(color <- Array(Red,Yellow, Green)){
    println(
        color match{
          case Red => "Stop"
          case Yellow => "hurry up"
          case Green => "Go"
        }
    )
  }
}
