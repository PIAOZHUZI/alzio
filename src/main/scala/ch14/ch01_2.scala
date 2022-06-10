package ch14

object ch01_2 extends App{

  for (ch <- "+-3!"){
    var sign = 0
    var digit = 0

    ch match{
      case '+' => sign = 1
      case '-' => sign = -1
      case _ if Character.isDigit(ch) => digit = Character.digit(ch ,10)
      case _ => sign = 0

    }

    println(ch + " " + sign + " " + digit)
  }
  val str = "+-3!"
  for (i <- 0 until(str.length)){
    var sign = 0
    var digit = 0

    str(i) match{
      case '+' => sign = 1
      case '-' => sign = -1
      case ch if Character.isDigit(ch) => digit = Character.digit(ch ,10)
      case _ =>

    }
    println(str(i) + " " + sign + " " + digit)
  }

  import scala.math._

  val x = random()
  x match {
    case Pi => "It's Pi"
    case _ => "It's not Pi"
  }
  import java.io.File._

  str match {
    case `pathSeparator` => "It's the path separator"
    case _=> "It's not the path separator"
  }
}
