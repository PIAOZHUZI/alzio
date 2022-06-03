package ch06

object ch03 {
  import TrafficLightColor._
  def main(args: Array[String]): Unit = {
//    println(TrafficLightColor.Red)
//    println(TrafficLightColor.Yellow)
//    println(TrafficLightColor.Green)
//    println(TrafficLightColor.Green.id)
    println(Red)
    println(Yellow)
    println(Green)
    println(Green.id)
    println(doWhat(Yellow))
    for(c <- TrafficLightColor.values) println(c.id + " " + c)
    TrafficLightColor(0)
    TrafficLightColor.withName(("Red"))
  }

  def doWhat(color : TrafficeLightColor) ={
    if(color == Red) "Stop"
    else if(color == Yellow) "hurry Up"
    else "go"
  }
}

object TrafficLightColor extends Enumeration{
  //val Red, Yellow, Green = Value
  type TrafficeLightColor = Value
  val Red = Value(0)
  val Yellow = Value(10)
  val Green = Value

}
