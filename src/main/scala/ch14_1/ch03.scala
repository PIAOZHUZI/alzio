package ch14_1
sealed abstract class Amount2
case class Dollar2 (value : Double) extends Amount2
case class Currency3 (value: Double, unit: String) extends Amount2

object ch03 extends App {

  def show(amt : Amount2)= {
    amt match{
      case Currency3(v, u) => "  I have " + v + " " +u

    }
  }
  println(show(Currency3(1000000,"JPY")))

}
