package ch14_1

case class Currency2(value : Double, unit : String)

object ch02 extends App{

  val amt = Currency2(1000.0 , "EUR")
  amt match {
    case a Currency2 u => println(a + "  " + u)
  }
  val lst = List(1,7,2,9)
  lst match {
    case h :: t => println(h+ t.length)

  }
  //Nil ::
  //:: unapply(result)

}
