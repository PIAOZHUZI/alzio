package ch14

object ch01_5 extends App {

  var arr = Array(0, 1)
  arr match {
    case Array(0, x) => x

  }
  Array.unapplySeq(arr)

  val pattern = "([0-9]+) ([a-z]+)".r
  var result = "99 bottles" match {
    case pattern(num, item) => (num.toInt , item)
  }
  println(result)
  pattern.unapplySeq("99 bottles")

}
