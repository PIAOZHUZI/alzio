package ch14_1
//abstract class Amount
//case class Dollar (value : Double) extends Amount // var -> val new 없이도 object 생성 가능 패턴 매치 제공
//case class Currency(value : Double, unit:String ) extends Amount
//case object Nothing extends Amount

object ch01_1 extends App{

  val amt = Currency(29.95,"EUR")
  val price = amt.copy(value = 19.95) // currency (19.95, eur)

  println(price)
  println(amt.copy(unit = "CHF")) //currecy (29.95,chf)




}
