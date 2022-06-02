package ch01

object ch03 {
  def main(args: Array[String]): Unit = {

    println(abs(3))
    println(abs(-3))

    println(fac(10))
    println(reFac(10))
  }


  def abs(x: Double) = if(x >= 0 ) x else -x

  def fac(n: Int)={
    var r = 1
    for(i <-1 to n)r = r*i
    r
  }

  def reFac(n : Int): Int ={
    if(n <= 0) 1 else n*reFac(n-1)
  }
}
