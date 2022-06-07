package ch09_2

object ch01 extends App {

  val numPattern = "[0-9]+".r
  val wsnumwsPattern = """\s+[0-9]+\s+""".r

  for(matchString <- numPattern.findAllIn("99 bottles, 98bottles"))
    println(matchString)

  val maths = numPattern.findAllIn("99 bottles, 98 bottles").toArray

  val m1 = wsnumwsPattern.findFirstIn("99 bottles, 98 bottles")

  println(m1)

  println(numPattern.findPrefixOf("99 bottles, 98 bottles"))

  println(numPattern.replaceFirstIn("99 bottles, 98 bottles","XX"))
  println(numPattern.replaceAllIn("99 bottles, 98 bottles","XX"))

  val numPattern2 = "([0-9]+) ([a-z]+)".r
  val numPattern2(num,item) = "99 bottles"

  for(numPattern2(num, item) <- numPattern2.findAllIn("99 bottles, 98 bottles"))
    println(item + ": " + num)
}
