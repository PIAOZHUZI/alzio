package ch13

object ch03 extends App{

  val vec = (1 to 1000000) map (_ % 100)
  val lst = vec.toList

  def time[T](block :  => T) = {
    val start = System.nanoTime
    val result = block
    val elapsed = System.nanoTime - start
    println(elapsed + "nanoseconds")
    result
  }

  time(vec(500000))
  time(lst(500000))

}
