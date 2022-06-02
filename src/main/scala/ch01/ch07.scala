package ch01

object ch07 {

  def main(args: Array[String]): Unit = {
    //    throw new IllegalArgumentException("error")
    try {
      println(root(4))
      println(root(-4))
    } catch {
      case e: Exception => println(e)
    }
  }

  import scala.math._

  def root(x: Double) = {
    if (x >= 0) {
      sqrt(x)
    }
    else {
      throw new IllegalArgumentException("x should not be negative")
    }
  }
}
