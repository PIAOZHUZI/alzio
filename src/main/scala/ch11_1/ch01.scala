package ch11_1

import scala.collection.mutable

object ch01 extends App {

  val scores = new mutable.HashMap[String, Int]

  scores("Bob") = 100
  //scores.update("Bob",100)

  val bobsScore =scores("Bob")
  //scores.apply("Bob")

  val author = "Cay Alzio";
  val Name(first,last) =author

  println(first)
  println(last)
  println(Name.unapply(author))
  println(Name.unapply("Anonymous"))

  case class Currency(value: Double, unit:String)
  val amt = Currency(29.95 ,"EUR")
  amt match {
    case Currency(amount, "USD") => println("$"+amount)
    case Currency(amount, "EUR") => println("!"+amount)
  }

}

object Name {
  def unapply(input : String) = {
    val pos = input.indexOf(" ")
    if (pos == -1) None
    else Some((input.substring(0,pos), input.substring(pos+1)))
  }
}
