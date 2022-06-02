package ch02


object ch02 {
  def main(args: Array[String]): Unit = {
    val a  = Array(1,1,2,3,5,8,13,21,34,55)
    for(i <- 0 until a.length) {
//    println(i+ ": " +a(i))
//    0 until( a.length)
//    0 until( a. length, 2) // 2,4,6,으로 방문
//    (0 until( a.length)).reverse
    }
    for ( elem <- a){
      println(elem)
    }
  }
}
