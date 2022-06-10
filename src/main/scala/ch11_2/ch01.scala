package ch11_2

object ch01 extends App{

  val Number(n) = "1729"

  println(Number.unapply("5897"))

  val author = "alzio van der Capture"

  author match{
    case Name(first, last @ IsCompound()) => println(last.split("\\s+").length)
    case Name(first, last) => println(1)
  }

}

object Number {
  def unapply(input : String) : Option[Int] =
    try{
      Some(Integer.parseInt(input.trim))
    }catch{
      case ex : NumberFormatException => None
    }
}

object IsCompound{
  def unapply(input: String) = input.contains(" ")
}
object Name {
  def unapply(input : String) = {
    val pos = input.indexOf(" ")
    if (pos == -1) None
    else Some((input.substring(0,pos), input.substring(pos+1)))
  }
}