package ch09_1

import java.io.PrintWriter

object ch04 extends App{

  val out = new PrintWriter("./src/main/scala/ch09_1/"+"numbers.txt")
//src/main/scala/ch09_1/ch04.scala
  for( i <- 1 to 10) out.print("%6d %10.6f \n".format(i, 1.0/i))

  out.close()



}
