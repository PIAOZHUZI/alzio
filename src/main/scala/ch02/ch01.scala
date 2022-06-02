package ch02

object ch01 {
  import scala.collection.mutable.ArrayBuffer

  def main(args: Array[String]): Unit = {
    val nums = new Array[Int](10)
    val a = new Array[String](10)
    val s  = Array("Hello", "World")
    s(0) = "Goodbye"
//      s(0)

  val b = ArrayBuffer[Int]() // 빈 배열 버퍼 선언
    b += 1
    //ArrayBuffer(1) add(1)
    b += (1,2,3,5)
    //1,1,2,3,5
    b++=Array(8,13,21)
    //++= ==> (1,1,2,3,5,8,13,21)

    b.trimEnd(5)
    //마지막 5개 제거 1,1,2

    b.insert(2,6)
    //1,1,6,2

//    b insert(2,  (7,8,9))
    b.remove(2)
    //1,1,7,8,9,
    b.remove(2,3)
    //1,1,2

//    b.toArray
//    toBuffer


  }
}
