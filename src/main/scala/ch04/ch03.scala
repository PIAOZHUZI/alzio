package ch04

object ch03 {
  def main(args: Array[String]): Unit = {
    val symbols = Array("<", "-" , ">")

    val counts = Array(2,10,2)

    val paris = symbols.zip(counts) // ("<",2),("-",10)...

    for((s,n) <-paris) println(s*n)
  }
}
