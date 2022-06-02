package ch02

object ch04 {
  import scala.collection.mutable.ArrayBuffer

  def main(args: Array[String]): Unit = {
    Array(1,7,2,9).sum
    //19
    Array(1,7,2,9).min
    Array(1,7,2,9).max

    val b  = ArrayBuffer(1,7,2,9)
    val bSorted = b.sorted

    println(bSorted)
  }
}
